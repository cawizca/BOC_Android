package com.futuregen.bocandroid.ApplyLoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.futuregen.bocandroid.R;

public class LoanForm2 extends AppCompatActivity {

    AwesomeValidation awesomeValidation;

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_form2);

        button2 = findViewById(R.id.nxt2_btn);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

                awesomeValidation.addValidation(LoanForm2.this, R.id.cus_branch,
                        RegexTemplate.NOT_EMPTY, R.string.fill);

                awesomeValidation.addValidation(LoanForm2.this, R.id.repay_meth,
                        RegexTemplate.NOT_EMPTY, R.string.fill);


                awesomeValidation.addValidation(LoanForm2.this, R.id.loan_amnt,
                        RegexTemplate.NOT_EMPTY, R.string.fill);

                awesomeValidation.addValidation(LoanForm2.this, R.id.repay_period,
                        RegexTemplate.NOT_EMPTY, R.string.fill);

                awesomeValidation.addValidation(LoanForm2.this, R.id.repay_period,"[a-zA-Z ]{1,20}", R.string.invalid);



                if (awesomeValidation.validate()) {
                    Intent next2 = new Intent(LoanForm2.this, LoanForm3.class);
                    startActivity(next2);
                }

            }
        });
    }
}