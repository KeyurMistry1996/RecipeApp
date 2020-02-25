package com.example.learncode;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<String> name;
    private ArrayList<String> description;
    private ArrayList<Integer> images;
    private ArrayList<String> ingredients;
    private ArrayList<String> recipes;
    private  onClickInterfce onClickInterfce;

    public MyAdapter(ArrayList<String> name, ArrayList<String> description, ArrayList<Integer> images, ArrayList<String> ingredients, ArrayList<String> recipes,onClickInterfce onClickInterfce) {
        this.name = name;
        this.description = description;
        this.images = images;
        this.ingredients = ingredients;
        this.recipes = recipes;
        this.onClickInterfce = onClickInterfce;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem,onClickInterfce);
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




    public  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
 TextView tvname;
 TextView tvdescription;
 ImageView ivImage;
 LinearLayout linearLayout;
 onClickInterfce onClickInterfce;

        public ViewHolder(@NonNull View itemView,onClickInterfce onClickInterfce)  {
            super(itemView);
            this.tvname = itemView.findViewById(R.id.tvTitle);
            this.tvdescription = itemView.findViewById(R.id.tvDescription);
            this.ivImage = itemView.findViewById(R.id.image_Image);
            this.linearLayout = itemView.findViewById(R.id.linear);
            this.onClickInterfce = onClickInterfce;
           itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
               onClickInterfce.onClcick(getAdapterPosition());
        }
    }

    public interface onClickInterfce {
        void onClcick(int position);

    }
}
