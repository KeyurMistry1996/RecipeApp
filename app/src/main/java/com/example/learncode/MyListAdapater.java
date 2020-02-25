package com.example.learncode;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.prefs.BackingStoreException;

class MyListAdapater extends BaseAdapter {

    private ArrayList<String> name;
    private ArrayList<String> description;
    private ArrayList<Integer> images;

    Home_Fragment context;


    public MyListAdapater(Home_Fragment context, ArrayList<String> name, ArrayList<String> description, ArrayList<Integer> images) {


        this.description=description;
        this.images=images;
        this.name=name;
        this.context = context;
    }



    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_item2, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.tvTitle2);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image_Image2);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.tvDescription2);

        titleText.setText(name.get(position));
        imageView.setImageResource(images.get(position));
        subtitleText.setText(description.get(position));

        return rowView;

    }
}
