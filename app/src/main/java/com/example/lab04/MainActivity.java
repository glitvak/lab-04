package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> wordList = new LinkedList<>();
    private final LinkedList<String> imgList = new LinkedList<>();
    private final LinkedList<String> priceList = new LinkedList<>();
    private final LinkedList<String> infoList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadItems();

    }

    private void loadItems() {
        wordList.add("Milk");
        imgList.add("milk");
        priceList.add("$5.00");
        infoList.add("A whitish liquid containing proteins, fats, lactose, and various vitamins and minerals that is produced by the mammary glands of all mature female mammals.");

        wordList.add("Eggs");
        imgList.add("eggs");
        priceList.add("$2.33");
        infoList.add("Eggs are laid by female animals of many different species");

        wordList.add("Water");
        imgList.add("water");
        priceList.add("$1.99");
        infoList.add("Water is an inorganic, transparent, tasteless, odorless, and nearly colorless chemical substance");

        wordList.add("Tomatoes");
        imgList.add("tomato");
        priceList.add("$3.00");
        infoList.add("The tomato is the edible, often red berry of the plant Solanum lycopersicum, commonly known as a tomato plant.");

        wordList.add("Pizza");
        imgList.add("pizza");
        priceList.add("$1.99");
        infoList.add("savory dish of Italian origin consisting of a usually round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients");

        wordList.add("Cheese");
        imgList.add("cheese");
        priceList.add("$4.50");
        infoList.add("dairy product, derived from milk and produced in wide ranges of flavours, textures and forms by coagulation of the milk protein casein.");

        wordList.add("Ground Beef");
        imgList.add("beef");
        priceList.add("$5.00");
        infoList.add("Ground beef, minced beef or beef mince is beef that has been finely chopped with a knife or a meat grinder or mincing machine.");

        wordList.add("Bananas");
        imgList.add("banana");
        priceList.add("$1.50");
        infoList.add("A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa.");

        wordList.add("Apples");
        imgList.add("apple");
        priceList.add("$2.00");
        infoList.add("An apple is an edible fruit produced by an apple tree.");

        wordList.add("Onions");
        imgList.add("onion");
        priceList.add("$1.50");
        infoList.add("The onion, also known as the bulb onion or common onion, is a vegetable that is the most widely cultivated species of the genus Allium.");

        wordList.add("Potatoes");
        imgList.add("potato");
        priceList.add("$3.20");
        infoList.add("The potato is a root vegetable native to the Americas, a starchy tuber of the plant Solanum tuberosum.");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyleView = findViewById(R.id.recyclerview);
        ListAdapter adapter = new ListAdapter(this, wordList, imgList, priceList, infoList);

        recyleView.setAdapter(adapter);
        recyleView.setLayoutManager(new LinearLayoutManager(this));
    }
}