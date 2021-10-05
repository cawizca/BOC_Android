package com.futuregen.bocandroid.IT19210520;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futuregen.bocandroid.R;

public class Forgot extends AppCompatActivity {

    Button submit;
    Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);


        submit =findViewById(R.id.btnSubmit);
        cancel = findViewById(R.id.btnCancel);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Forgot.this,OTP.class);
                startActivity(i);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Forgot.this,LoginActivity.class);
                startActivity(i);
            }
        });


    }
}