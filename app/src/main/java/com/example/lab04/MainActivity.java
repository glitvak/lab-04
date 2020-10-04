package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> wordList = new LinkedList<>();
    private final LinkedList<String> imgList = new LinkedList<>();
    private final LinkedList<Double> priceList = new LinkedList<>();
    private final LinkedList<String> infoList = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private ListAdapter mAdapter;
    /*
    ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadItems();
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new ListAdapter(this, wordList, imgList, priceList, infoList);

    }

    private void loadItems() {
        wordList.add("Milk");
        imgList.add("https://globalassets.starbucks.com/assets/296fe6da884c4919948a7d84fb128dbe.jpg?impolicy=1by1_wide_1242");
        priceList.add(5.0);
        infoList.add("A whitish liquid containing proteins, fats, lactose, and various vitamins and minerals that is produced by the mammary glands of all mature female mammals after they have given birth and serves as nourishment for their young. The milk of cows, goats, or other animals, used as food by humans.");


    }
}