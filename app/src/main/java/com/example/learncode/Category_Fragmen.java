package com.example.learncode;


import android.R.layout;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;


/**
 * A simple {@link Fragment} subclass.
 */
public class Category_Fragmen extends Fragment {
    GridView gridView;
    GridAdapte gridAdapter;

    public Category_Fragmen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view =  inflater.inflate(R.layout.fragment_category_, container, false);
         final ArrayList<Integer> arrayListImage = new ArrayList<Integer>();
         arrayListImage.add(R.drawable.appetizers_image);
         arrayListImage.add(R.drawable.breakfast_image);
         arrayListImage.add(R.drawable.dessert_image);
         arrayListImage.add(R.drawable.dinner_image);
         arrayListImage.add(R.drawable.lunch_image);
         arrayListImage.add(R.drawable.side_dishes_image);

        String[] arrayListITitle = {"Appetizers","Breakfast","Desserts","Dinner","Lunch","Side Dishes"};


         gridView = view.findViewById(R.id.gridview);

        gridAdapter = new GridAdapte(this,arrayListITitle,arrayListImage);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int idSelected = arrayListImage.get(position);
                if (idSelected == R.drawable.appetizers_image) {
                    Intent intent = new Intent(parent.getContext(),Appetizer_Activity.class);
                    startActivity(intent);
                }
                else if(idSelected == R.drawable.breakfast_image) {
                    Intent intent = new Intent(parent.getContext(), Breakfast_Activity.class);
                    startActivity(intent);

                }
                else if(idSelected == R.drawable.side_dishes_image) {
                    Intent intent = new Intent(parent.getContext(), SidrDish.class);
                    startActivity(intent);

                }
                else if(idSelected == R.drawable.dessert_image) {
                    Intent intent = new Intent(parent.getContext(), Dessert.class);
                    startActivity(intent);

                }
                else if(idSelected == R.drawable.dinner_image) {
                    Intent intent = new Intent(parent.getContext(), Dinner.class);
                    startActivity(intent);

                }
                else if(idSelected == R.drawable.lunch_image) {
                    Intent intent = new Intent(parent.getContext(), lunch.class);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(getContext(), "Please Select Item", Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;
    }




}
