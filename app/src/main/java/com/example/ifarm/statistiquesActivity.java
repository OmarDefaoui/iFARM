package com.example.ifarm;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class statistiquesActivity extends AppCompatActivity {

    GraphView graph_humidity, graph_temperature, graph_water;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistiques);

        graph_humidity = findViewById(R.id.graph_humidity);
        graph_temperature = findViewById(R.id.graph_temperature);
        graph_water = findViewById(R.id.graph_water);

        setUpHumidityGraph();
        setUpTemperatureGraph();
        setUpWaterGraph();
    }

    //TODO: put here your data
    private void setUpHumidityGraph() {
        LineGraphSeries<DataPoint> humidityData = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph_humidity.setTitle("Humidity");
        graph_humidity.setTitleColor(Color.BLUE);
        humidityData.setAnimated(true);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        paint.setColor(Color.BLUE);
        humidityData.setCustomPaint(paint);

        graph_humidity.addSeries(humidityData);
    }

    private void setUpTemperatureGraph() {
        LineGraphSeries<DataPoint> temperatureData = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(-3, 5),
                new DataPoint(-1, 9),
                new DataPoint(0, 1),
                new DataPoint(1, 3),
                new DataPoint(2, -1),
                new DataPoint(3, 2),
                new DataPoint(4, -2),
                new DataPoint(10, 10)
        });
        graph_temperature.setTitle("Temperature");
        graph_temperature.setTitleColor(Color.RED);
        temperatureData.setAnimated(true);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        paint.setColor(Color.RED);
        temperatureData.setCustomPaint(paint);

        graph_temperature.addSeries(temperatureData);
    }

    private void setUpWaterGraph() {
        LineGraphSeries<DataPoint> waterData = new LineGraphSeries<>();
        for (int i = 0; i < 10; i++) {
            waterData.appendData(new DataPoint(i, i + 1), false, 10);
        }

        graph_water.setTitle("Water");
        graph_water.setTitleColor(Color.GREEN);
        waterData.setAnimated(true);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        paint.setColor(Color.GREEN);
        waterData.setCustomPaint(paint);

        graph_water.addSeries(waterData);
    }

}
