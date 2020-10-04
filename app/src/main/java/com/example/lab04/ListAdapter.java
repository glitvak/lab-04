package com.example.lab04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.LinkedList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.WordViewHolder> {
    @NonNull
    @Override
    private LinkedList<String> name = new LinkedList<>();
    private LinkedList<String> mImages = new LinkedList<>();
    private LinkedList<Double> price = new LinkedList<>();
    private LinkedList<String> info = new LinkedList<>();
    private Context mContext;

    public ListAdapter(Context context, LinkedList<String> wordList, LinkedList<String> imgList, LinkedList<Double> price, LinkedList<String> infoList) {

        this.name = wordList;
        this.mImages = imgList;
        this.price = price;
        this.info = infoList;
        this.mContext = context;
    }

    public ListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.WordViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class WordViewHolder extends ViewHolder implements View.OnClickListener {

        public WordViewHolder(@NonNull View itemView, ListAdapter adapter) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
