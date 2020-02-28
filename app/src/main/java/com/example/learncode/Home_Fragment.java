package com.example.learncode;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Fragment extends Fragment implements MyAdapter.onClickInterfce {
    ArrayList<String> name,namelist;
    ArrayList<String> description,drscriptionlist;
    ArrayList<Integer> images,imagelist;
    ArrayList<String> ingredients,ingrediantlist;
    ArrayList<String> recipes,recipeslist;

    public Home_Fragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         name = new ArrayList<>();
         description = new ArrayList<>();
         images = new ArrayList<>();
         ingredients = new ArrayList<>();
         recipes = new ArrayList<>();
         addData();


        View view = inflater.inflate(R.layout.fragment_home_, container, false);

        MyAdapter adapter = new MyAdapter(name,description,images,ingredients,recipes,this);
        RecyclerView recyclerView =  view.findViewById(R.id.recycler_View);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);

        namelist = new ArrayList<>();
        drscriptionlist = new ArrayList<>();
        imagelist = new ArrayList<>();
        ingrediantlist = new ArrayList<>();
        recipeslist = new ArrayList<>();
        addDataList();


        ListView listView =view.findViewById(R.id.list_View);
        MyListAdapater myListAdapater = new MyListAdapater(this,namelist,drscriptionlist,imagelist);
        listView.setAdapter( myListAdapater);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(),RecipeInfo.class);
                intent.putExtra("Title",namelist.get(position));
                intent.putExtra("Description",drscriptionlist.get(position));
                intent.putExtra("Ingrediants",ingrediantlist.get(position));
                intent.putExtra("Recipe",recipeslist.get(position));
                intent.putExtra("Image",imagelist.get(position));
                startActivity(intent);
            }
        });

        return view;
    }

    private void addDataList() {
        namelist.add("Mardi Gras Deviled Eggs");
        drscriptionlist.add("Celebrate Mardi Gras with these purple, gold, and green deviled eggs." +
                " Hard boiled eggs get pickled with purple cabbage to dye the whites naturally " +
                "and a little cajun seasoning goes in the yolk mixture to make these deviled eggs New Orleans approved! ");
        imagelist.add(R.drawable.mardi_gras_deviled_eggs);
        ingrediantlist.add("3 c. chopped purple cabbage\n" +
                "1 c. distilled vinegar\n" +
                "1 tbsp. granulated sugar\n" +
                "1/2 c. mayonnaise\n" +
                "1 tbsp. dijon mustard\n" +
                "1 tsp. hot sauce\n" +
                "1 tsp. cajun seasoning\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "Finely chopped chives, for garnish ");
        recipeslist.add("Place eggs in large pot and pour enough water over to cover completely. Bring to a boil, then turn off heat and cover pot." +
                " Let sit 11 minutes, then immediately remove eggs and place into a bowl of ice water. Peel eggs when cool enough to handle.\n" +
                "In another large pot, bring 3 cups water, cabbage, vinegar, and sugar to a boil. Let cool slightly, then strain out cabbage. \n" +
                "Place peeled eggs into a large bowl and pour cabbage liquid over. Refrigerate at least 3 hours and up to overnight. \n" +
                "Halve eggs and place yolks in a medium bowl. Add mayonnaise, mustard, and hot sauce to yolks and mash with a fork until smooth." +
                " Season with cajun seasoning, salt, and pepper. \n" +
                "Pipe yolk mixture back into whites and top with chives to serve. ");


        namelist.add("Kit Kat Egg Rolls");
        drscriptionlist.add("Fried candy bars have become a state fair staple. Kit Kat egg rolls makes the candy bar even crispier and with extra chocolate they" +
                " become even better! Kit Kat lovers will go crazy for this simple treat.");
        imagelist.add(R.drawable.kit_kat_egg_rolls);
        ingrediantlist.add("12 wonton wrappers\n" +
                "1/2 c. melted chocolate\n" +
                "12 mini Kit Kats\n" +
                "Vegetable oil, for frying\n" +
                "Powdered sugar, for dusting\n" +
                "Caramel, warmed, for dipping");
        recipeslist.add("Place wonton wrappers on a clean surface in a diamond shape. Spread a thin layer of melted chocolate in middle of wrapper and place a Kit Kat on top. " +
                "Fold bottom point over Kit Kat, then fold corners in. Wet top point with a little water then roll to seal. \n" +
                "In a medium skillet over medium heat, heat enough oil to come ½” up the side of pan. Working in batches, add Kit Kats to oil and fry until golden, 1 minute per side." +
                " Remove from oil and place on a paper towel lined plate. Repeat with remaining Kit Kats. \n" +
                "Dust with powdered sugar and serve with warmed caramel. ");

        namelist.add("Best-Ever Pozole");
        drscriptionlist.add("Don't let the time commitment scare you. It's as easy as bringing water to a boil and the longer you let it simmer, the better it will be. This soup is meant to be a little spicy," +
                " but adjust the heat to your liking by adding more or less of the chile puree. The cabbage will help cool things off a bit! ");
        imagelist.add(R.drawable.best_ever_pozole);
        ingrediantlist.add("3 lb. pork shoulder, cut into 2\" pieces\n" +
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
        recipeslist.add("Season pork with salt and pepper. In a large pot over medium heat, add pork, onion, garlic, cloves, cumin seeds, bay leaf," +
                " and broth. Add enough water to cover pork by 2”. Bring to a boil, then cover and reduce heat to a simmer. Let simmer 1 ½ hours," +
                " skimming foam off top as necessary.  \n" +
                "Place dried chiles into a medium bowl and pour 2 cups boiling water over. Let soak 30 minutes. Place chiles and about " +
                "½ cup of their soaking liquid into a blender. Blend until smooth, adding more water as necessary. \n" +
                "Add chile puree and hominy to pot with pork. Continue to simmer, covered, until pork is very tender," +
                " 1 hour and 30 minutes more. \n" +
                "Serve pozole with radishes, cabbage, and cilantro. ");

        namelist.add("Cauliflower-Crust Pizza with Vegetable Topping and Balsamic Glaze");
        drscriptionlist.add("We’ve all heard of vegetables on our pizza, but what about under it? Cauliflower plays a supporting" +
                " role in this recipe and takes the place of traditional flour to form a thin, crunchy crust. A small drizzle" +
                "of a sweet, tart glaze makes a big splash over a rainbow topping of vegetables.");
        imagelist.add(R.drawable.cauliflowercrustpizzasized);
        ingrediantlist.add("Cooking spray\n" +
                "2 cups finely chopped cauliflower florets and stems (about 1/4 of a large head of cauliflower)\n" +
                        "1/4 cup shredded or grated Parmesan cheese\n" +
                        "2 large egg whites\n" +
                        "1 large egg or 1/4 cup egg substitute\n" +
                        "1 teaspoon dried oregano, crumbled\n" +
                        "1 8-ounce can no-salt-added tomato sauce\n" +
                        "1/4 cup coarsely chopped basil (fresh)\n" +
                        "1/4 teaspoon salt\n" +
                        "1 1/4 cups frozen meatless crumbles, thawed\n" +
                        "1/2 cup sliced button mushrooms\n" +
                        "1/2 cup sliced orange bell peppers\n" +
                        "1/2 cup sliced yellow bell peppers\n" +
                        "1/2 cup sliced green bell peppers\n" +
                        "4 sun-dried tomatoes, snipped into 1/2-inch pieces\n" +
                        "1/2 cup shredded mozzarella cheese (low-fat)");
        recipeslist.add("Lightly spray the slow cooker with cooking spray. In a medium bowl, stir together the cauliflower, Parmesan, egg whites, egg, and oregano. Using your hands, gently press the mixture to form a crust in the bottom of the slow cooker.\n" +
                "In the same medium bowl (rinsed and wiped clean), whisk together the tomato sauce, basil, and salt until combined. Spread over the cauliflower crust.\n" +
                "Place the meatless crumbles, mushrooms, and all the bell peppers on the tomato sauce. Sprinkle the sun-dried tomatoes over all. Cook, covered, on low for 4 to 5 hours or on high for 2 to 2 1/2 hours, or until the mushrooms are soft and the bell peppers are tender.\n" +
                "Quickly sprinkle the mozzarella over the vegetable topping. Re-cover the slow cooker and cook for 30 minutes on low or 15 minutes on high, or until the mozzarella has melted.\n" +
                "While the mozzarella is melting, in a small saucepan, stir together the vinegar and honey. Bring to a simmer over medium-high heat. Reduce the heat to medium low and simmer for about 8 to 10 minutes, until the mixture is reduced by half (to about 1/4 cup), swirling the pan and stirring occasionally.\n" +
                "Using a wide spatula, gently lift the pizza from the slow cooker and transfer to a work surface. Drizzle the glaze over the pizza. Cut into slices. ");

        namelist.add("Coconut Curry Halibut with Green Beans and Roasted Red Bell Peppers");
        drscriptionlist.add("The harmony of sweet, sour, and spicy flavors in this Asian-inspired dish stimulates the appetite. The halibut, whose velvety texture will melt in your mouth, rests on a fluffy bed of jasmine rice. ");
        imagelist.add(R.drawable.coconutcurryhalibutsized);
        ingrediantlist.add("1 cup fat-free, low-sodium chicken broth\n" +
                "1/4 cup lite coconut milk\n" +
                "1 tablespoon Thai red curry paste\n" +
                "1 teaspoon grated lime zest\n" +
                "1 tablespoon fresh lime juice\n" +
                "2 teaspoons low-sodium fish sauce\n" +
                "2 medium minced garlic cloves\n" +
                "1 teaspoon minced gingerroot (peeled)\n" +
                "2 cups trimmed green beans\n" +
                "1 8-ounce can sliced bamboo shoots, drained and slivered\n" +
                "1/2 cup roasted red bell peppers, drained if bottled, thinly sliced\n" +
                "2 medium green onions, sliced into 1-inch pieces\n" +
                "4 halibut fillets (about 4 ounces each), rinsed and patted dry\n" +
                "1 cup uncooked brown (or regular) jasmine rice\n" +
                "2 tablespoons coarsely chopped basil (fresh)\n" +
                "2 tablespoons coarsely chopped cilantro (fresh) ");
        recipeslist.add("In the slow cooker, whisk together the broth, coconut milk, curry paste, lime zest, lime juice, fish sauce, garlic, and gingerroot. Stir in the green beans, bamboo shoots, roasted peppers, and green onions. Cook, covered, on low for 3 to 3 1/2 hours or on high for 1 1/2 to 2 hours.\n" +
                "Quickly stir in the fish and re-cover the slow cooker. Cook for 30 minutes on low or 15 minutes on high, or until the fish flakes easily when tested with a fork.\n" +
                "About 15 minutes before serving time, prepare the rice using the package directions, omitting the salt and margarine.\n" +
                "To serve, spoon the rice into shallow bowls. Place a fish fillet on each serving of rice. Spoon the green bean mixture around the fish. Ladle the cooking liquid over all. Garnish with the basil and cilantro. ");
    }

    private void addData() {
        name.add("Spiced Brisket with Cranberries");
        description.add("Plan to prepare and cook the brisket the day before you serve it. This way it’ll give the beef time to release its juices so you can use them to make the sauce. Also, once the juices have cooled, you can easily skim off the fat. Refrigerate the brisket overnight, then the next day, before the meal, finish it up. ");
        images.add(R.drawable.spicedbrisketwithcranberries);
        ingredients.add("2 teaspoons olive oil\n" +
                "1 2-pound beef brisket, all visible fat discarded\n" +
                "1 teaspoon dried oregano (crumbled)\n" +
                "1/2 teaspoon garlic powder\n" +
                "1/4 teaspoon salt\n" +
                "1/4 teaspoon black pepper ((coarsely ground preferred))\n" +
                "1/2 cup fat-free, low-sodium beef broth\n" +
                "1 cup barbecue sauce (lowest sodium available)\n" +
                "1 cup whole cranberries\n" +
                "1/3 cup firmly packed dark brown sugar");
        recipes.add("Heat the oil in the pressure cooker on sauté. Cook the brisket on both sides, or until browned. Turn off the pressure cooker. In a small bowl, stir together the oregano, garlic powder, salt, and pepper. Sprinkle the mixture over the beef. Pour the broth around the beef. Pour the barbecue sauce over the beef. Secure the lid. Cook on high pressure for 55 minutes. Allow the pressure to release naturally for 15 minutes, then quickly release any remaining pressure.\n" +
                "Transfer the beef to a glass baking dish. Cover and refrigerate. Pour the accumulated juices into a glass bowl. Cover and refrigerate.\n" +
                "Just before serving time, preheat the oven to 300°F. Remove the beef from the refrigerator. Very thinly slice the beef across the grain. Put it in the baking dish. Skim off the fat from the refrigerated juices. Pour 1 cup of the juices over the beef. Bake, tightly covered, for 45 minutes to 1 hour.\n" +
                "Meanwhile, in a small saucepan, cook 1 cup of the juices over medium-high heat. Add the cranberries and brown sugar. Cook until the cranberries pop and are soft, stirring occasionally. Drizzle the sauce over the beef. ");


        name.add("Spinach-Stuffed Baked Salmon");
        description.add("Get some heart-healthy omega-3 fats with this vegetable and seafood dish.");
        images.add(R.drawable.spinachstuffedbakedsalmonsized);
        ingredients.add("1 tsp. olive oil (extra virgin preferred)\n" +
                "2 oz. spinach\n" +
                "1 tsp. grated lemon zest\n" +
                "1/4 cup chopped, roasted red bell peppers, rinsed and drained if bottled\n" +
                "1/4 cup fresh basil (coarsely chopped)\n" +
                "2 Tbsp. chopped walnuts\n" +
                "Cooking spray\n" +
                "4 salmon fillets (about 4 ounces each), rinsed, patted dry\n" +
                "2 Tbsp. Dijon mustard (lowest sodium available)\n" +
                "2 Tbsp. plain dry bread crumbs, lowest sodium available\n" +
                "1/2 tsp. dried oregano (crumbled)\n" +
                "1/2 tsp. garlic powder\n" +
                "1/8 tsp. pepper");
        recipes.add("In a large skillet, heat the oil over medium heat, swirling to coat the bottom. Cook the spinach and lemon zest for 2 minutes, or until the spinach is wilted, stirring constantly. Transfer to a medium bowl. Stir in the roasted peppers, basil, and walnuts. Let cool for 5 minutes.\n" +
                "Preheat the oven to 400°F. Line a baking sheet with aluminum foil. Lightly spray the foil with cooking spray.\n" +
                "Cut a lengthwise slit in the side of each fillet to make a pocket for the stuffing. Be careful to not cut through to the other side. With a spoon or your fingers, carefully stuff a scant 1/2 cup spinach mixture into each fillet. Transfer to the baking sheet. With a pastry brush or spoon, spread the mustard over the fish.\n" +
                "In a small bowl, stir together the remaining ingredients. Sprinkle over the fish. Lightly spray the top with cooking spray.\n" +
                "Bake for 12 to 13 minutes, or until the fish is the desired doneness and the filling is heated through. ");

        name.add("Greek Seven-Layer Dip");
        description.add("Grab some pitas and enjoy this tasty Greek-inspired, heart-healthy snack or appetizer. ");
        images.add(R.drawable.appetizergreeksevenlayerdipsized);
        ingredients.add("1 1 / 2 6 - inch whole - wheat pita pockets(lowest sodium available), cut into 12wedges, tops and bottoms separated(24wedges total)\n" +
                "Cooking spray\n" +
                        "1 cup no-salt-added chickpeas, rinsed, drained\n" +
                        "1 Tbsp. fresh lemon juice\n" +
                        "2 Tbsp. water\n" +
                        "1/8 tsp. pepper\n" +
                        "1 cup loosely packed baby spinach, thinly sliced (about 1 1/2 ounces)\n" +
                        "1/8 tsp. dried oregano (crumbled)\n" +
                        "1/2 medium tomato, finely chopped (about 1/3 cup)\n" +
                        "1/4 medium cucumber, peeled and finely chopped (about 1/3 cup)\n" +
                        "1 Tbsp. chopped mint\n" +
                        "2 Tbsp. crumbled, fat-free feta cheese ");
        recipes.add("Preheat the oven to 400°F. Arrange the pita wedges in a single layer on a large baking sheet without overlapping the wedges. Lightly spray the tops of the wedges with cooking spray.\n" +
                "Bake for 5 minutes, or until lightly browned and slightly crisp (the pita wedges will crisp more as they cool).\n" +
                "Meanwhile, in a food processor or blender, process the chickpeas until coarsely chopped. With the food processor running, slowly pour in the lemon juice and process until blended. Add the water and pepper. Process until smooth.\n" +
                "Arrange the spinach on a serving plate. Gently spread the chickpea mixture on top, leaving a border of the spinach. Sprinkle the oregano over the spread. Arrange the tomato on the spread. Top, in order, with the cucumber, mint and feta. Serve with the pita wedges.");

        name.add("Skillet Ham Hash");
        description.add("A perfect breakfast or brunch meal, this hash is easy to make and is a great use of leftover ham.");
        images.add(R.drawable.skillethamhashsized);
        ingredients.add("2tsp.olive oil\n" +
                "1 large green bell pepper (diced)\n" +
                        "1 large red bell pepper (diced)\n" +
                        "1 medium onion (diced)\n" +
                        "1/2 cup lower-sodium, low-fat, diced ham (about 4 ounces), all visible fat discarded\n" +
                        "3 cups frozen, fat-free southern-style diced hash brown potatoes, thawed\n" +
                        "1/2 tsp. salt-free Cajun or Creole seasoning blend\n" +
                        "2 Tbsp. chopped, fresh parsley\n" +
                        "1/4 tsp. salt\n" +
                        "1/4 tsp. pepper ");
        recipes.add("In a large nonstick skillet, heat the oil over medium heat, swirling to coat the bottom. Cook the bell peppers and onion for 4 to 5 minutes, or until the onion is soft and the bell pepper is tender, stirring occasionally. Stir in the ham. Cook for 1 to 2 minutes, or until heated through, stirring occasionally.\n" +
                "Stir in the hash browns and seasoning blend. Cook without stirring for 4 minutes, or until the bottom is golden brown. Stir (the golden-brown pieces will be redistributed). Cook without stirring for 4 minutes, or until the bottom is golden brown and the mixture is heated through.\n" +
                "Stir in the parsley, salt, and pepper. ");

        name.add("Tuna Niçoise in Lettuce Cups");
        description.add("Try this elegant, French salad for a taste of Spring and a great source of \"good\" fat. ");
        images.add(R.drawable.tunanicoiseinlettucecupsspringsized1);
        ingredients.add("2 Tbsp. chopped red onion\n" +
                "1 Tbsp. red wine vinegar\n" +
                "2 tsp. Dijon mustard (lowest sodium available)\n" +
                "1 tsp. olive oil (extra virgin preferred)\n" +
                "1/4 tsp. dried dillweed (crumbled)\n" +
                "1/4 tsp. sugar\n" +
                "1/8 tsp. pepper\n" +
                "5 oz. canned, very-low-sodium chunk light tuna, packed in water, drained, flaked\n" +
                "16 large Bibb lettuce leaves (about 2 heads)\n" +
                "2 Tbsp. chopped black olives (drained)\n" +
                "2 large eggs, hard-boiled, yolks discarded and whites chopped\n" +
                "4 cherry tomatoes (sliced) ");
        recipes.add("In a small bowl, stir together the onion, vinegar, mustard, oil, dillweed, sugar, and pepper. Stir in the tuna. Spoon 1 tablespoon of spread onto each lettuce leaf. Top, in order, with the olives, egg whites, and cherry tomatoes.\n" +
                "To eat as a wrap, fold the left and right sides of the lettuce leaf toward the center. Starting from the unfolded side closest to you, roll the wrap towards the remaining unfolded side to enclose the filling. ");

    }

    @Override
    public void onClcick(int position) {
        Intent intent = new Intent(this.getContext(),RecipeInfo.class);
        intent.putExtra("Title",name.get(position));
        intent.putExtra("Description",description.get(position));
        intent.putExtra("Ingrediants",ingredients.get(position));
        intent.putExtra("Recipe",recipes.get(position));
        intent.putExtra("Image",images.get(position));
        startActivity(intent);

    }



}
