package com.futuregen.bocandroid.IT19209012;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futuregen.bocandroid.IT19207100.MoneyTransfer.TransferForm;
import com.futuregen.bocandroid.R;

public class Dashboard extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        Button button = findViewById(R.id.pay_bills);
        Button own = findViewById(R.id.own_account);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,ServicesMenu.class);
                startActivity(intent);
            }
        });

        own.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, TransferForm.class);
                startActivity(intent);
            }
        });


    }
}