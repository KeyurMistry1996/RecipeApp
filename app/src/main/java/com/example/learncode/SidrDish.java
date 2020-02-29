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
        name.add("Vegetable and Goat Cheese Phyllo Pie");
        description.add("Try this satisfying vegetable pie as a vegetarian main course or a side dish for your favorite meal. ");
        images.add(R.drawable.vegetableandoatheesehylloiesized);
        ingredients.add("Cooking spray\n" +
                "1 Tbsp. olive oil (extra virgin preferred)\n" +
                "4-5 medium green onions (about 1 cup), chopped\n" +
                "2 medium zucchini (thinly sliced)\n" +
                "10 oz. frozen, chopped spinach (thawed, squeezed dry)\n" +
                "1/4 cup chopped, fresh parsley\n" +
                "2 Tbsp. chopped, fresh mint\n" +
                "2 medium garlic cloves (minced)\n" +
                "1 cup fat-free evaporated milk\n" +
                "1/2 cup egg substitute\n" +
                "1/4 tsp. pepper\n" +
                "1/8 tsp. ground nutmeg\n" +
                "6 phyllo dough sheets (each 14 x 9 inches), thawed\n" +
                "1 1/2 oz. soft goat cheese ");
        recipes.add("Preheat the oven to 375°F. Lightly spray a 9-inch pie pan with cooking spray. Set aside.\n" +
                "In a large nonstick skillet, heat the oil over medium heat, swirling to coat the bottom. Cook the green onions for 2 minutes, or until softened, stirring frequently.\n" +
                "Stir in the zucchini. Cook for 4 minutes, or until beginning to brown, stirring frequently.\n" +
                "Stir in the spinach, parsley, mint, and garlic. Cook for 2 minutes, stirring frequently.\n" +
                "In a small bowl, whisk together the evaporated milk, egg substitute, pepper, and nutmeg. Set aside.\n" +
                "Working quickly and keeping the unused phyllo covered with damp paper towels to prevent drying, place one sheet of phyllo in the pie pan, gently pressing on the bottom and side of the pan, letting the ends overhang the pan. Repeat with the remaining phyllo, placing the sheets in a crisscross pattern.\n" +
                "Spoon the green onion mixture over the phyllo. Pour in the milk mixture, swirling if needed to cover the surface. Dot with the cheese.\n" +
                "Fold the ends of the phyllo toward the center of the pan, leaving a circle of the filling showing. Lightly spray the phyllo with cooking spray. Gently press the phyllo on the filling so the phyllo will hold its shape.\n" +
                "Bake for 30 to 40 minutes, or until golden. Transfer to a cooling rack and let cool for 15 minutes. Cut into wedges. Serve warm. ");


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

        name.add("Tomato and Roasted Red Bell Pepper Soup");
        description.add("Try this vibrant vegetable soup using seasonal vegetables. ");
        images.add(R.drawable.tomatoandoastededellepperoup);
        ingredients.add("14.5oz.canned, no - salt - added, diced tomatoes(undrained)\n" +
                "1 3/4 cups fat-free, low-sodium chicken broth\n" +
                        "1/2 cup chopped, roasted red bell peppers, drained if bottled\n" +
                        "1 Tbsp. dried basil (crumbled)\n" +
                        "1/2 tsp. dried oregano (crumbled)\n" +
                        "1/8 tsp. crushed red pepper flakes (optional)\n" +
                        "2 tsp. olive oil (extra virgin preferred)\n" +
                        "1/4 tsp. sugar\n" +
                        "1/8 tsp. salt\n" +
                        "1/4 cup chopped, fresh parsley ");
        recipes.add("In a medium saucepan, stir together the tomatoes with liquid, broth, roasted peppers, basil, oregano, and red pepper flakes. Bring to a boil over high heat. Reduce the heat and simmer, covered, for 10 minutes. Remove from the heat. Stir in the oil, sugar, and salt. Serve sprinkled with the parsley. ");

        name.add("Spicy Oven-Roasted Chickpeas - Hot Chicks");
        description.add("This Middle Eastern appetizer recipe is best served right out of the oven when the chickpeas are at the height of their crispiness. They make a great, fiber-friendly afternoon snack. ");
        images.add(R.drawable.hotchickssized);
        ingredients.add("2 (15.5-ounce) canned, no-salt-added chickpeas (garbanzo beans) (drained, rinsed)\n" +
                "2 Tbsp. canola oil\n" +
                "2 tsp. sodium-free chili powder\n" +
                "1/2 tsp. sweet paprika\n" +
                "1/4 tsp. garlic powder\n" +
                "1/4 tsp. salt\n" +
                "1/4 tsp. ground black pepper\n" +
                "1/8 tsp. ground cayenne pepper ");
        recipes.add("Preheat oven to 425°F.\n" +
                "Line a large rimmed baking sheet with foil. Drain and rinse chickpeas; add to the baking sheet. Using a few paper towels, blot the chickpeas to remove excess liquid.\n" +
                "In a small bowl, combine the oil and spices. Mix to combine. Pour oil over chickpeas; using a spatula or hands, mix together so chickpeas are coated with spices.\n" +
                "Roast chickpeas in the preheated oven until crispy, about 35 minutes, rotating and shaking the pan halfway through the cooking process. Remove from oven and serve. ");

        name.add("Spring Vegetable Rolls with Shrimp");
        description.add("This kid-friendly, Simple Cooking with Heart recipe is great a way to introduce your whole family to recipes with Asian flavors but with familiar ingredients. ");
        images.add(R.drawable.springvegetablerollswithshrimp);
        ingredients.add("18 frozen, cooked shrimp, peeled and deveined, about 6 ounces\n" +
                "4 cups water in a sauce pan\n" +
                "1 cup fresh cilantro (stems discarded)\n" +
                "1 carrot (peeled, shredded)\n" +
                "1 small cucumber, peeled and cut in half lengthwise, into 1/8 inch slices and then into thin matchsticks 2-3 inches long\n" +
                "1 small zucchini, cut in half lengthwise, then into 1/8 inch slices and then into thin matchsticks 2-3 inches long\n" +
                "1 1/2 cups mung bean sprouts\n" +
                "1 cup fresh mint (stems discarded)\n" +
                "3 lettuce leaves, (any variety but iceberg, due to firmer texture), cut in half\n" +
                "6 8 1/2 - inch dried round rice paper wrappers");
        recipes.add("Combine the peanut butter, 3 tablespoons of water, garlic, Hoisin sauce and hot sauce (optional) in a small bowl. Mix with a fork, cover and microwave for 20-30 seconds (don’t go longer or it could bubble over and make a mess). Remove from microwave and mix well.\n" +
                "Fold the bottom half of the rice paper wrapper over the filling. Holding the whole thing firmly in place, fold the sides of the wrapper in.\n" +
                "Then, pressing firmly down to hold the folds in place, roll the entire wrapper horizontally up from the bottom to the top.\n" +
                "Turn the roll so that the seam faces down and the row of shrimp faces up. Place it on a dish or plastic container and cover loosely with plastic wrap. Repeat with the remaining wrappers and fillings. Leave ¼ inch between each spring roll on the sheet so they don’t stick together.\n" +
                "Replace the water in the pan or dish with hot tap water as needed.\n" +
                "If you are not eating them right away, store them on a dish or in a plastic container that’s roomy enough to hold them without touching. Place a damp paper towel over them to keep the rolls moist. Cover with plastic wrap or the container cover and refrigerate until ready to serve.\n" +
                "Add 1-2 tablespoons of water to the sauce to get a less thick texture.\n" +
                "Thaw the shrimp and set aside in a bowl or plate.\n" +
                "Place the cilantro leaves, mint leaves, mung bean sprouts, carrot, cucumber and lettuce leaves each in separate bowls or plates.\n" +
                "Arrange them in the following order around a large cutting board or other flat surface: rice paper wrappers, shrimp, cilantro, zucchini, cucumbers, carrot, bean sprouts, mint, and lettuce.\n" +
                "Place a clean, damp kitchen towel on your work surface. Fill a medium frying pan or wide, shallow dish large enough to hold the rice paper wrappers with hot tap water.\n" +
                "Working with 1 wrapper at a time, completely cover the wrapper with water until it is soft and pliable, about 15-30 seconds. Remove from the water and place it on the towel, keeping it as flat and unwrinkled as possible.\n" +
                "Working quickly, lay 3 shrimp half an inch apart in a horizontal row in the middle of the wrapper.\n" +
                "Lay a cilantro sprig on the shrimp, then add 1 Tablespoon zucchini and 1 Tablespoon cucumber over the shrimp, followed by 1 tablespoons carrot, a small handful of bean sprouts (about 2 Tablespoons), 2-3 mint leaves, 1 sprig of cilantro, and half a lettuce leaf. Be sure and spread these evenly over 3-4 inches, with the matchstick vegetables lining up, so they don’t make holes in the delicate rice wrapper and the spring roll has a uniform shape when done. ");

        name.add("Vegetable and Goat Cheese Phyllo Pie");
        description.add("Try this satisfying vegetable pie as a vegetarian main course or a side dish for your favorite meal. ");
        images.add(R.drawable.vegetableandoatheesehylloiesized);
        ingredients.add("Cooking spray\n" +
                "1 Tbsp. olive oil (extra virgin preferred)\n" +
                "4-5 medium green onions (about 1 cup), chopped\n" +
                "2 medium zucchini (thinly sliced)\n" +
                "10 oz. frozen, chopped spinach (thawed, squeezed dry)\n" +
                "1/4 cup chopped, fresh parsley\n" +
                "2 Tbsp. chopped, fresh mint\n" +
                "2 medium garlic cloves (minced)\n" +
                "1 cup fat-free evaporated milk\n" +
                "1/2 cup egg substitute\n" +
                "1/4 tsp. pepper\n" +
                "1/8 tsp. ground nutmeg\n" +
                "6 phyllo dough sheets (each 14 x 9 inches), thawed\n" +
                "1 1/2 oz. soft goat cheese ");
        recipes.add("Preheat the oven to 375°F. Lightly spray a 9-inch pie pan with cooking spray. Set aside.\n" +
                "In a large nonstick skillet, heat the oil over medium heat, swirling to coat the bottom. Cook the green onions for 2 minutes, or until softened, stirring frequently.\n" +
                "Stir in the zucchini. Cook for 4 minutes, or until beginning to brown, stirring frequently.\n" +
                "Stir in the spinach, parsley, mint, and garlic. Cook for 2 minutes, stirring frequently.\n" +
                "In a small bowl, whisk together the evaporated milk, egg substitute, pepper, and nutmeg. Set aside.\n" +
                "Working quickly and keeping the unused phyllo covered with damp paper towels to prevent drying, place one sheet of phyllo in the pie pan, gently pressing on the bottom and side of the pan, letting the ends overhang the pan. Repeat with the remaining phyllo, placing the sheets in a crisscross pattern.\n" +
                "Spoon the green onion mixture over the phyllo. Pour in the milk mixture, swirling if needed to cover the surface. Dot with the cheese.\n" +
                "Fold the ends of the phyllo toward the center of the pan, leaving a circle of the filling showing. Lightly spray the phyllo with cooking spray. Gently press the phyllo on the filling so the phyllo will hold its shape.\n" +
                "Bake for 30 to 40 minutes, or until golden. Transfer to a cooling rack and let cool for 15 minutes. Cut into wedges. Serve warm. ");


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

        name.add("Tomato and Roasted Red Bell Pepper Soup");
        description.add("Try this vibrant vegetable soup using seasonal vegetables. ");
        images.add(R.drawable.tomatoandoastededellepperoup);
        ingredients.add("14.5oz.canned, no - salt - added, diced tomatoes(undrained)\n" +
                "1 3/4 cups fat-free, low-sodium chicken broth\n" +
                "1/2 cup chopped, roasted red bell peppers, drained if bottled\n" +
                "1 Tbsp. dried basil (crumbled)\n" +
                "1/2 tsp. dried oregano (crumbled)\n" +
                "1/8 tsp. crushed red pepper flakes (optional)\n" +
                "2 tsp. olive oil (extra virgin preferred)\n" +
                "1/4 tsp. sugar\n" +
                "1/8 tsp. salt\n" +
                "1/4 cup chopped, fresh parsley ");
        recipes.add("In a medium saucepan, stir together the tomatoes with liquid, broth, roasted peppers, basil, oregano, and red pepper flakes. Bring to a boil over high heat. Reduce the heat and simmer, covered, for 10 minutes. Remove from the heat. Stir in the oil, sugar, and salt. Serve sprinkled with the parsley. ");

        name.add("Spicy Oven-Roasted Chickpeas - Hot Chicks");
        description.add("This Middle Eastern appetizer recipe is best served right out of the oven when the chickpeas are at the height of their crispiness. They make a great, fiber-friendly afternoon snack. ");
        images.add(R.drawable.hotchickssized);
        ingredients.add("2 (15.5-ounce) canned, no-salt-added chickpeas (garbanzo beans) (drained, rinsed)\n" +
                "2 Tbsp. canola oil\n" +
                "2 tsp. sodium-free chili powder\n" +
                "1/2 tsp. sweet paprika\n" +
                "1/4 tsp. garlic powder\n" +
                "1/4 tsp. salt\n" +
                "1/4 tsp. ground black pepper\n" +
                "1/8 tsp. ground cayenne pepper ");
        recipes.add("Preheat oven to 425°F.\n" +
                "Line a large rimmed baking sheet with foil. Drain and rinse chickpeas; add to the baking sheet. Using a few paper towels, blot the chickpeas to remove excess liquid.\n" +
                "In a small bowl, combine the oil and spices. Mix to combine. Pour oil over chickpeas; using a spatula or hands, mix together so chickpeas are coated with spices.\n" +
                "Roast chickpeas in the preheated oven until crispy, about 35 minutes, rotating and shaking the pan halfway through the cooking process. Remove from oven and serve. ");

        name.add("Spring Vegetable Rolls with Shrimp");
        description.add("This kid-friendly, Simple Cooking with Heart recipe is great a way to introduce your whole family to recipes with Asian flavors but with familiar ingredients. ");
        images.add(R.drawable.springvegetablerollswithshrimp);
        ingredients.add("18 frozen, cooked shrimp, peeled and deveined, about 6 ounces\n" +
                "4 cups water in a sauce pan\n" +
                "1 cup fresh cilantro (stems discarded)\n" +
                "1 carrot (peeled, shredded)\n" +
                "1 small cucumber, peeled and cut in half lengthwise, into 1/8 inch slices and then into thin matchsticks 2-3 inches long\n" +
                "1 small zucchini, cut in half lengthwise, then into 1/8 inch slices and then into thin matchsticks 2-3 inches long\n" +
                "1 1/2 cups mung bean sprouts\n" +
                "1 cup fresh mint (stems discarded)\n" +
                "3 lettuce leaves, (any variety but iceberg, due to firmer texture), cut in half\n" +
                "6 8 1/2 - inch dried round rice paper wrappers");
        recipes.add("Combine the peanut butter, 3 tablespoons of water, garlic, Hoisin sauce and hot sauce (optional) in a small bowl. Mix with a fork, cover and microwave for 20-30 seconds (don’t go longer or it could bubble over and make a mess). Remove from microwave and mix well.\n" +
                "Fold the bottom half of the rice paper wrapper over the filling. Holding the whole thing firmly in place, fold the sides of the wrapper in.\n" +
                "Then, pressing firmly down to hold the folds in place, roll the entire wrapper horizontally up from the bottom to the top.\n" +
                "Turn the roll so that the seam faces down and the row of shrimp faces up. Place it on a dish or plastic container and cover loosely with plastic wrap. Repeat with the remaining wrappers and fillings. Leave ¼ inch between each spring roll on the sheet so they don’t stick together.\n" +
                "Replace the water in the pan or dish with hot tap water as needed.\n" +
                "If you are not eating them right away, store them on a dish or in a plastic container that’s roomy enough to hold them without touching. Place a damp paper towel over them to keep the rolls moist. Cover with plastic wrap or the container cover and refrigerate until ready to serve.\n" +
                "Add 1-2 tablespoons of water to the sauce to get a less thick texture.\n" +
                "Thaw the shrimp and set aside in a bowl or plate.\n" +
                "Place the cilantro leaves, mint leaves, mung bean sprouts, carrot, cucumber and lettuce leaves each in separate bowls or plates.\n" +
                "Arrange them in the following order around a large cutting board or other flat surface: rice paper wrappers, shrimp, cilantro, zucchini, cucumbers, carrot, bean sprouts, mint, and lettuce.\n" +
                "Place a clean, damp kitchen towel on your work surface. Fill a medium frying pan or wide, shallow dish large enough to hold the rice paper wrappers with hot tap water.\n" +
                "Working with 1 wrapper at a time, completely cover the wrapper with water until it is soft and pliable, about 15-30 seconds. Remove from the water and place it on the towel, keeping it as flat and unwrinkled as possible.\n" +
                "Working quickly, lay 3 shrimp half an inch apart in a horizontal row in the middle of the wrapper.\n" +
                "Lay a cilantro sprig on the shrimp, then add 1 Tablespoon zucchini and 1 Tablespoon cucumber over the shrimp, followed by 1 tablespoons carrot, a small handful of bean sprouts (about 2 Tablespoons), 2-3 mint leaves, 1 sprig of cilantro, and half a lettuce leaf. Be sure and spread these evenly over 3-4 inches, with the matchstick vegetables lining up, so they don’t make holes in the delicate rice wrapper and the spring roll has a uniform shape when done. ");


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
