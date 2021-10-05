package com.futuregen.bocandroid.IT19207100.MoneyTransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import com.futuregen.bocandroid.R;

public class TransferForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_form);

        Button paynow = findViewById(R.id.paynow);
        Switch switch1 = findViewById(R.id.switch1);
        EditText acno = findViewById(R.id.acno);
        EditText acname = findViewById(R.id.acname);
        Spinner spinnerTransfer = findViewById(R.id.spinnerTransfer);


        acno.setEnabled(false);
        acname.setEnabled(false);



        paynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(TransferForm.this, VerifyTransfer.class);
                startActivity(serviceIntent);
            }
        });


        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked==true){
                    acno.setEnabled(true);
                    acname.setEnabled(true);
                    spinnerTransfer.setEnabled(false);
                }
                else{
                    acno.setEnabled(false);
                    acname.setEnabled(false);
                    spinnerTransfer.setEnabled(true);
                }
            }
        });

    }
}