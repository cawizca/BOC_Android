package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        Button electricity = findViewById(R.id.electricity);

        electricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                geElectricity();
            }
        });
    }

    private void geElectricity() {

        Intent intent = new Intent(this,ElectricityActivity.class);
        startActivity(intent);

    }
}