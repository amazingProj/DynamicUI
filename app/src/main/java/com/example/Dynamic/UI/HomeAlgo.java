package com.example.hackton5clubz.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hackton5clubz.Models.DataSourceDestinations;
import com.example.hackton5clubz.R;

import java.util.ArrayList;
import java.util.List;

public class HomeAlgo extends AppCompatActivity {

    LinearLayout layout;
    Button buttonAdd;
    Button submit;
    DataSourceDestinations destinations = DataSourceDestinations.getInstance();

    List<EditText> editTextCity = new ArrayList<>();
    List<EditText> editTextStreet = new ArrayList<>();
    List<EditText> editTextNumbers = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_algo);
        layout = findViewById(R.id.layout_list);
        buttonAdd = findViewById(R.id.addButton);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int size = editTextCity.size();
                destinations.destinations = new String[size][3];
                for (int i =0;i<size;++i)
                {
                      destinations.destinations[i][0]= editTextCity.get(0).getText().toString();
                      destinations.destinations[i][1]= editTextStreet.get(0).getText().toString();
                      destinations.destinations[i][2]= editTextCity.get(0).getText().toString();
                }

                Intent intent = new Intent(HomeAlgo.this, Result.class);

                startActivity(intent);

            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addView();
            }
        });
    }

    private void addView() {
        View cricketerView = getLayoutInflater().inflate(R.layout.row_add, null, false);
        ImageView imageClose = (ImageView)cricketerView.findViewById(R.id.close_img);
        EditText city = (EditText)cricketerView.findViewById(R.id.edit_city);
        EditText street = (EditText)cricketerView.findViewById(R.id.edit_street);
        EditText number = (EditText)cricketerView.findViewById(R.id.edit_number);
        editTextCity.add(city);
        editTextStreet.add(street);
        editTextNumbers.add(number);
        imageClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextCity.remove(cricketerView);
                editTextStreet.remove(cricketerView);
                editTextNumbers.remove(cricketerView);
                removeView(cricketerView);
            }
        });



        layout.addView(cricketerView);

    }

    private void removeView(View view) {
        layout.removeView(view);
    }

}