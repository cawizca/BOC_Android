package com.futuregen.bocandroid.IT19207100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.futuregen.bocandroid.R;

public class BudgetCalculator extends AppCompatActivity {

    EditText income ,rent , food , bill,travel,family,savings,other;
    int inc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_calculator);

        Button calculate = findViewById(R.id.calculate);

        income = findViewById(R.id.income);
        rent = findViewById(R.id.rent);
        food = findViewById(R.id.food);
        bill = findViewById(R.id.bill);
        travel = findViewById(R.id.travel);
        family = findViewById(R.id.family);
        savings = findViewById(R.id.savings);
        other = findViewById(R.id.other);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(BudgetCalculator.this,BudgetChart.class);

                in.putExtra("income", Integer.parseInt(income.getText().toString().trim()) );

                //rent
                if(rent.getText().toString().length()==0){
                    rent.setText("0");
                    in.putExtra("rent", Integer.parseInt(rent.getText().toString().trim()) );
                }

                else{
                    in.putExtra("rent", Integer.parseInt(rent.getText().toString().trim()) );
                }

                //food
                if(food.getText().toString().length()==0){
                    food.setText("0");
                    in.putExtra("food", Integer.parseInt(food.getText().toString().trim()) );
                }

                else{
                    in.putExtra("food", Integer.parseInt(food.getText().toString().trim()) );
                }


                //bill
                if(bill.getText().toString().length()==0){
                    bill.setText("0");
                    in.putExtra("bill", Integer.parseInt(bill.getText().toString().trim()) );
                }

                else{
                    in.putExtra("bill", Integer.parseInt(bill.getText().toString().trim()) );
                }

                //travel
                if(travel.getText().toString().length()==0){
                    travel.setText("0");
                    in.putExtra("travel", Integer.parseInt(travel.getText().toString().trim()) );
                }

                else{
                    in.putExtra("travel", Integer.parseInt(travel.getText().toString().trim()) );
                }


                //family
                if(family.getText().toString().length()==0){
                    family.setText("0");
                    in.putExtra("family", Integer.parseInt(family.getText().toString().trim()) );
                }

                else{
                    in.putExtra("family", Integer.parseInt(family.getText().toString().trim()) );
                }

                //savings
                if(savings.getText().toString().length()==0){
                    savings.setText("0");
                    in.putExtra("savings", Integer.parseInt(savings.getText().toString().trim()) );
                }

                else{
                    in.putExtra("savings", Integer.parseInt(savings.getText().toString().trim()) );
                }


                //other
                if(other.getText().toString().length()==0){
                    other.setText("0");
                    in.putExtra("other", Integer.parseInt(other.getText().toString().trim()) );
                }

                else{
                    in.putExtra("other", Integer.parseInt(other.getText().toString().trim()) );
                }





//                in.putExtra("food", Integer.parseInt(food.getText().toString().trim()) );
//                in.putExtra("bill", Integer.parseInt(bill.getText().toString().trim()) );
//                in.putExtra("travel", Integer.parseInt(travel.getText().toString().trim()) );
//                in.putExtra("family", Integer.parseInt(family.getText().toString().trim()) );
//                in.putExtra("savings", Integer.parseInt(savings.getText().toString().trim()) );
//                in.putExtra("other", Integer.parseInt(other.getText().toString().trim()) );

                startActivity(in);
            }
        });
    }
}