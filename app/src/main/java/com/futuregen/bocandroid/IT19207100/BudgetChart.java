package com.futuregen.bocandroid.IT19207100;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.futuregen.bocandroid.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class BudgetChart extends AppCompatActivity {

    TextView save,expense;
    double test=0, income=0, rent=0, food=0, bill=0, travel=0, family=0, savings=0, other=0;


    String[] months = {"Savings", "Family", "Food", "Travel", "Insurance", "Bills", "Loan", "Other"};
    int[] salary = {50000, 42000, 45000, 84110, 25000, 14000, 15000, 2000};
    int[] colorArray = new int[]{ Color.BLUE,Color.LTGRAY, Color.RED, Color.CYAN, Color.DKGRAY, Color.GREEN, Color.MAGENTA, Color.BLACK};

    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_chart);

        pieChart = findViewById(R.id.piechart);
        save=findViewById(R.id.save);
        expense=findViewById(R.id.expense);

        getData();
        setupPieChart();
        loadPieChartData();




    }

    private void loadPieChartData() {
        pieChart.setDrawHoleEnabled(true);
        pieChart.setUsePercentValues(true);
        pieChart.setEntryLabelTextSize(15);
        pieChart.setEntryLabelColor(Color.WHITE);
        pieChart.setCenterText("Spending by category");
        pieChart.setCenterTextSize(15);
        pieChart.getDescription().setEnabled(false);
        pieChart.setDrawEntryLabels(false);
        pieChart.setHoleRadius(50);
//        pieChart.setHoleColor( Color.parseColor("#FFC300"));
        Legend l = pieChart.getLegend();

        l.setEnabled(false);

    }

    private void setupPieChart() {

        ArrayList<PieEntry> entries =new ArrayList<>();


        entries.add(new PieEntry((float) (income-rent-food-bill-travel-family-savings-other),"income"));
        if(rent!=0)
            entries.add(new PieEntry((float) rent,"rent"));
        if(food!=0)
            entries.add(new PieEntry((float) food,"food"));
        if(bill!=0)
            entries.add(new PieEntry((float) bill,"bill"));
        if(travel!=0)
            entries.add(new PieEntry((float) travel,"travel"));
        if(family!=0)
            entries.add(new PieEntry((float) family,"family"));
        if(savings!=0)
            entries.add(new PieEntry((float) savings,"savings"));
        if(other!=0)
            entries.add(new PieEntry((float) other,"other"));


//
//        ArrayList<Integer> colors = new ArrayList<>();
//        for(int color: ColorTemplate.MATERIAL_COLORS){
//            colors.add(color);
//        }

//        for(int color: ColorTemplate.VORDIPLOM_COLORS){
//            colors.add(color);
//        }
//


        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(Color.parseColor("#1845D4"));
        colors.add(Color.parseColor("#36FF4B"));
        colors.add(Color.parseColor("#0CC518"));
        colors.add(Color.parseColor("#19AAFE"));
        colors.add(Color.parseColor("#FF4D52"));
        colors.add(Color.parseColor("#B58F14"));
        colors.add(Color.parseColor("#FFC300"));
        colors.add(Color.parseColor("#C115FF"));

        PieDataSet dataSet = new PieDataSet(entries,"Expense Category");
        dataSet.setColors(colors);
        dataSet.setXValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        PieData data = new PieData(dataSet);
        data.setDrawValues(true);
        data.setValueFormatter(new PercentFormatter(pieChart));
        data.setValueTextSize(12f);
        data.setValueTextColor(Color.WHITE);

        pieChart.setData(data);
        pieChart.invalidate();
    }


    private void getData() {

        income = getIntent().getDoubleExtra("income", 1);
        rent = getIntent().getDoubleExtra("rent", 1);
        food = getIntent().getDoubleExtra("food", 1);
        bill = getIntent().getDoubleExtra("bill", 1);
        travel = getIntent().getDoubleExtra("travel", 1);
        family = getIntent().getDoubleExtra("family", 1);
        savings = getIntent().getDoubleExtra("savings", 1);
        other = getIntent().getDoubleExtra("other", 1);

//        save.setText("Rs. "+String.valueOf(income-(rent+food+bill+travel+family+savings+other)));
        double saved= income-(rent+food+bill+travel+family+savings+other);

        double expensed= rent+food+bill+travel+family+savings+other;

        save.setText("Rs." + String.format("%.2f",saved));
        expense.setText("Rs." + String.format("%.2f",expensed));


//        expense.setText("Rs. "+String.valueOf(rent+food+bill+travel+family+savings+other));

    }



}


