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

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.ViewHolder>  {

    public MyAdapter2(ArrayList<String> name, ArrayList<String> description, ArrayList<Integer> images) {
        this.name = name;
        this.description = description;
        this.images = images;
    }

    private ArrayList<String> name;
    private ArrayList<String> description;
    private ArrayList<Integer> images;
    @NonNull
    @Override
    public MyAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item2, parent, false);
        MyAdapter2.ViewHolder viewHolder = new MyAdapter2.ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter2.ViewHolder holder, int position) {

        holder.tvname2.setText(name.get(position));
        holder.tvdescription2.setText(description.get(position));
        holder.ivImage2.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvname2;
        TextView tvdescription2;
        CircleImageView ivImage2;
        LinearLayout linearLayout2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvname2 = itemView.findViewById(R.id.tvTitle2);
            this.tvdescription2 = itemView.findViewById(R.id.tvDescription2);
            this.ivImage2 = itemView.findViewById(R.id.image_Image2);
            this.linearLayout2 = itemView.findViewById(R.id.linear2);
        }
    }
}
