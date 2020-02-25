package com.example.learncode;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

class GridAdapte extends BaseAdapter {
    Category_Fragmen context;
    String[] arrayListTitle;
    ArrayList<Integer> arrayListImages;


    public GridAdapte(Category_Fragmen category_fragmen, String[] arrayListITitle, ArrayList<Integer> arrayListImage) {

       this.context = category_fragmen;
       this.arrayListTitle = arrayListITitle;
       this.arrayListImages = arrayListImage;
    }

    @Override
    public int getCount() {
        return arrayListImages.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayListTitle.length;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)  {

        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_model,parent,false);
        ImageView imageView = convertView.findViewById(R.id.gridImage);
        TextView textView = convertView.findViewById(R.id.gridTitle);
        imageView.setImageResource(arrayListImages.get(position));
        textView.setText(arrayListTitle[position]);
        return convertView;
    }



}
