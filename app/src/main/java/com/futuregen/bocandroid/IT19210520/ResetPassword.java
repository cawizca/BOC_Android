package com.futuregen.bocandroid.IT19210520;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.futuregen.bocandroid.R;

import java.util.regex.Pattern;

public class ResetPassword extends AppCompatActivity {

    EditText newPassword;
    EditText confirmPassword;
    Button submit;
    private static final Pattern PasswordPattern = Pattern.compile("[a-z0-9 ]{8,12}");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        newPassword = findViewById(R.id.ENewP);
        confirmPassword = findViewById(R.id.EconP);
        submit =findViewById(R.id.btnreSetsubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String newP = newPassword.getText().toString();
                final String conP = confirmPassword.getText().toString();

                if(TextUtils.isEmpty(newP)){
                    newPassword.setError("Credit card number is  Required");
                    return;
                } else if (!PasswordPattern.matcher(newP).matches()){
                    newPassword.setError("credit card number should be minimum 8 characters and maximum 12 characters  include with digits number and lowercases only ");
                    return;
                }
                else
                {
                    validate(newP,conP);
                }

            }
        });

    }

    public void validate(String np,String cp) {

        if ((np.equals(cp))) {

            Intent i =new Intent(ResetPassword.this,LoginActivity.class);
            startActivity(i);

        }     else{
            Toast.makeText(ResetPassword.this, "New password mismatch with  confirm password", Toast.LENGTH_SHORT).show();
        }

    }

}