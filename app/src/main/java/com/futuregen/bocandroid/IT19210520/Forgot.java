package com.futuregen.bocandroid.IT19210520;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.futuregen.bocandroid.R;

public class Forgot extends AppCompatActivity {

    Button submit;
    Button cancel;
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);


        submit = findViewById(R.id.btnSubmit);
        cancel = findViewById(R.id.btnCancel);
        username = findViewById(R.id.inputUserID);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String user = username.getText().toString();
                validate(user);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Forgot.this, LoginActivity.class);
                startActivity(i);
            }
        });


    }

    public void validate(String username) {

        if ((username.equals("udaraMadhuranga"))) {

            Intent i = new Intent(Forgot.this, OTP.class);
            startActivity(i);

        }     else if(!username.equals("")&&!username.equals("udaraMadhuranga")){
            Toast.makeText(Forgot.this, "Please enter correct username", Toast.LENGTH_SHORT).show();
        }

    }
}

