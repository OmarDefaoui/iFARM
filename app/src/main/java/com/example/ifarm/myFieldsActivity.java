package com.example.ifarm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ifarm.adapter.RecyclerViewAdapterProduct;
import com.example.ifarm.model.ProductModel;
import com.example.ifarm.ui.FormAddField;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class myFieldsActivity extends AppCompatActivity {

    private RecyclerView rv_items;
    FloatingActionButton fab;

    private RecyclerViewAdapterProduct adapter;
    private ArrayList<ProductModel> productModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fields);

        initView();
        initData();
        initRecyclerView();


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(myFieldsActivity.this, FormAddField.class));
            }
        });
    }

    private void initView() {
        rv_items = findViewById(R.id.rl_fields);
        fab = findViewById(R.id.fab);
    }

    private void initData() {
        productModel.add(new ProductModel("TOMATES", "Superficie 200*200 m2",
                "Production/An : 2 212kg", "+2.12 %", R.drawable.bg1,
                R.drawable.tomate, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("BANNANE", "Superficie 200*200 m2",
                "Production/An : 912kg", "+0.12 %", R.drawable.bg2,
                R.drawable.banane, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("TOMATES", "Superficie 200*200 m2",
                "Production/An : 2 212kg", "+2.12 %", R.drawable.bg1,
                R.drawable.tomate, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("BANNANE", "Superficie 200*200 m2",
                "Production/An : 912kg", "+0.12 %", R.drawable.bg2,
                R.drawable.banane, R.drawable.ic_trending_up_green_24dp));
        productModel.add(new ProductModel("TOMATES", "Superficie 200*200 m2",
                "Production/An : 2 212kg", "+2.12 %", R.drawable.bg1,
                R.drawable.tomate, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("BANNANE", "Superficie 200*200 m2",
                "Production/An : 912kg", "+0.12 %", R.drawable.bg2,
                R.drawable.banane, R.drawable.ic_trending_up_green_24dp));
        productModel.add(new ProductModel("TOMATES", "Superficie 200*200 m2",
                "Production/An : 2 212kg", "+2.12 %", R.drawable.bg1,
                R.drawable.tomate, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("BANNANE", "Superficie 200*200 m2",
                "Production/An : 912kg", "+0.12 %", R.drawable.bg2,
                R.drawable.banane, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("TOMATES", "Superficie 200*200 m2",
                "Production/An : 2 212kg", "+2.12 %", R.drawable.bg1,
                R.drawable.tomate, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("BANNANE", "Superficie 200*200 m2",
                "Production/An : 912kg", "+0.12 %", R.drawable.bg2,
                R.drawable.banane, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("TOMATES", "Superficie 200*200 m2",
                "Production/An : 2 212kg", "+2.12 %", R.drawable.bg1,
                R.drawable.tomate, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("BANNANE", "Superficie 200*200 m2",
                "Production/An : 912kg", "+0.12 %", R.drawable.bg2,
                R.drawable.banane, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("TOMATES", "Superficie 200*200 m2",
                "Production/An : 2 212kg", "+2.12 %", R.drawable.bg1,
                R.drawable.tomate, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("BANNANE", "Superficie 200*200 m2",
                "Production/An : 912kg", "+0.12 %", R.drawable.bg2,
                R.drawable.banane, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("TOMATES", "Superficie 200*200 m2",
                "Production/An : 2 212kg", "+2.12 %", R.drawable.bg1,
                R.drawable.tomate, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("BANNANE", "Superficie 200*200 m2",
                "Production/An : 912kg", "+0.12 %", R.drawable.bg2,
                R.drawable.banane, R.drawable.ic_trending_up_green_24dp));
    }

    private void initRecyclerView() {
        rv_items.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapterProduct(this, productModel);
        rv_items.setAdapter(adapter);
    }
}
