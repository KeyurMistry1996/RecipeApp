package com.example.learncode;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Fragment extends Fragment {
    ArrayList<String> name;
    ArrayList<String> description;
    ArrayList<Integer> images;

    public Home_Fragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         name = new ArrayList<>();
         description = new ArrayList<>();
         images = new ArrayList<>();
         addData();


        View view = inflater.inflate(R.layout.fragment_home_, container, false);

        MyAdapter adapter = new MyAdapter(name,description,images);
        MyAdapter2 adapter2 = new MyAdapter2(name,description,images);

        RecyclerView recyclerView =  view.findViewById(R.id.recycler_View);
        RecyclerView recyclerView1 =  view.findViewById(R.id.recycler_View1);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        recyclerView.setAdapter(adapter);
        recyclerView1.setAdapter(adapter2);

        return view;
    }

    private void addData() {
        name.add("One");
        description.add("Description One");
        images.add(R.drawable.background);
        name.add("One");
        description.add("Description Two");
        images.add(R.drawable.home_icon);
        name.add("One");
        description.add("Description Three");
        images.add(R.drawable.home_icon);
        name.add("One");
        description.add("Description One");
        images.add(R.drawable.background);
        name.add("One");
        description.add("Description Two");
        images.add(R.drawable.home_icon);
        name.add("One");
        description.add("Description Three");
        images.add(R.drawable.home_icon);
        name.add("One");
        description.add("Description One");
        images.add(R.drawable.background);
        name.add("One");
        description.add("Description Two");
        images.add(R.drawable.home_icon);
        name.add("One");
        description.add("Description Three");
        images.add(R.drawable.home_icon);

    }

}
