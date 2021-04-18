package com.example.hackton5clubz.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hackton5clubz.Models.DataSourceDestinations;
import com.example.hackton5clubz.R;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.List;

public class Result extends AppCompatActivity {

    LinearLayout layout;
    DataSourceDestinations destinations = DataSourceDestinations.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        for (int i=0; i<;++i)
        {
            View cricketerView = getLayoutInflater().inflate(R.layout.row_add, null, false);





            layout.addView(cricketerView);



        }
    }

    public void addTextView()
    {


    }
}