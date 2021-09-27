package com.futuregen.bocandroid.IT19207100.MoneyTransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futuregen.bocandroid.R;

public class VerifyTransfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_transfer);

        Button change = findViewById(R.id.button2);
        Button confirm = findViewById(R.id.confirm);

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
                Intent serviceIntent = new Intent(VerifyTransfer.this, PaymentSuccess.class);
                startActivity(serviceIntent);
            }
        });
    }
}