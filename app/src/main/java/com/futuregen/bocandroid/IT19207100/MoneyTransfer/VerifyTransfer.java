package com.futuregen.bocandroid.IT19207100.MoneyTransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.futuregen.bocandroid.Database.DBHandler;
import com.futuregen.bocandroid.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class VerifyTransfer extends AppCompatActivity {
    String acname, narrative , myname;
    int acno, amount , myno;

    TextView payable, description, date, Toname, Tono  , Myno , Myname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_transfer);

        Button change = findViewById(R.id.button2);
        Button confirm = findViewById(R.id.confirm);
        payable = findViewById(R.id.payable);
        description = findViewById(R.id.disc);
        date = findViewById(R.id.date);
        Toname = findViewById(R.id.tname);
        Tono = findViewById(R.id.tno);
        Myno = findViewById(R.id.mno);
        Myname = findViewById(R.id.mname);


        getData();


        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent serviceIntent = new Intent(VerifyTransfer.this, TransferForm.class);
                startActivity(serviceIntent);
            }
        });


        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DBHandler dbHandler = new DBHandler(VerifyTransfer.this);


                long val = dbHandler.MakeTransactions(
                        Tono.getText().toString(),
                        Toname.getText().toString(),
                        payable.getText().toString(),
                        description.getText().toString(),
                        date.getText().toString()

                );

                if (val > 0) {
                    Toast.makeText(VerifyTransfer.this, "Transaction was Successfully", Toast.LENGTH_SHORT).show();
                    Intent serviceIntent = new Intent(VerifyTransfer.this, PaymentSuccess.class);
                    startActivity(serviceIntent);

                } else
                    Toast.makeText(VerifyTransfer.this, "Not Successfully", Toast.LENGTH_SHORT).show();
            }


        });
    }


    private void getData() {

        acno = getIntent().getIntExtra("acno", 444);

        acname = getIntent().getStringExtra("acname");

        amount = getIntent().getIntExtra("amount", 1);
        narrative = getIntent().getStringExtra("narrative");


        myno = getIntent().getIntExtra("myno", 444);
        myname = getIntent().getStringExtra("myname");

        Myno.setText(String.valueOf(myno));
        Myname.setText(String.valueOf(myname));

        Tono.setText(String.valueOf(acno));
        Toname.setText(String.valueOf(acname));
        payable.setText("Rs." + String.valueOf(amount) + "/=");
        description.setText(String.valueOf(narrative));

        String date2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        date.setText(date2);


//        save.setText("Rs. "+String.valueOf(income-(rent+food+bill+travel+family+savings+other)));
//        expense.setText("Rs. "+String.valueOf(rent+food+bill+travel+family+savings+other));

    }


}