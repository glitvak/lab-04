package com.example.lab04;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    @NonNull
    private LinkedList<String> name = new LinkedList<>();
    private LinkedList<String> images = new LinkedList<>();
    private LinkedList<String> price = new LinkedList<>();
    private LinkedList<String> info = new LinkedList<>();
    private Context context;
    private LayoutInflater mInflater;

    public ListAdapter(Context context, LinkedList<String> wordList, LinkedList<String> imgList, LinkedList<String> price, LinkedList<String> infoList) {

        this.name = wordList;
        this.images = imgList;
        this.price = price;
        this.info = infoList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.name.setText(this.name.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("item_name", name.get(position));
                intent.putExtra("url", images.get(position));
                intent.putExtra("item_desc", info.get(position));
                intent.putExtra("item_price", price.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.name.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout parentLayout;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            name = itemView.findViewById(R.id.textView3);
        }
    }
}
