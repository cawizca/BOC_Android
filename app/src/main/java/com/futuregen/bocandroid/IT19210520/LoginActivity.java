package com.futuregen.bocandroid.IT19210520;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;


import android.widget.TextView;
import android.widget.Toast;

import com.futuregen.bocandroid.IT19209012.Dashboard;
import com.futuregen.bocandroid.R;

public class LoginActivity extends AppCompatActivity {

    TextView forgot;
    Button unlock;
    EditText username;
    EditText Password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        forgot =findViewById(R.id.txtForgot);

        username = findViewById(R.id.loginUserNameId);
        Password =findViewById(R.id.loginPasswordId);
        login = findViewById(R.id.btnlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String user = username.getText().toString();

                final String p = Password.getText().toString();

                validate(user,p);



            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this,Forgot.class);
                startActivity(i);


            }
        });

        unlock = findViewById(R.id.btnUnlock);
        unlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(LoginActivity.this,Profile.class);
                startActivity(i);
            }
        });
    }


    public void validate(String username, String password) {

        if ((username.equals("udaraMadhuranga")) && (password.equals("12345678"))) {

            Intent i = new Intent(LoginActivity.this,Dashboard.class);
            startActivity(i);

        }
        else if(!username.equals("")&&!username.equals("udaraMadhuranga")){
            Toast.makeText(LoginActivity.this, "Please enter correct username", Toast.LENGTH_SHORT).show();
        }
        else if(!password.equals("")&&!password.equals("12345678")){
            Toast.makeText(LoginActivity.this, "Please enter correct password", Toast.LENGTH_SHORT).show();
        }
        else if(!username.equals("")&&!username.equals("udaraMadhuranga")&&!password.equals("")&&!password.equals("12345678")){
            Toast.makeText(LoginActivity.this, "Please enter correct username and password", Toast.LENGTH_SHORT).show();
        }

        else if(!username.equals("")&&username.equals("udaraMadhuranga")&&password.equals("")){
            Toast.makeText(LoginActivity.this, "Please enter password", Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(LoginActivity.this, "Please enter username and password", Toast.LENGTH_SHORT).show();

        }
    }
}