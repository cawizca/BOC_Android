package com.futuregen.bocandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.futuregen.bocandroid.Contact.ContactActivity;
import com.futuregen.bocandroid.IT19210520.LoginActivity;
import com.futuregen.bocandroid.Services.ServiceMenu;

public class HomeActivity extends AppCompatActivity {

    private ImageButton service_btn;
    private ImageButton contact_btn;
    private Button signin_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        service_btn = (ImageButton) findViewById(R.id.btn_service);
        signin_btn = findViewById(R.id.next_button2);

        service_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(HomeActivity.this, ServiceMenu.class);
                startActivity(serviceIntent);
            }
        });

        contact_btn = (ImageButton) findViewById(R.id.button_contact);

        contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contsctIntent = new Intent(HomeActivity.this, ContactActivity.class);
                startActivity(contsctIntent);
            }
        });

        signin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}