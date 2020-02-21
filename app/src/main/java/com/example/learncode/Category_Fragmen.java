package com.example.learncode;


import android.R.layout;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

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
        View view =  inflater.inflate(R.layout.fragment_category_, container, false);
        int[] arrayListImage = {R.drawable.background,R.drawable.background,R.drawable.background,R.drawable.background,R.drawable.background,R.drawable.background};
        String[] arrayListITitle = {"Title","Title","Title","Title","Title","Title"};


         gridView = view.findViewById(R.id.gridview);

        gridAdapter = new GridAdapte(this,arrayListITitle,arrayListImage);
        gridView.setAdapter(gridAdapter);
        return view;
    }




}
