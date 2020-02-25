package com.example.learncode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeInfo extends AppCompatActivity {
    ImageView imageView;
    TextView title,description,recipes,ingrediants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_info);

        imageView = findViewById(R.id.recipeImage);
        title = findViewById(R.id.recipe_Title);
        description = findViewById(R.id.recipe_description);
        recipes = findViewById(R.id.recipe);
        ingrediants = findViewById(R.id.recipe_Ingrediant);

        Intent intent = getIntent();

        title.setText( intent.getStringExtra("Title"));
        description.setText(intent.getStringExtra("Description"));
        recipes.setText(intent.getStringExtra("Recipe"));
        ingrediants.setText(intent.getStringExtra("Ingrediants"));
        imageView.setImageResource(intent.getIntExtra("Image",0));


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}
