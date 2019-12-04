package com.example.ifarm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ifarm.weather.activities.MainActivity;

public class menuActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView moveToStatistics, moveToFields, moveToWeather, moveToUpdate,
            moveToTips, moveToSettings;

    private ImageView iv_record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Defining CARDS
        moveToStatistics = findViewById(R.id.statistiques);
        moveToFields = findViewById(R.id.fields);
        moveToWeather = findViewById(R.id.weather);
        moveToUpdate = findViewById(R.id.update);
        moveToTips = findViewById(R.id.tips);
        moveToSettings = findViewById(R.id.settings);
        iv_record = findViewById(R.id.iv_record);


        //ADDING EVENTS LISTENER TO THE CARDS
        moveToStatistics.setOnClickListener(this);
        moveToFields.setOnClickListener(this);
        moveToWeather.setOnClickListener(this);
        moveToUpdate.setOnClickListener(this);
        moveToTips.setOnClickListener(this);
        moveToSettings.setOnClickListener(this);
        iv_record.setOnClickListener(this);

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
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("fromMain", true);
                startActivity(intent);
                break;
            case R.id.tips:
                intent = new Intent(this, tipsActivity.class);
                startActivity(intent);
                break;
            case R.id.settings:
                intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.iv_record:
                recordAudio();
                break;
        }
    }

    private void recordAudio() {
        //TODO: function to interact with voice control
    }
}
