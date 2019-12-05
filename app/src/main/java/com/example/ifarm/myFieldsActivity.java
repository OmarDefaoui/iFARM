package com.example.ifarm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ifarm.adapter.RecyclerViewAdapterProduct;
import com.example.ifarm.model.ProductModel;

import java.util.ArrayList;

public class myFieldsActivity extends AppCompatActivity {

    private RecyclerView rv_items;

    private RecyclerViewAdapterProduct adapter;
    private ArrayList<ProductModel> productModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fields);

        initView();
        initData();
        initRecyclerView();
    }

    private void initView() {
        rv_items = findViewById(R.id.rl_fields);
    }

    private void initData() {
        //TODO: set here fields content
        productModel.add(new ProductModel("TOMATES", "Superficie 200*200 m2",
                "Production/An : 2 212kg", "+2.12 %", R.drawable.bg1,
                R.drawable.tomate, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("BANNANE", "Superficie 200*200 m2",
                "Production/An : 912kg", "+0.12 %", R.drawable.bg2,
                R.drawable.banane, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("KIWI", "Superficie 200*200 m2",
                "Production/An : 3 126kg", "+1.08 %", R.drawable.bg3,
                R.drawable.kiwi, R.drawable.ic_trending_up_green_24dp));

        productModel.add(new ProductModel("ORANGE", "Superficie 200*200 m2",
                "Production/An : 3 019kg", "+3.11 %", R.drawable.bg1,
                R.drawable.orange, R.drawable.ic_trending_up_green_24dp));
    }

    private void initRecyclerView() {
        rv_items.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapterProduct(this, productModel);
        rv_items.setAdapter(adapter);
    }
}
