package com.example.learncode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SidrDish extends AppCompatActivity {
    ArrayList<String> name;
    ArrayList<String> description;
    ArrayList<Integer> images;
    ArrayList<String> ingredients;
    ArrayList<String> recipes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetizer_);

        name = new ArrayList<>();
        description = new ArrayList<>();
        images = new ArrayList<>();
        ingredients = new ArrayList<>();
        recipes = new ArrayList<>();
        addData();

        ListView listView =findViewById(R.id.apetizer_list);
        MyAdapter2 myListAdapater = new MyAdapter2(getApplicationContext(),name,description,images);
        listView.setAdapter( myListAdapater);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),RecipeInfo.class);
                intent.putExtra("Title",name.get(position));
                intent.putExtra("Description",description.get(position));
                intent.putExtra("Ingrediants",ingredients.get(position));
                intent.putExtra("Recipe",recipes.get(position));
                intent.putExtra("Image",images.get(position));
                startActivity(intent);
            }
        });
    }

    private void addData() {
        name.add("Mardi Gras Deviled Eggs");
        description.add("Celebrate Mardi Gras with these purple, gold, and green deviled eggs." +
                " Hard boiled eggs get pickled with purple cabbage to dye the whites naturally " +
                "and a little cajun seasoning goes in the yolk mixture to make these deviled eggs New Orleans approved! ");
        images.add(R.drawable.mardi_gras_deviled_eggs);
        ingredients.add("3 c. chopped purple cabbage\n" +
                "1 c. distilled vinegar\n" +
                "1 tbsp. granulated sugar\n" +
                "1/2 c. mayonnaise\n" +
                "1 tbsp. dijon mustard\n" +
                "1 tsp. hot sauce\n" +
                "1 tsp. cajun seasoning\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "Finely chopped chives, for garnish ");
        recipes.add("Place eggs in large pot and pour enough water over to cover completely. Bring to a boil, then turn off heat and cover pot." +
                " Let sit 11 minutes, then immediately remove eggs and place into a bowl of ice water. Peel eggs when cool enough to handle.\n" +
                "In another large pot, bring 3 cups water, cabbage, vinegar, and sugar to a boil. Let cool slightly, then strain out cabbage. \n" +
                "Place peeled eggs into a large bowl and pour cabbage liquid over. Refrigerate at least 3 hours and up to overnight. \n" +
                "Halve eggs and place yolks in a medium bowl. Add mayonnaise, mustard, and hot sauce to yolks and mash with a fork until smooth." +
                " Season with cajun seasoning, salt, and pepper. \n" +
                "Pipe yolk mixture back into whites and top with chives to serve. ");


        name.add("Kit Kat Egg Rolls");
        description.add("Fried candy bars have become a state fair staple. Kit Kat egg rolls makes the candy bar even crispier and with extra chocolate they" +
                " become even better! Kit Kat lovers will go crazy for this simple treat.");
        images.add(R.drawable.kit_kat_egg_rolls);
        ingredients.add("12 wonton wrappers\n" +
                "1/2 c. melted chocolate\n" +
                "12 mini Kit Kats\n" +
                "Vegetable oil, for frying\n" +
                "Powdered sugar, for dusting\n" +
                "Caramel, warmed, for dipping");
        recipes.add("Place wonton wrappers on a clean surface in a diamond shape. Spread a thin layer of melted chocolate in middle of wrapper and place a Kit Kat on top. " +
                "Fold bottom point over Kit Kat, then fold corners in. Wet top point with a little water then roll to seal. \n" +
                "In a medium skillet over medium heat, heat enough oil to come ½” up the side of pan. Working in batches, add Kit Kats to oil and fry until golden, 1 minute per side." +
                " Remove from oil and place on a paper towel lined plate. Repeat with remaining Kit Kats. \n" +
                "Dust with powdered sugar and serve with warmed caramel. ");

        name.add("Best-Ever Pozole");
        description.add("Don't let the time commitment scare you. It's as easy as bringing water to a boil and the longer you let it simmer, the better it will be. This soup is meant to be a little spicy," +
                " but adjust the heat to your liking by adding more or less of the chile puree. The cabbage will help cool things off a bit! ");
        images.add(R.drawable.best_ever_pozole);
        ingredients.add("3 lb. pork shoulder, cut into 2\" pieces\n" +
                "Kosher salt \n" +
                "Freshly ground black pepper\n" +
                "1 large yellow onion, quartered\n" +
                "3 cloves garlic, sliced\n" +
                "1 tsp. whole cloves\n" +
                "1 tsp. cumin seeds\n" +
                "1 bay leaf\n" +
                "4 c. low-sodium chicken broth\n" +
                "2 dried chiles de arbol, stem and seeds removed\n" +
                "2 dried ancho chiles, stem and seeds removed\n" +
                "2 dried guajillo chiles, stem and seeds removed\n" +
                "3 (15-oz.) cans hominy, drained and rinsed \n" +
                "Thinly sliced radishes, for serving\n" +
                "Thinly sliced green cabbage, for serving\n" +
                "Freshly chopped cilantro, for serving ");
        recipes.add("Season pork with salt and pepper. In a large pot over medium heat, add pork, onion, garlic, cloves, cumin seeds, bay leaf," +
                " and broth. Add enough water to cover pork by 2”. Bring to a boil, then cover and reduce heat to a simmer. Let simmer 1 ½ hours," +
                " skimming foam off top as necessary.  \n" +
                "Place dried chiles into a medium bowl and pour 2 cups boiling water over. Let soak 30 minutes. Place chiles and about " +
                "½ cup of their soaking liquid into a blender. Blend until smooth, adding more water as necessary. \n" +
                "Add chile puree and hominy to pot with pork. Continue to simmer, covered, until pork is very tender," +
                " 1 hour and 30 minutes more. \n" +
                "Serve pozole with radishes, cabbage, and cilantro. ");

        name.add("Best-Ever Pozole");
        description.add("Don't let the time commitment scare you. It's as easy as bringing water to a boil and the longer you let it simmer, the better it will be. This soup is meant to be a little spicy," +
                " but adjust the heat to your liking by adding more or less of the chile puree. The cabbage will help cool things off a bit! ");
        images.add(R.drawable.best_ever_pozole);
        ingredients.add("3 lb. pork shoulder, cut into 2\" pieces\n" +
                "Kosher salt \n" +
                "Freshly ground black pepper\n" +
                "1 large yellow onion, quartered\n" +
                "3 cloves garlic, sliced\n" +
                "1 tsp. whole cloves\n" +
                "1 tsp. cumin seeds\n" +
                "1 bay leaf\n" +
                "4 c. low-sodium chicken broth\n" +
                "2 dried chiles de arbol, stem and seeds removed\n" +
                "2 dried ancho chiles, stem and seeds removed\n" +
                "2 dried guajillo chiles, stem and seeds removed\n" +
                "3 (15-oz.) cans hominy, drained and rinsed \n" +
                "Thinly sliced radishes, for serving\n" +
                "Thinly sliced green cabbage, for serving\n" +
                "Freshly chopped cilantro, for serving ");
        recipes.add("Season pork with salt and pepper. In a large pot over medium heat, add pork, onion, garlic, cloves, cumin seeds, bay leaf," +
                " and broth. Add enough water to cover pork by 2”. Bring to a boil, then cover and reduce heat to a simmer. Let simmer 1 ½ hours," +
                " skimming foam off top as necessary.  \n" +
                "Place dried chiles into a medium bowl and pour 2 cups boiling water over. Let soak 30 minutes. Place chiles and about " +
                "½ cup of their soaking liquid into a blender. Blend until smooth, adding more water as necessary. \n" +
                "Add chile puree and hominy to pot with pork. Continue to simmer, covered, until pork is very tender," +
                " 1 hour and 30 minutes more. \n" +
                "Serve pozole with radishes, cabbage, and cilantro. ");

        name.add("Best-Ever Pozole");
        description.add("Don't let the time commitment scare you. It's as easy as bringing water to a boil and the longer you let it simmer, the better it will be. This soup is meant to be a little spicy," +
                " but adjust the heat to your liking by adding more or less of the chile puree. The cabbage will help cool things off a bit! ");
        images.add(R.drawable.best_ever_pozole);
        ingredients.add("3 lb. pork shoulder, cut into 2\" pieces\n" +
                "Kosher salt \n" +
                "Freshly ground black pepper\n" +
                "1 large yellow onion, quartered\n" +
                "3 cloves garlic, sliced\n" +
                "1 tsp. whole cloves\n" +
                "1 tsp. cumin seeds\n" +
                "1 bay leaf\n" +
                "4 c. low-sodium chicken broth\n" +
                "2 dried chiles de arbol, stem and seeds removed\n" +
                "2 dried ancho chiles, stem and seeds removed\n" +
                "2 dried guajillo chiles, stem and seeds removed\n" +
                "3 (15-oz.) cans hominy, drained and rinsed \n" +
                "Thinly sliced radishes, for serving\n" +
                "Thinly sliced green cabbage, for serving\n" +
                "Freshly chopped cilantro, for serving ");
        recipes.add("Season pork with salt and pepper. In a large pot over medium heat, add pork, onion, garlic, cloves, cumin seeds, bay leaf," +
                " and broth. Add enough water to cover pork by 2”. Bring to a boil, then cover and reduce heat to a simmer. Let simmer 1 ½ hours," +
                " skimming foam off top as necessary.  \n" +
                "Place dried chiles into a medium bowl and pour 2 cups boiling water over. Let soak 30 minutes. Place chiles and about " +
                "½ cup of their soaking liquid into a blender. Blend until smooth, adding more water as necessary. \n" +
                "Add chile puree and hominy to pot with pork. Continue to simmer, covered, until pork is very tender," +
                " 1 hour and 30 minutes more. \n" +
                "Serve pozole with radishes, cabbage, and cilantro. ");

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent;
        switch (id) {
            case R.id.my_profile:
                intent = new Intent(getApplicationContext(), MyProfile_Activity.class);
                startActivity(intent);
                return true;
            case R.id.about_us:
                intent = new Intent(getApplicationContext(),About_Us.class);
                startActivity(intent);
                return true;
            case R.id.contect_us:
                intent = new Intent(getApplicationContext(),Contect_Us.class);
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
