package com.futuregen.bocandroid.ApplyLoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futuregen.bocandroid.R;

public class LoanAgreement1 extends AppCompatActivity {

    private Button btn_next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_agreement1);

        btn_next1 = findViewById(R.id.next_button2);

        btn_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next1 = new Intent(LoanAgreement1.this, LoanAgreement2.class);
                startActivity(next1);
            }
        });
    }
}