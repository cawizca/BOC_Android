package com.futuregen.bocandroid.IT19210520;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.futuregen.bocandroid.R;

public class OTP extends AppCompatActivity {

    Button submit;
    EditText o1;
    EditText o2;
    EditText o3;
    EditText o4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        submit = findViewById(R.id.bynOTPSub);
        o1 = findViewById(R.id.otp1);
        o2 = findViewById(R.id.otp1);
        o3 = findViewById(R.id.otp3);
        o4 = findViewById(R.id.otp4);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String ot1 = o1.getText().toString();
                final String ot2 = o2.getText().toString();
                final String ot3 =  o3.getText().toString();
                final String ot4 = o4.getText().toString();
                validate(ot1,ot2,ot3,ot4);
            }
        });
    }
    public void validate(String o1,String o2,String o3,String o4) {

        if ((o1.equals("3")) && (o2.equals("3")) && (o3.equals("3")) && (o3.equals("3"))) {

            Intent i = new Intent(OTP.this,SecurityQuesions.class);
            startActivity(i);

        }     else if((!o1.equals("")&&!o1.equals("3")) || (!o2.equals("")&&!o2.equals("3") || (!o3.equals("")&&!o3.equals("3")) || (!o4.equals("")&&!o4.equals("3")))                                                      ){
            Toast.makeText(OTP.this, "Please enter correct OTP Values", Toast.LENGTH_SHORT).show();
        }

    }

}