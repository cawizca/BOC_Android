package com.futuregen.bocandroid.ApplyLoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.futuregen.bocandroid.IT19207100.MoneyTransfer.TransferForm;
import com.futuregen.bocandroid.R;

public class LoanForm1 extends AppCompatActivity {

    private Button personal_nxt;
    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_form1);

        personal_nxt = findViewById(R.id.nxt1_btn);

        personal_nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

                    awesomeValidation.addValidation(LoanForm1.this, R.id.exsisting_cus,
                            RegexTemplate.NOT_EMPTY, R.string.fill);

                    awesomeValidation.addValidation(LoanForm1.this, R.id.address_person,
                            RegexTemplate.NOT_EMPTY, R.string.fill);


                    awesomeValidation.addValidation(LoanForm1.this, R.id.name_persoon,
                            RegexTemplate.NOT_EMPTY, R.string.fill);

                    awesomeValidation.addValidation(LoanForm1.this, R.id.nic_textfield_person,
                            RegexTemplate.NOT_EMPTY, R.string.fill);


                    awesomeValidation.addValidation(LoanForm1.this, R.id.dob_person,
                            RegexTemplate.NOT_EMPTY, R.string.fill);

                    awesomeValidation.addValidation(LoanForm1.this, R.id.email_person,
                            RegexTemplate.NOT_EMPTY, R.string.fill);

                awesomeValidation.addValidation(LoanForm1.this, R.id.phone_person,
                        RegexTemplate.NOT_EMPTY, R.string.fill);


                if (awesomeValidation.validate()) {
                    Intent next1 = new Intent(LoanForm1.this, LoanForm2.class);
                    startActivity(next1);
                }




            }
        });
    }
}