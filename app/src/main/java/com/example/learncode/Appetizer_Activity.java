package com.example.learncode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Appetizer_Activity extends AppCompatActivity {
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
        name.add("Saucy Boneless Chicken \"Wings\" with Cherry Barbecue Sauce");
        description.add("This healthier-for-you version of the popular appetizer is perfect for game day and potluck meals. A sweet-tart sauce elevates these wings to new heights.");
        images.add(R.drawable.saucybonelesschickenwings);
        ingredients.add("1/2 teaspoon chili powder\n" +
                "1/2 teaspoon garlic powder\n" +
                "1/2 teaspoon onion powder\n" +
                "1/2 teaspoon ground cumin\n" +
                "2 tablespoons all-purpose flour\n" +
                "1 pound boneless, skinless chicken breast halves, all visible fat discarded, cut into 3 x 1/2-inch strips (16 strips total) ");
        recipes.add("In a small bowl, stir together the Cherry Barbecue Sauce ingredients.Set aside. \n" +
                "In a second small bowl, stir together 1/2 teaspoon chili powder, 1/2 teaspoon garlic powder, 1/2 teaspoon onion powder, and 1/2 teaspoon cumin. Stir in the flour.\n" +
                        "Dip the chicken strips in the chili powder mixture, turning to coat and gently shaking off any excess. Using your fingertips, gently press the coating so it adheres to the chicken. Place the strips in the slow cooker. Stir the sauce together with the chicken. Cook, covered, on low for 3 to 4 hours or on high for 1 1/2 to 2 hours. ");


        name.add("Greek Frittata with Spinach Goat Cheese and Roasted Red Bell Peppers");
        description.add("Surprise! You can make brunch in a slow cooker. This veggie-packed frittata is infused with Mediterranean flavors. Invite your friends over, toss a fresh fruit salad, toast some whole-grain country bread, and you’re ready for an almost effortless get-together.");
        images.add(R.drawable.greekfrittata);
        ingredients.add("Cooking spray\n" +
                "4 large eggs\n" +
                "4 large egg whites\n" +
                "1/3 cup low-fat milk\n" +
                "1/2 teaspoon dried oregano (crumbled)\n" +
                "1/4 teaspoon salt\n" +
                "1/4 teaspoon pepper\n" +
                "10 ounces frozen chopped spinach, thawed, drained, and squeezed until very dry\n" +
                "1/2 cup bottled roasted red bell peppers, drained, patted dry, and chopped\n" +
                "3 ounces soft goat cheese, crumbled\n" +
                "2 small thinly sliced green onions ");
        recipes.add("Lightly spray the slow cooker with cooking spray.\n" +
                "In a large bowl, whisk together the eggs, egg whites, milk, oregano, salt, and pepper. Stir in the remaining ingredients. Pour into the slow cooker.\n" +
                "Cook, covered, on low for 2 1/2 to 3 hours, or until set (the frittata doesn’t jiggle when the slow cooker is gently shaken). Using a wide spatula, gently lift the frittata out of the slow cooker. Transfer to a cutting board. Let stand for 5 minutes before slicing.");

        name.add("Steamed Pumpkin Bread");
        description.add("Pumpkin, dried cranberries, walnuts, and spices update a traditional steamed brown bread recipe. The result is moist and delicious. ");
        images.add(R.drawable.steamedpumpkinbread);
        ingredients.add("Cooking spray\n" +
                "6 cups water\n" +
                "1/2 cup all-purpose flour\n" +
                "1/2 cup whole-wheat pastry flour\n" +
                "1/2 cup cornmeal\n" +
                "1 teaspoon baking soda\n" +
                "1 teaspoon ground cinnamon\n" +
                "1/2 teaspoon ground allspice\n" +
                "1/4 teaspoon salt\n" +
                "1/3 cup unsweetened dried cranberries\n" +
                "1/3 cup chopped walnuts\n" +
                "3/4 cup canned solid-pack pumpkin (not pie filling)\n" +
                "3/4 cup low-fat buttermilk\n" +
                "2 large egg whites\n" +
                "1/4 cup of dark or light molasses ");
        recipes.add("Lightly spray a 9 x 5 x 3-inch ovenproof glass loaf pan with cooking spray. Place a metal rack with short legs, such as a pressure cooker rack, or three or four 12 x 6-inch sheets of aluminum foil crumpled into balls in the slow cooker.\n" +
                "In a large saucepan, bring the water to a boil over high heat.\n" +
                "Meanwhile, in a large bowl, stir together the flours, cornmeal, baking soda, cinnamon, allspice, and salt. Stir in the cranberries and walnuts. Make a well in the center.\n" +
                "In a medium bowl, whisk together the pumpkin, buttermilk, egg whites, and molasses. Pour into the well. Stir just until the flour mixture is moistened, but no flour is visible. Don’t overmix. Pour into the loaf pan, gently smoothing the top. Cover tightly with aluminum foil. Secure with kitchen twine.\n" +
                "Place the pan on the rack or crumpled foil in the slow cooker. Pour the boiling water down the side of the crock until the water reaches midway up the side of the pan. Cook, covered, on high for 2 to 2 1/2 hours, or until a wooden toothpick inserted in the center of the bread comes out clean. Carefully transfer the pan to a cooling rack. Discard the foil. Let the bread cool in the pan for 10 minutes. Turn out onto the cooling rack. Serve the bread warm.\n ");

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

        name.add("Acorn Squash Wedges with Walnuts");
        description.add("Achieving an attractive browned finish to slow-cooked food usually isn’t easy, but that isn’t a problem here. The cut sides of acorn squash wedges lie on top of skillet-browned onions and brown as they slow cook; then the onions are incorporated into a brown-sugar-and-walnut sauce to top the squash. “Browning” never looked better! ");
        images.add(R.drawable.acornsquashwedgeswalnuts);
        ingredients.add("Cooking spray\n" +
                "1 teaspoon canola oil (or)\n" +
                "OR\n" +
                "1 teaspoon corn oil\n" +
                "1 medium diced onion\n" +
                "1/4 cup water\n" +
                "2 tablespoons chopped walnuts\n" +
                "3/4 teaspoon ground cinnamon\n" +
                "1/4 teaspoon ground nutmeg\n" +
                "1 large acorn squash (about 1 1/2 pounds), seeds and strings discarded, cut into 4 wedges\n" +
                "1 tablespoon plus 1 teaspoon firmly packed dark brown sugar\n" +
                "1 tablespoon light tub margarine\n" +
                "1 teaspoon vanilla extract\n" +
                "1/8 teaspoon salt\n" +
                "2 teaspoons canola or corn oil ");
        recipes.add("Lightly spray the slow cooker with cooking spray. Set aside.\n" +
                "In a large nonstick skillet, heat 1 teaspoon oil over medium-high heat, swirling to coat the bottom. Cook the onion for 3 to 4 minutes, or until beginning to lightly brown, stirring frequently. Transfer to the slow cooker.\n" +
                "Stir in the water, walnuts, cinnamon, and nutmeg.\n" +
                "Arrange each squash wedge with a cut side down on top of the onion mixture, making sure that a cut side of each squash wedge touches the onion mixture. Cook, covered, on low for 4 hours or on high for 2 hours, or until the squash is tender when pierced with a fork.\n" +
                "Place the squash wedges on plates. Stir the remaining ingredients into the onion mixture. Spoon over the squash.\n ");

        name.add("Saucy Boneless Chicken \"Wings\" with Cherry Barbecue Sauce");
        description.add("This healthier-for-you version of the popular appetizer is perfect for game day and potluck meals. A sweet-tart sauce elevates these wings to new heights.");
        images.add(R.drawable.saucybonelesschickenwings);
        ingredients.add("1/2 teaspoon chili powder\n" +
                "1/2 teaspoon garlic powder\n" +
                "1/2 teaspoon onion powder\n" +
                "1/2 teaspoon ground cumin\n" +
                "2 tablespoons all-purpose flour\n" +
                "1 pound boneless, skinless chicken breast halves, all visible fat discarded, cut into 3 x 1/2-inch strips (16 strips total) ");
        recipes.add("In a small bowl, stir together the Cherry Barbecue Sauce ingredients.Set aside. \n" +
                "In a second small bowl, stir together 1/2 teaspoon chili powder, 1/2 teaspoon garlic powder, 1/2 teaspoon onion powder, and 1/2 teaspoon cumin. Stir in the flour.\n" +
                "Dip the chicken strips in the chili powder mixture, turning to coat and gently shaking off any excess. Using your fingertips, gently press the coating so it adheres to the chicken. Place the strips in the slow cooker. Stir the sauce together with the chicken. Cook, covered, on low for 3 to 4 hours or on high for 1 1/2 to 2 hours. ");


        name.add("Greek Frittata with Spinach Goat Cheese and Roasted Red Bell Peppers");
        description.add("Surprise! You can make brunch in a slow cooker. This veggie-packed frittata is infused with Mediterranean flavors. Invite your friends over, toss a fresh fruit salad, toast some whole-grain country bread, and you’re ready for an almost effortless get-together.");
        images.add(R.drawable.greekfrittata);
        ingredients.add("Cooking spray\n" +
                "4 large eggs\n" +
                "4 large egg whites\n" +
                "1/3 cup low-fat milk\n" +
                "1/2 teaspoon dried oregano (crumbled)\n" +
                "1/4 teaspoon salt\n" +
                "1/4 teaspoon pepper\n" +
                "10 ounces frozen chopped spinach, thawed, drained, and squeezed until very dry\n" +
                "1/2 cup bottled roasted red bell peppers, drained, patted dry, and chopped\n" +
                "3 ounces soft goat cheese, crumbled\n" +
                "2 small thinly sliced green onions ");
        recipes.add("Lightly spray the slow cooker with cooking spray.\n" +
                "In a large bowl, whisk together the eggs, egg whites, milk, oregano, salt, and pepper. Stir in the remaining ingredients. Pour into the slow cooker.\n" +
                "Cook, covered, on low for 2 1/2 to 3 hours, or until set (the frittata doesn’t jiggle when the slow cooker is gently shaken). Using a wide spatula, gently lift the frittata out of the slow cooker. Transfer to a cutting board. Let stand for 5 minutes before slicing.");

        name.add("Steamed Pumpkin Bread");
        description.add("Pumpkin, dried cranberries, walnuts, and spices update a traditional steamed brown bread recipe. The result is moist and delicious. ");
        images.add(R.drawable.steamedpumpkinbread);
        ingredients.add("Cooking spray\n" +
                "6 cups water\n" +
                "1/2 cup all-purpose flour\n" +
                "1/2 cup whole-wheat pastry flour\n" +
                "1/2 cup cornmeal\n" +
                "1 teaspoon baking soda\n" +
                "1 teaspoon ground cinnamon\n" +
                "1/2 teaspoon ground allspice\n" +
                "1/4 teaspoon salt\n" +
                "1/3 cup unsweetened dried cranberries\n" +
                "1/3 cup chopped walnuts\n" +
                "3/4 cup canned solid-pack pumpkin (not pie filling)\n" +
                "3/4 cup low-fat buttermilk\n" +
                "2 large egg whites\n" +
                "1/4 cup of dark or light molasses ");
        recipes.add("Lightly spray a 9 x 5 x 3-inch ovenproof glass loaf pan with cooking spray. Place a metal rack with short legs, such as a pressure cooker rack, or three or four 12 x 6-inch sheets of aluminum foil crumpled into balls in the slow cooker.\n" +
                "In a large saucepan, bring the water to a boil over high heat.\n" +
                "Meanwhile, in a large bowl, stir together the flours, cornmeal, baking soda, cinnamon, allspice, and salt. Stir in the cranberries and walnuts. Make a well in the center.\n" +
                "In a medium bowl, whisk together the pumpkin, buttermilk, egg whites, and molasses. Pour into the well. Stir just until the flour mixture is moistened, but no flour is visible. Don’t overmix. Pour into the loaf pan, gently smoothing the top. Cover tightly with aluminum foil. Secure with kitchen twine.\n" +
                "Place the pan on the rack or crumpled foil in the slow cooker. Pour the boiling water down the side of the crock until the water reaches midway up the side of the pan. Cook, covered, on high for 2 to 2 1/2 hours, or until a wooden toothpick inserted in the center of the bread comes out clean. Carefully transfer the pan to a cooling rack. Discard the foil. Let the bread cool in the pan for 10 minutes. Turn out onto the cooling rack. Serve the bread warm.\n ");

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

        name.add("Acorn Squash Wedges with Walnuts");
        description.add("Achieving an attractive browned finish to slow-cooked food usually isn’t easy, but that isn’t a problem here. The cut sides of acorn squash wedges lie on top of skillet-browned onions and brown as they slow cook; then the onions are incorporated into a brown-sugar-and-walnut sauce to top the squash. “Browning” never looked better! ");
        images.add(R.drawable.acornsquashwedgeswalnuts);
        ingredients.add("Cooking spray\n" +
                "1 teaspoon canola oil (or)\n" +
                "OR\n" +
                "1 teaspoon corn oil\n" +
                "1 medium diced onion\n" +
                "1/4 cup water\n" +
                "2 tablespoons chopped walnuts\n" +
                "3/4 teaspoon ground cinnamon\n" +
                "1/4 teaspoon ground nutmeg\n" +
                "1 large acorn squash (about 1 1/2 pounds), seeds and strings discarded, cut into 4 wedges\n" +
                "1 tablespoon plus 1 teaspoon firmly packed dark brown sugar\n" +
                "1 tablespoon light tub margarine\n" +
                "1 teaspoon vanilla extract\n" +
                "1/8 teaspoon salt\n" +
                "2 teaspoons canola or corn oil ");
        recipes.add("Lightly spray the slow cooker with cooking spray. Set aside.\n" +
                "In a large nonstick skillet, heat 1 teaspoon oil over medium-high heat, swirling to coat the bottom. Cook the onion for 3 to 4 minutes, or until beginning to lightly brown, stirring frequently. Transfer to the slow cooker.\n" +
                "Stir in the water, walnuts, cinnamon, and nutmeg.\n" +
                "Arrange each squash wedge with a cut side down on top of the onion mixture, making sure that a cut side of each squash wedge touches the onion mixture. Cook, covered, on low for 4 hours or on high for 2 hours, or until the squash is tender when pierced with a fork.\n" +
                "Place the squash wedges on plates. Stir the remaining ingredients into the onion mixture. Spoon over the squash.\n ");

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
