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

public class Dessert extends AppCompatActivity {

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
        name.add("Apples with Almond-Apricot Sauce");
        description.add("Baked apples are always a treat, but coring whole apples can be a hassle. Just buy larger apples and cut them in half! Then all you have to do is scoop out the easily accessible core, add the sweet toppings, and let your slow cooker take it from there. ");
        images.add(R.drawable.applesalmondapricotsauce);
        ingredients.add("Cooking spray\n" +
                "2 tablespoons water\n" +
                "2 large apples (about 8 ounces each), halved and cored\n" +
                "1/4 cup chopped almonds\n" +
                "2 tablespoons chopped dried apricots\n" +
                "2 tablespoons firmly packed dark brown sugar\n" +
                "1/4 teaspoon ground ginger (or)\n" +
                "OR\n" +
                "1/4 teaspoon ground allspice\n" +
                "1/2 teaspoon ground cinnamon\n" +
                "1/2 teaspoon vanilla extract\n" +
                "1 tablespoon plus 1 teaspoon light tub margarine ");
        recipes.add("Lightly spray the slow cooker with cooking spray. Pour in the water. Add the apple halves with the cut side up.\n" +
                "In a small bowl, stir together the remaining ingredients except the margarine. Spoon onto each apple half. Top each with 1 teaspoon margarine. Cook, covered, on low for 2 to 2 1/2 hours or on high for 1 hour to 1 hour 15 minutes, or until just tender. Be careful not to overcook; the apples will continue to cook while cooling.\n" +
                "Carefully transfer the apples to plates, leaving the sauce in the slow cooker. Stir the sauce. Spoon over the apples. Let cool completely, about 30 minutes. The sauce will thicken slightly while cooling. ");


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

        name.add("Raspberry-Mango Breakfast Parfaits");
        description.add("For breakfast or dessert, this parfait makes delicious use of seasonal fruits. ");
        images.add(R.drawable.raspberrymangobreakfastparfaitssized);
        ingredients.add("fresh or frozen unsweetened raspberries, thawed if frozen\n" +
                "1 medium mango (diced)\n" +
                "4 6-ounce containers fat-free, sugar-free vanilla yogurt\n" +
                "1 Tbsp. sugar\n" +
                "1/2 tsp. ground cinnamon ");
        recipes.add("In each of 4 parfait glasses or wine goblets, spoon 2 tablespoons raspberries, 2 tablespoons mango, and a heaping 1/3 cup yogurt. Repeat the layers, using all the remaining yogurt.\n" +
                "In a food processor or blender, process the remaining raspberries and mango with the sugar and cinnamon until smooth. Spoon over each serving. ");

        name.add("Southern Cornbread");
        description.add("This Southern side dish staple adds flavor to any meal. ");
        images.add(R.drawable.southerncornbreadsized);
        ingredients.add("Cooking spray\n" +
                "1 cup yellow cornmeal\n" +
                        "1/2 cup all-purpose flour\n" +
                        "1/2 cup whole-wheat flour\n" +
                        "2 Tbsp. sugar\n" +
                        "1/2 tsp. baking soda\n" +
                        "1/2 tsp. baking powder\n" +
                        "1/8 tsp. salt\n" +
                        "1 cup no-salt-added cream-style corn (undrained)\n" +
                        "1/2 cup frozen whole kernel corn (thawed)\n" +
                        "1/2 cup low-fat buttermilk\n" +
                        "1/4 cup fat-free milk\n" +
                        "1 large egg\n" +
                        "2 Tbsp. canola oil\n" +
                        "OR\n" +
                        "2 Tbsp corn oil ");
        recipes.add("Preheat the oven to 425°F. Lightly spray a 9-inch square or round baking pan or pie pan with cooking spray.\n" +
                "In a large bowl, stir together the cornmeal, both flours, sugar, baking soda, baking powder, and salt. Make a well in the center.\n" +
                "In a medium bowl, stir together the remaining ingredients. Pour into the well in the flour mixture, stirring just until moistened. Spoon into the baking pan. Lightly spray the top of the batter with cooking spray.\n" +
                "Bake for 20 to 25 minutes, or until a wooden toothpick inserted in the center comes out clean. Transfer the pan to a cooling rack and let cool for 5 to 10 minutes before slicing. ");

        name.add("Raspberry-Lemonade Slushie");
        description.add("Chill out when the weather’s warm and treat yourself to this frozen drink that’s a blend of seasonal fresh raspberries and fresh lemon juice. ");
        images.add(R.drawable.raspberrylemonadeslushie);
        ingredients.add("12 oz raspberries\n" +
                "1 cup sugar substitute\n" +
                "1/2 cup fresh lemon juice\n" +
                "5 cups ice cubes ");
        recipes.add(
                "In a food processor or blender, process the raspberries, sugar substitute, and lemon juice until the raspberries are puréed.\n" +
                "Add the ice cubes. Process until the mixture is mostly smooth and has a slushie-like consistency. (It’s okay if there are a few ice chunks. Don’t overmix.)\n" +
                "Divide the slushie into cups. Serve immediately. ");

