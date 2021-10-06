package com.futuregen.bocandroid.IT19209012;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.futuregen.bocandroid.R;

public class ServicesMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_menu);

        Button button = findViewById(R.id.electricity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ServicesMenu.this , Electricity.class);
                startActivity(intent);
            }
        });
    }
}