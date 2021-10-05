package com.futuregen.bocandroid.ApplyLoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futuregen.bocandroid.R;

public class LoanAgreement2 extends AppCompatActivity {

    private Button button_nxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_agreement2);

        button_nxt2 = findViewById(R.id.next_button2);

        button_nxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_2 = new Intent(LoanAgreement2.this, LoanAgreement3.class);
                startActivity(next_2);
            }
        });
    }
}