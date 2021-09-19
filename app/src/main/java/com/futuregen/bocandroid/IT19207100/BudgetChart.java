package com.futuregen.bocandroid.IT19207100;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;

import com.futuregen.bocandroid.R;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class BudgetChart extends AppCompatActivity {

    String[] months = {"Savings", "Family", "Food", "Travel", "Insurance", "Bills", "Loan", "Other"};
    int[] salary = {50000, 42000, 45000, 84110, 25000, 14000, 15000, 2000};
    int[] colorArray = new int[]{Color.LTGRAY, Color.BLUE, Color.CYAN, Color.DKGRAY, Color.GREEN, Color.MAGENTA, Color.RED, Color.BLACK};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_chart);

        PieChart pieChart = findViewById(R.id.piechart);

        pieChart.setCenterText("Spending By Catergory" );
        PieDataSet pieDataSet = new PieDataSet(dataValues1(), "Expenses");
        pieDataSet.setColors(colorArray);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setDrawEntryLabels(false);
        pieChart.setData(pieData);
        pieChart.invalidate();

        pieChart.setUsePercentValues(true);
        pieChart.setCenterTextSize(20);
        pieChart.setEntryLabelTextSize(25f);

        pieDataSet.setValueTextSize(18f);
        pieDataSet.setValueTextColor(Color.WHITE);


        Description des = pieChart.getDescription();
        des.setEnabled(false);
        Legend l = pieChart.getLegend();

        l.setEnabled(false);


//        l.getEntries();
//
////        l.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);
//
//        l.setYEntrySpace(10f);
//
//        l.setWordWrapEnabled(true);
//
//        LegendEntry l1=new LegendEntry("Male",Legend.LegendForm.CIRCLE,20f,2f,null,Color.YELLOW);
//        LegendEntry l2=new LegendEntry("Female", Legend.LegendForm.CIRCLE,20f,2f,null,Color.RED);
//        LegendEntry l3=new LegendEntry("Female", Legend.LegendForm.CIRCLE,20f,2f,null,Color.RED);
//        LegendEntry l4=new LegendEntry("Female", Legend.LegendForm.CIRCLE,20f,2f,null,Color.RED);
//        LegendEntry l5=new LegendEntry("Female", Legend.LegendForm.CIRCLE,20f,2f,null,Color.RED);
//        LegendEntry l6=new LegendEntry("Female", Legend.LegendForm.CIRCLE,20f,2f,null,Color.RED);
//
//        l.setCustom(new LegendEntry[]{l1,l2,l3,l4,l5,l6});
//
//
//        l.setEnabled(true);





//        legend.setFormSize(50);
//        legend.setTextSize(22);

    }

    private ArrayList<PieEntry> dataValues1() {


        ArrayList<PieEntry> value = new ArrayList<>();

        value.add(new PieEntry(40, "Savings"));
        value.add(new PieEntry(10, "Family"));
        value.add(new PieEntry(20, "Food"));

        int val = 10;
        if (val==9){
            value.add(new PieEntry(2, "Travel"));
        }

        value.add(new PieEntry(10, "Insurance"));
        value.add(new PieEntry(10, "Bills"));
        value.add(new PieEntry(20, "Loan"));
        value.add(new PieEntry(20, "Loan"));
        value.add(new PieEntry(20, "Loan"));
        return value;
    }


//        for(int i=0;i<months.length;i++){
//            value.add(new PieEntry(salary[i],months[i]));
//        }
//


//        PieDataSet pieDataSet = new PieDataSet(value,"Expenses");
//        PieData pieData = new PieData(pieDataSet);
//
//
//        pieChart.setData(pieData);
//
//        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS);

//        pieChart.setDrawEntryLabels(false);
//        pieChart.setCenterTextSize(48);
//

}