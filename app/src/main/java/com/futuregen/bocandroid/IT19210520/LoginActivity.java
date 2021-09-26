package com.futuregen.bocandroid.IT19210520;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.futuregen.bocandroid.R;

public class LoginActivity extends AppCompatActivity {

    TextView forgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        forgot =findViewById(R.id.txtForgot);

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this,Forgot.class);
                startActivity(i);
            }
        });
    }
}