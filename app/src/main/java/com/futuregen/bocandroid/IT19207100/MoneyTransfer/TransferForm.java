package com.futuregen.bocandroid.IT19207100.MoneyTransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futuregen.bocandroid.R;

public class TransferForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_form);

        Button paynow = findViewById(R.id.paynow);

        paynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(TransferForm.this, VerifyTransfer.class);
                startActivity(serviceIntent);
            }
        });
    }
}