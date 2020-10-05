package com.example.lab04;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        intent();
    }

    private void intent(){
        if(getIntent().hasExtra("url") && getIntent().hasExtra("item_name") && getIntent().hasExtra("item_desc") && getIntent().hasExtra("item_price")){

            String itemUrl = getIntent().getStringExtra("url");
            String itemName = getIntent().getStringExtra("item_name");
            String itemDesc = getIntent().getStringExtra("item_desc");
            String itemPrice = getIntent().getStringExtra("item_price");

            setItem(itemUrl, itemName, itemDesc, itemPrice);
        }
    }

    private void setItem(String itemUrl, String itemName, String itemDesc, String itemPrice) {
        TextView name = findViewById(R.id.item_title);
        name.setText(itemName);

        ImageView image = findViewById(R.id.item_img);
        image.setImageResource(getResources().getIdentifier(itemUrl, "drawable", getPackageName()));

        TextView desc = findViewById(R.id.item_desc);
        desc.setText(itemDesc);

        TextView price = findViewById(R.id.item_price);
        price.setText(itemPrice);
    }
}