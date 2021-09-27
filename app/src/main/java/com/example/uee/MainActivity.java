package com.example.uee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {
    //Initialize variables
    MeowBottomNavigation bottomNavigation;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign variable
        bottomNavigation = findViewById(R.id.bottom_navigation);
        button = findViewById(R.id.pay_bills);

        //Add menu items
    bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_notification));
    bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_home));
    bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_info));

    bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
        @Override
        public void onShowItem(MeowBottomNavigation.Model item) {
            //Initialize Fragment
            Fragment fragment = null;
            //check condition
    switch (item.getId()){
        case 1:
            //when id is 1
            //Initialize notification fragment
                fragment = new NotificationFragment();
                break;
        case 2:
            fragment = new HomeFragment();
            break;

        case 3:
            fragment = new AboutFragment();
            break;
        }

        loadFragment(fragment);

        }
    });

        //Set notification count
        bottomNavigation.setCount(1,"10");

        bottomNavigation.show(2,true);
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                //Display Toast
                Toast.makeText(getApplicationContext(),"You Cliclked" + item.getId(),Toast.LENGTH_SHORT).show();

            }
        });

        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {

                //Display toast
                Toast.makeText(getApplicationContext(),"You Relesed"+ item.getId(),Toast.LENGTH_SHORT).show();
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenBill();
            }
        });


    }

    private void OpenBill() {

        Intent intent = new Intent(this,BillActivity.class);
        startActivity(intent);

    }

    private void loadFragment(Fragment fragment) {
        //Replace fragment

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();


    }
}