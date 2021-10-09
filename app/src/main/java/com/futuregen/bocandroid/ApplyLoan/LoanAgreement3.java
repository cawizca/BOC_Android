package com.futuregen.bocandroid.ApplyLoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futuregen.bocandroid.R;

public class LoanAgreement3 extends AppCompatActivity {

    private Button agree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_agreement3);

        agree = findViewById(R.id.agree_btn);

        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAgree = new Intent(LoanAgreement3.this,LoanForm1.class);
                startActivity(intentAgree);
            }
        });
    }
}