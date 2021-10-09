package com.futuregen.bocandroid.IT19210520;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.futuregen.bocandroid.R;

public class SecurityQuesions extends AppCompatActivity {

    Button submit;
    EditText  qe1;
    EditText qe2;
    EditText qe3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_quesions);

        submit= findViewById(R.id.btnSubmit2);
        qe1 = findViewById(R.id.Eq1);
        qe2 = findViewById(R.id.Eq2);
        qe3 = findViewById(R.id.Eq3);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String q1 = qe1.getText().toString();
                final String q2 = qe2.getText().toString();
                final String q3 = qe3.getText().toString();

                validate(q1,q2,q3);
            }
        });
    }

    public void validate(String o1,String o2,String o3) {

        if ((o1.equals("Hashini")) && (o2.equals("red")) && (o3.equals("kegalle"))) {

            Intent i =new Intent(SecurityQuesions.this,ResetPassword.class);
            startActivity(i);

        }     else if((!o1.equals("")&&!o1.equals("Hashini")) || (!o2.equals("")&&!o2.equals("red") || (!o3.equals("")&&!o3.equals("kegalle")))                                                      ){
            Toast.makeText(SecurityQuesions.this, "Please enter correct  Values for Sequrity questions", Toast.LENGTH_SHORT).show();
        }

    }
}