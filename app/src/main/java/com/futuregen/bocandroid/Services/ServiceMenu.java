package com.futuregen.bocandroid.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.futuregen.bocandroid.ApplyLoan.LoanAgreement1;
import com.futuregen.bocandroid.HomeActivity;
import com.futuregen.bocandroid.IT19207100.BudgetCalculator;
import com.futuregen.bocandroid.R;

public class ServiceMenu extends AppCompatActivity {

    ImageView btn_apply_loan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_menu);
        ImageView budget = findViewById(R.id.budget);

        btn_apply_loan = findViewById(R.id.apply_loan_btn);

        btn_apply_loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loan_apply = new Intent(ServiceMenu.this, LoanAgreement1.class);
                startActivity(loan_apply);
            }
        });

        budget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(ServiceMenu.this, BudgetCalculator.class);
                startActivity(in);
            }
        });
    }
}