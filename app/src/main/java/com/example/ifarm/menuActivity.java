package com.example.ifarm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView moveToStatistics, moveToFields, moveToWeather, moveToUpdate,
            moveToTips, moveToSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Defining CARDS
        moveToStatistics = (CardView) findViewById(R.id.statistiques);
        moveToFields = (CardView) findViewById(R.id.fields);
        moveToWeather = (CardView) findViewById(R.id.weather);
        moveToUpdate = (CardView) findViewById(R.id.update);
        moveToTips = (CardView) findViewById(R.id.tips);
        moveToSettings = (CardView) findViewById(R.id.settings);


        //ADDING EVENTS LISTENER TO THE CARDS
        moveToStatistics.setOnClickListener(this);
        moveToFields.setOnClickListener(this);
        moveToWeather.setOnClickListener(this);
        moveToUpdate.setOnClickListener(this);
        moveToTips.setOnClickListener(this);
        moveToSettings.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.statistiques:
                intent = new Intent(this, statistiquesActivity.class);
                startActivity(intent);
                break;
            case R.id.fields:
                intent = new Intent(this, myFieldsActivity.class);
                startActivity(intent);
                break;
            case R.id.weather:
                intent = new Intent(this, weatherActivity.class);
                startActivity(intent);
                break;
            case R.id.settings:
                intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                break;
        }
    }
}