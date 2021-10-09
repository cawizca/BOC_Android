package com.futuregen.bocandroid.IT19209012;

import static android.graphics.Color.RED;

import static com.futuregen.bocandroid.R.drawable.rounded_corner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.futuregen.bocandroid.IT19207100.MoneyTransfer.TransferForm;
import com.futuregen.bocandroid.R;
import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class Electricity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);

        Button button = findViewById(R.id.paynow);
        EditText account = findViewById(R.id.accountno);
        EditText price = findViewById(R.id.price);
        AwesomeValidation awesomeValidation;
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        LoadingDialog loadingDialog = new LoadingDialog(Electricity.this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String accountNO = account.getText().toString().trim();
                String myprice = price.getText().toString().trim();

                awesomeValidation.addValidation(Electricity.this, R.id.accountno,
                        RegexTemplate.NOT_EMPTY, R.string.fill);
    //fff
                if (awesomeValidation.validate()) {
                    //StyleableToast.makeText(Electricity.this, "Please Enter CEB Bill Number", R.style.mytoast).show();

                    return;
                } else if (accountNO.length() != 12) {
                    StyleableToast.makeText(Electricity.this, "CEB Bill Number in Invalid", R.style.mytoast).show();
                    return;
                } else if (myprice.equals("")) {
                    StyleableToast.makeText(Electricity.this, "Please Enter Price", R.style.mytoast).show();
                    return;
                } else if (myprice.equals("0")) {
                    StyleableToast.makeText(Electricity.this, "Please Enter Valued Price", R.style.mytoast).show();
                    return;
                }

                loadingDialog.startLoadingDialog();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadingDialog.dismissDialog();
                        Intent intent = new Intent(Electricity.this, BillElectricity.class);
                        startActivity(intent);
                        finish();
                    }
                }, 3000);


            }
        });

    }
}