        name.add("Apples with Almond-Apricot Sauce");
        description.add("Baked apples are always a treat, but coring whole apples can be a hassle. Just buy larger apples and cut them in half! Then all you have to do is scoop out the easily accessible core, add the sweet toppings, and let your slow cooker take it from there. ");
        images.add(R.drawable.applesalmondapricotsauce);
        ingredients.add("Cooking spray\n" +
                "2 tablespoons water\n" +
                "2 large apples (about 8 ounces each), halved and cored\n" +
                "1/4 cup chopped almonds\n" +
                "2 tablespoons chopped dried apricots\n" +
                "2 tablespoons firmly packed dark brown sugar\n" +
                "1/4 teaspoon ground ginger (or)\n" +
                "OR\n" +
                "1/4 teaspoon ground allspice\n" +
                "1/2 teaspoon ground cinnamon\n" +
                "1/2 teaspoon vanilla extract\n" +
                "1 tablespoon plus 1 teaspoon light tub margarine ");
        recipes.add("Lightly spray the slow cooker with cooking spray. Pour in the water. Add the apple halves with the cut side up.\n" +
                "In a small bowl, stir together the remaining ingredients except the margarine. Spoon onto each apple half. Top each with 1 teaspoon margarine. Cook, covered, on low for 2 to 2 1/2 hours or on high for 1 hour to 1 hour 15 minutes, or until just tender. Be careful not to overcook; the apples will continue to cook while cooling.\n" +
                "Carefully transfer the apples to plates, leaving the sauce in the slow cooker. Stir the sauce. Spoon over the apples. Let cool completely, about 30 minutes. The sauce will thicken slightly while cooling. ");


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

        name.add("Raspberry-Mango Breakfast Parfaits");
        description.add("For breakfast or dessert, this parfait makes delicious use of seasonal fruits. ");
        images.add(R.drawable.raspberrymangobreakfastparfaitssized);
        ingredients.add("fresh or frozen unsweetened raspberries, thawed if frozen\n" +
                "1 medium mango (diced)\n" +
                "4 6-ounce containers fat-free, sugar-free vanilla yogurt\n" +
                "1 Tbsp. sugar\n" +
                "1/2 tsp. ground cinnamon ");
        recipes.add("In each of 4 parfait glasses or wine goblets, spoon 2 tablespoons raspberries, 2 tablespoons mango, and a heaping 1/3 cup yogurt. Repeat the layers, using all the remaining yogurt.\n" +
                "In a food processor or blender, process the remaining raspberries and mango with the sugar and cinnamon until smooth. Spoon over each serving. ");

        name.add("Southern Cornbread");
        description.add("This Southern side dish staple adds flavor to any meal. ");
        images.add(R.drawable.southerncornbreadsized);
        ingredients.add("Cooking spray\n" +
                "1 cup yellow cornmeal\n" +
                "1/2 cup all-purpose flour\n" +
                "1/2 cup whole-wheat flour\n" +
                "2 Tbsp. sugar\n" +
                "1/2 tsp. baking soda\n" +
                "1/2 tsp. baking powder\n" +
                "1/8 tsp. salt\n" +
                "1 cup no-salt-added cream-style corn (undrained)\n" +
                "1/2 cup frozen whole kernel corn (thawed)\n" +
                "1/2 cup low-fat buttermilk\n" +
                "1/4 cup fat-free milk\n" +
                "1 large egg\n" +
                "2 Tbsp. canola oil\n" +
                "OR\n" +
                "2 Tbsp corn oil ");
        recipes.add("Preheat the oven to 425°F. Lightly spray a 9-inch square or round baking pan or pie pan with cooking spray.\n" +
                "In a large bowl, stir together the cornmeal, both flours, sugar, baking soda, baking powder, and salt. Make a well in the center.\n" +
                "In a medium bowl, stir together the remaining ingredients. Pour into the well in the flour mixture, stirring just until moistened. Spoon into the baking pan. Lightly spray the top of the batter with cooking spray.\n" +
                "Bake for 20 to 25 minutes, or until a wooden toothpick inserted in the center comes out clean. Transfer the pan to a cooling rack and let cool for 5 to 10 minutes before slicing. ");

        name.add("Raspberry-Lemonade Slushie");
        description.add("Chill out when the weather’s warm and treat yourself to this frozen drink that’s a blend of seasonal fresh raspberries and fresh lemon juice. ");
        images.add(R.drawable.raspberrylemonadeslushie);
        ingredients.add("12 oz raspberries\n" +
                "1 cup sugar substitute\n" +
                "1/2 cup fresh lemon juice\n" +
                "5 cups ice cubes ");
        recipes.add(
                "In a food processor or blender, process the raspberries, sugar substitute, and lemon juice until the raspberries are puréed.\n" +
                        "Add the ice cubes. Process until the mixture is mostly smooth and has a slushie-like consistency. (It’s okay if there are a few ice chunks. Don’t overmix.)\n" +
                        "Divide the slushie into cups. Serve immediately. ");

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
