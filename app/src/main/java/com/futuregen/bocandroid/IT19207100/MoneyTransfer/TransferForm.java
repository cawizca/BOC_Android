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
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.futuregen.bocandroid.R;


public class TransferForm extends AppCompatActivity {

    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_form);

        Button paynow = findViewById(R.id.paynow);
        Switch switch1 = findViewById(R.id.switch1);
        EditText acno = findViewById(R.id.acno);
        EditText acname = findViewById(R.id.acname);
        EditText amount = findViewById(R.id.amount);
        EditText narrative = findViewById(R.id.narrative);
        Spinner spinnerTransfer = findViewById(R.id.spinnerTransfer);
        Spinner spinnerTransfer2 = findViewById(R.id.spinner);


        acno.setEnabled(false);
        acname.setEnabled(false);

        String to = (String) spinnerTransfer.getSelectedItem();


        paynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean tr = switch1.isChecked();
                System.out.println(tr);


//                if (awesomeValidation.validate() && switch1.isChecked() == true) {
//
//                    Intent serviceIntent = new Intent(TransferForm.this, VerifyTransfer.class);
//                    serviceIntent.putExtra("acno", Integer.parseInt(acno.getText().toString().trim()));
//                    serviceIntent.putExtra("acname", acname.getText().toString().trim());
//                    serviceIntent.putExtra("amount", Integer.parseInt(amount.getText().toString().trim()));
//                    serviceIntent.putExtra("narrative", narrative.getText().toString().trim());
//                    startActivity(serviceIntent);
//
//                } else if (awesomeValidation.validate() && switch1.isChecked() == false) {
//
//
//                } else {
//
//
//                    Toast.makeText(TransferForm.this, "Please Fill The All Fields", Toast.LENGTH_SHORT).show();
//                }

                awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

                if (switch1.isChecked() == true) {
                    awesomeValidation.addValidation(TransferForm.this, R.id.acno,
                            RegexTemplate.NOT_EMPTY, R.string.fill);

                    awesomeValidation.addValidation(TransferForm.this, R.id.acname,
                            RegexTemplate.NOT_EMPTY, R.string.fill);


                    awesomeValidation.addValidation(TransferForm.this, R.id.amount,
                            RegexTemplate.NOT_EMPTY, R.string.fill);

                    awesomeValidation.addValidation(TransferForm.this, R.id.narrative,
                            RegexTemplate.NOT_EMPTY, R.string.fill);



                } else {
                    awesomeValidation.addValidation(TransferForm.this, R.id.amount,
                            RegexTemplate.NOT_EMPTY, R.string.fill);

                    awesomeValidation.addValidation(TransferForm.this, R.id.narrative,
                            RegexTemplate.NOT_EMPTY, R.string.fill);

                }


                if (awesomeValidation.validate() && spinnerTransfer2.getSelectedItemPosition()!=0 ) {
                    if (((String) spinnerTransfer.getSelectedItem()).equalsIgnoreCase("Choose from Beneficiary")) {

                        int no1 = 0;
                        if (spinnerTransfer2.getSelectedItemPosition() == 1) {
                            no1 = 11111111;
                        }
                        if (spinnerTransfer2.getSelectedItemPosition() == 2) {
                            no1 = 22222222;
                        }
                        if (spinnerTransfer2.getSelectedItemPosition() == 3) {
                            no1 = 33333333;
                        }


                        Intent serviceIntent = new Intent(TransferForm.this, VerifyTransfer.class);
                        serviceIntent.putExtra("myno", no1);
                        serviceIntent.putExtra("myname", spinnerTransfer2.getSelectedItem().toString());

                        serviceIntent.putExtra("acno", Integer.parseInt(acno.getText().toString().trim()));
                        serviceIntent.putExtra("acname", acname.getText().toString().trim());
                        serviceIntent.putExtra("amount", Integer.parseInt(amount.getText().toString().trim()));
                        serviceIntent.putExtra("narrative", narrative.getText().toString().trim());
                        startActivity(serviceIntent);

//                        Toast.makeText(TransferForm.this, "not selected", Toast.LENGTH_SHORT).show();
                    } else {

                        int no1 = 0;
                        if (spinnerTransfer.getSelectedItemPosition() == 1) {
                            no1 = 11111111;
                        }
                        if (spinnerTransfer.getSelectedItemPosition() == 2) {
                            no1 = 22222222;
                        }
                        if (spinnerTransfer.getSelectedItemPosition() == 3) {
                            no1 = 33333333;
                        }


                        int no2 = 0;
                        if (spinnerTransfer2.getSelectedItemPosition() == 1) {
                            no2 = 11111111;
                        }
                        if (spinnerTransfer2.getSelectedItemPosition() == 2) {
                            no2 = 22222222;
                        }
                        if (spinnerTransfer2.getSelectedItemPosition() == 3) {
                            no2 = 33333333;
                        }


                        Intent serviceIntent = new Intent(TransferForm.this, VerifyTransfer.class);

                        serviceIntent.putExtra("myno", no2);
                        serviceIntent.putExtra("myname", spinnerTransfer2.getSelectedItem().toString());

                        serviceIntent.putExtra("acno", no1);
                        serviceIntent.putExtra("acname", spinnerTransfer.getSelectedItem().toString());
                        serviceIntent.putExtra("amount", Integer.parseInt(amount.getText().toString().trim()));
                        serviceIntent.putExtra("narrative", narrative.getText().toString().trim());
                        startActivity(serviceIntent);


//                        Toast.makeText(TransferForm.this, " selected", Toast.LENGTH_SHORT).show();
                    }

                }else
                {
                    Toast.makeText(TransferForm.this, " select the required fields", Toast.LENGTH_SHORT).show();
                }
            }
        });


        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {


                if (isChecked == true) {


                    acno.setEnabled(true);
                    acname.setEnabled(true);
                    spinnerTransfer.setEnabled(false);
                    spinnerTransfer.setSelection(0);
                } else {


                    acno.setEnabled(false);
                    acname.setEnabled(false);
                    spinnerTransfer.setEnabled(true);


                }
            }
        });

    }


}