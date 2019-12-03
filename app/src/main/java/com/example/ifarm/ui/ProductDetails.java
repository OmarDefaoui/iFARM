package com.example.ifarm.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ifarm.R;
import com.example.ifarm.model.ProductModel;

public class ProductDetails extends AppCompatActivity {

    ImageView iv_icon;
    TextView tv_name, tv_superficie, tv_production, tv_percentage, tv_alert_message;
    Button btn_arroser;

    ProductModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        iv_icon = findViewById(R.id.iv_icon);
        tv_name = findViewById(R.id.tv_name);
        tv_superficie = findViewById(R.id.tv_superficie);
        tv_production = findViewById(R.id.tv_production);
        tv_percentage = findViewById(R.id.tv_percentage);
        tv_alert_message = findViewById(R.id.tv_alert_message);
        btn_arroser = findViewById(R.id.btn_arroser);

        model = (ProductModel) getIntent().getSerializableExtra("model");

        btn_arroser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arroser();
            }
        });

        iv_icon.setImageResource(model.getIcon());
        tv_name.setText(model.getName());
        tv_superficie.setText(model.getSuperficie());
        tv_production.setText(model.getProduction());
        tv_percentage.setText(model.getPercentage());
        showAlertMessage();
    }

    private void arroser() {
        //TODO: add code here to start the operation
    }

    private void showAlertMessage() {
        //TODO: add logic to display an alert according to data
        tv_alert_message.setText("Some text...");
    }
}
