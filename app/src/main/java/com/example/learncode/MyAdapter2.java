package com.example.learncode;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MyAdapter2 extends BaseAdapter {
    private ArrayList<String> name;
    private ArrayList<String> description;
    private ArrayList<Integer> images;
    Appetizer_Activity appetizer_activity;

    public MyAdapter2(Appetizer_Activity appetizer_activity, ArrayList<String> name, ArrayList<String> description, ArrayList<Integer> images) {
        this.appetizer_activity = appetizer_activity;
        this.name = name;
        this.description=description;
        this.images = images;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(appetizer_activity).inflate(R.layout.list_item2, parent,false);

        TextView titleText = (TextView) convertView.findViewById(R.id.tvTitle2);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_Image2);
        TextView subtitleText = (TextView) convertView.findViewById(R.id.tvDescription2);

        titleText.setText(name.get(position));
        imageView.setImageResource(images.get(position));
        subtitleText.setText(description.get(position));

        return convertView;
    }
}
