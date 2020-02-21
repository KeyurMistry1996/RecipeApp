package com.example.learncode;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    public MyAdapter(ArrayList<String> name, ArrayList<String> description, ArrayList<Integer> images) {
        this.name = name;
        this.description = description;
        this.images = images;
    }

    private ArrayList<String> name;
    private ArrayList<String> description;
    private ArrayList<Integer> images;
    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        holder.tvname.setText(name.get(position));
        holder.tvdescription.setText(description.get(position));
        holder.ivImage.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
 TextView tvname;
 TextView tvdescription;
 ImageView ivImage;
 LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvname = itemView.findViewById(R.id.tvTitle);
            this.tvdescription = itemView.findViewById(R.id.tvDescription);
            this.ivImage = itemView.findViewById(R.id.image_Image);
           this.linearLayout = itemView.findViewById(R.id.linear);
        }
    }
}
