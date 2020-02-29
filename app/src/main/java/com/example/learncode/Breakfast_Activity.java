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

public class Breakfast_Activity extends AppCompatActivity {
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


        name.add("Roman-Style Artichokes");
        description.add("This Italian-inspired dish pairs perfectly with risotto or pasta dishes.");
        images.add(R.drawable.romanstyleartichokes);
        ingredients.add("2 whole artichokes\n" +
                "1/2 cup dry white wine (regular or nonalcoholic), fat-free, low-sodium chicken broth, or water\n" +
                "1/2 cup water\n" +
                "2 tablespoons chopped, fresh Italian (flat-leaf) parsley\n" +
                "2 medium minced garlic cloves\n" +
                "1/2 teaspoon dried oregano (crumbled)\n" +
                "1/4 teaspoon salt\n" +
                "1 tablespoon olive oil (extra virgin preferred)");
        recipes.add("Working with one artichoke at a time, peel off and discard the tough outer leaves. Trim 1 inch from the top. Discard. Trim off any fibrous parts. Discard. Halve each artichoke lengthwise. Using a spoon, scrape out the fuzzy choke portion. Discard.\n" +
                "Pour the wine and water into the pressure cooker. Place the steaming rack in the cooker. Arrange the artichoke halves with the cut side up on the rack.\n" +
                "In a small bowl, stir together the parsley, garlic, oregano, and salt. Sprinkle over the artichokes. Secure the lid. Cook on high pressure for 10 minutes. Quickly release the pressure.\n" +
                "Transfer the artichokes to a platter. Drizzle with the oil. ");

        name.add("Homestyle Chicken Noodle Soup");
        description.add("A bowl of chicken noodle soup always equals comfort. The vegetables add nutrition and an aromatic flavor. This soup can be prepared at a moment’s notice and turns mealtime into a warm and satisfying experience. ");
        images.add(R.drawable.homestylechickennoodlesoup);
        ingredients.add("2 teaspoons olive oil\n" +
                "3 medium carrots (thinly sliced)\n" +
                "2 medium ribs of celery, leaves discarded, thinly sliced\n" +
                "1 small onion (diced)\n" +
                "4 cups fat-free, low-sodium chicken broth\n" +
                "1 1/2 pounds boneless, skinless chicken breasts, all visible fat discarded, cut into bite-size pieces.\n" +
                "3 cups water\n" +
                "3 tablespoons fresh Italian (flat-leaf) parsley, minced.\n" +
                "1/2 teaspoon dried thyme (crumbled)\n" +
                "1/4 teaspoon salt\n" +
                "1/4 teaspoon black pepper ((coarsely ground preferred))\n" +
                "6 ounces dried no-yolk noodles ");
        recipes.add("Heat the oil in the pressure cooker on sauté. Cook the carrots, celery, and onion for 3 minutes, or until the carrots and celery are tender and the onion is soft, stirring frequently. Stir in the broth, chicken, water, parsley, thyme, salt, and pepper.\n" +
                "Secure the lid. Cook on high pressure for 12 minutes. Allow the pressure to release naturally for 10 minutes, then quickly release any remaining pressure. Remove the pressure cooker lid.\n" +
                "Set the pressure cooker to sauté. Heat until the soup comes to a simmer. Stir in the noodles. Cook for 8 to 10 minutes, or until the noodles are tender, stirring frequently. ");

        name.add("Butternut Squash Soup");
        description.add("This golden soup soothes and comforts after a busy day. Many grocery stores now sell the squash already peeled and cubed, so preparation is even easier. ");
        images.add(R.drawable.butternutsquashsoup);
        ingredients.add("2 teaspoons canola or corn oil\n" +
                "2 medium shallots (chopped)\n" +
                "1 medium butternut squash, peeled and cubed (about 3 cups)\n" +
                "3 cups fat-free, low-sodium vegetable broth\n" +
                "2 teaspoons minced, peeled gingerroot\n" +
                "1/4 teaspoon salt\n" +
                "1/4 teaspoon black pepper ((coarsely ground preferred))\n" +
                "1/3 cup fat-free half-and-half\n" +
                "1/4 teaspoon freshly grated or ground nutmeg ");
        recipes.add("Heat the oil in the pressure cooker on sauté. Cook the shallots for 3 minutes, or until soft, stirring frequently. Turn off the pressure cooker.\n" +
                "Stir in the squash, broth, gingerroot, salt, and pepper. Secure the lid. Cook on high pressure for 20 minutes. Allow the pressure to release naturally for 10 minutes, then quickly release any remaining pressure. Turn off the pressure cooker. Remove the pressure cooker lid.\n" +
                "Allow the soup to cool slightly. Working in batches, transfer the soup to a blender (vent the blender lid) and puree until smooth. (Use caution as the soup and steam are hot and vent the blender lid away from you.) Return the soup to the pressure cooker.\n" +
                "Stir in the half-and-half. Cook on the sauté setting for 2 to 3 minutes, or until heated through, stirring frequently. Ladle the soup into bowls. Sprinkle with the nutmeg. ");

        name.add("Sweet Nutty Stir Fry");
        description.add("When you crave takeout but don’t want to load up on saturated fat and sodium, try this quick and crunchy meatless meal-in-one. ");
        images.add(R.drawable.sweetnuttystirfry);
        ingredients.add("4oz.dried, whole - grain vermicelli or spaghetti\n" +
                "2 tsp. curry powder\n" +
                "2 Tbsp. sugar\n" +
                "2 Tbsp. low-sodium soy sauce (lowest sodium available)\n" +
                "2 Tbsp. balsamic vinegar\n" +
                "1 tsp. cornstarch\n" +
                "1/4 tsp. crushed red pepper flakes\n" +
                "1/3 cup fresh orange juice\n" +
                "2 tsp. grated orange zest\n" +
                "1 tsp corn oil\n" +
                "1/2 cup thinly sliced onion\n" +
                "2 cups broccoli florets (about 5 ounces), cut into bite-size pieces\n" +
                "1 cup thinly sliced cabbage\n" +
                "1 cup chopped carrots (cut into matchstick-size strips)\n" +
                "1/2 cup unsalted, unoiled peanuts (dry-roasted) ");
        recipes.add("Prepare the pasta using the package directions, omitting the salt and oil and adding the curry powder. Drain well in a colander.\n" +
                "Meanwhile, in a small saucepan, combine the sugar, soy sauce, balsamic vinegar, cornstarch, red pepper flakes, and orange juice, stirring until the cornstarch is completely dissolved. Bring to a boil over medium-high heat and boil for 1 minute. Remove from the heat. Stir in the orange zest. Set aside.\n" +
                "In a large nonstick skillet, heat the oil over medium-high heat, swirling to coat the bottom. Cook the onion for 1 minute. Stir in the broccoli, cabbage, and carrots. Cook for 4 minutes, or until just tender-crisp, stirring frequently.\n" +
                "Transfer the pasta to a serving platter. Top with the broccoli mixture. Pour the sauce over all. Sprinkle with the peanuts. ");

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
