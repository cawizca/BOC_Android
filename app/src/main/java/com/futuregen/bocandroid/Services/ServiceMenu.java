package com.futuregen.bocandroid.Services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.futuregen.bocandroid.HomeActivity;
import com.futuregen.bocandroid.IT19207100.BudgetCalculator;
import com.futuregen.bocandroid.R;

public class ServiceMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_menu);
        ImageView budget = findViewById(R.id.budget);

        budget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(ServiceMenu.this, BudgetCalculator.class);
                startActivity(in);
            }
        });
    }
}