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

public class lunch extends AppCompatActivity {
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

        name.add("Strawberry Jicama Cucumber Salad");
        description.add("A refreshing citrus picnic salad with a mixture of strawberries, jicama, cucumber, jalapeno, and cilantro topped with a light dressing of lime juice, no-calorie sweetener, olive oil, and poppy seeds.");
        images.add(R.drawable.strawberryjicamacucumbersalad);
        ingredients.add("\n" +
                "2 cups strawberries (washed, hulled, chopped)\n" +
                "1 jicama (peeled, chopped)\n" +
                "1 medium cucumber (peeled, chopped)\n" +
                "1 small jalapeño, seeded, finely chopped (note: for more spice, leave the seeds and white membrane intact. For less spice, omit)\n" +
                "1 Tbsp. cilantro (finely chopped)\n" +
                "2 Tbsp. lime juice (fresh, or, from jar)\n" +
                "1 Tbsp. extra virgin olive oil\n" +
                "1 Tbsp. no-calorie sweetener (granulated, 1 1/2 packets)\n" +
                "1 tsp. poppy seeds");
        recipes.add("In a medium bowl, combine strawberries, jicama, cucumber, jalapeno, and cilantro. Toss lightly.\n" +
                "In a small bowl, whisk together lime juice, olive oil and no-calorie sweetener.\n" +
                "Add lime juice mixture to strawberry mixture and toss lightly.\n" +
                "Sprinkle with poppy seeds. ");

        name.add("Spinach Salad with Orange Vinaigrette");
        description.add("Nuts add texture to this easy spinach salad recipe with a homemade dressing. ");
        images.add(R.drawable.spinachsaladwithorangevinaigrettesized);
        ingredients.add("6 oz. fresh spinach\n" +
                "2 medium Italian plum (Roma) tomatoes (sliced crosswise)\n" +
                "1 oz. crumbled soft goat cheese (1/4 cup)\n" +
                "1 Tbsp. imitation bacon bits\n" +
                "2 Tbsp. sliced almonds (dry-roasted)\n" +
                "2 tsp. olive oil (extra virgin preferred)\n" +
                "2 medium green onions (thinly sliced)\n" +
                "1/4 cup fresh orange juice\n" +
                "2 Tbsp. white wine vinegar\n" +
                "1 Tbsp. light brown sugar\n" +
                "1/8 tsp. pepper ");
        recipes.add("In a large serving bowl, make one layer each, in order, of the spinach, tomatoes, goat cheese, bacon bits and almonds.\n" +
                "In a small skillet, heat the oil over medium heat, swirling to coat the bottom. Cook the green onions for 1 to 2 minutes, or until almost soft, stirring occasionally. Stir in the remaining dressing ingredients. Simmer for 1 to 2 minutes, or until the brown sugar is dissolved and the mixture is heated through, stirring occasionally. Pour over the salad ");

        name.add("Roasted Carrots, Beets, and Red Onion Wedges");
        description.add("This colorful side dish couldn't be easier to make. ");
        images.add(R.drawable.roastedcarrotsbeetsandredonionwedgessized);
        ingredients.add("Cooking spray\n" +
                "2 beets (about 5 ounces each), peeled, cut into 1/2-inch wedges, and patted dry with paper towels\n" +
                "3 small carrots (about 2 ounces each), cut crosswise into 2-inch pieces (not baby carrots)\n" +
                "1 medium red onion (cut into 1/2-inch wedges)\n" +
                "2 tsp. olive oil (extra virgin preferred)\n" +
                "1/2 tsp. dried oregano (crumbled)\n" +
                "1/8 tsp. salt ");
        recipes.add("Preheat the oven to 425°F. Line a large baking sheet with aluminum foil to keep it from getting stained. Lightly spray the foil with cooking spray.\n" +
                        "Put the beets, carrots, and onion wedges on the foil. Drizzle the oil and sprinkle the oregano and salt over the vegetables, stirring gently to coat. Arrange the vegetables in a single layer so they don’t touch.\n" +
                        "Roast for 15 minutes. Stir. Roast for 10 minutes, or until the vegetables are just tender when pierced with a fork. ");

        name.add("Picnic Cole Slaw");
        description.add("Perfect for a picnic or potluck, this colorful veggie will have guests asking for more. ");
        images.add(R.drawable.picnicslawsized);
        ingredients.add("8 oz. packaged cole slaw mix\n" +
                "1 cup carrot (cut into matchstick-size strips)\n" +
                "1 medium green bell pepper (chopped)\n" +
                "1/2 cup finely chopped onion\n" +
                "6 medium radishes (thinly sliced, halved)\n" +
                "1/4 cup vinegar\n" +
                "3 Tbsp. sugar\n" +
                "1/2 tsp. salt\n" +
                "1/4 tsp. pepper ");
        recipes.add("In a large bowl, gently toss together all the ingredients. Cover with plastic wrap and refrigerate for 15 minutes to 1 hour for peak flavor and texture.");

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
