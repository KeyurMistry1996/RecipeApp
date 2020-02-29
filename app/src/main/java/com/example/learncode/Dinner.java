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

public class Dinner extends AppCompatActivity {
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
        name.add("Beef Stew with Fresh Mango");
        description.add("Fresh mango and cilantro add the perfect balance to this beef stew with its full-flavored complements of Worcestershire sauce, chili powder, and just a bit of cinnamon. Serving it over whole-wheat couscous is an easy way to boost your fiber intake. ");
        images.add(R.drawable.beefstewfreshmango);
        ingredients.add(" 1/2 pounds lean stew meat(1 - inch cubes), all visible fat discarded\n" +
                "2 14.5-ounce cans no-salt-added diced tomatoes, drained\n" +
                        "1 medium onion (cut into 6 wedges)\n" +
                        "1 large red bell pepper, cut lengthwise into 1/2-inch strips\n" +
                        "2 tablespoons Worcestershire sauce (lowest sodium available)\n" +
                        "1 tablespoon chili powder\n" +
                        "2 medium garlic cloves (minced)\n" +
                        "1/2 teaspoon ground cinnamon\n" +
                        "1/4 teaspoon salt\n" +
                        "1/4 teaspoon black pepper");
        recipes.add("In the slow cooker, stir together the beef, tomatoes, onion, bell pepper, Worcestershire sauce, chili powder, garlic, cinnamon, salt, and pepper. Cook, covered, on low for 8 to 9 hours or on high for 5 to 5 1/2 hours, or until the beef is tender.\n" +
                "About 10 minutes before serving time, prepare the couscous using the package directions, omitting the salt and substituting the broth for the water. Spoon into bowls. Ladle the stew onto the couscous. Top with the mango and cilantro. ");


        name.add("Salmon En Papillote");
        description.add("The name of this dish may not be familiar to you, but it simply means that the fish is cooked enclosed in a cooking parchment packet. With this method, not only are the flavors of the fish and vegetables locked inside but serving and cleanup are a breeze.");
        images.add(R.drawable.salmonenpapillote);
        ingredients.add("2 cups water\n" +
                "1 teaspoon olive oil\n" +
                "4 salmon fillets (about 4 ounces each), skin discarded, rinsed and patted dry\n" +
                "1 small unpeeled zucchini, very thinly sliced\n" +
                "1 medium tomato (seeded, chopped)\n" +
                "2 tablespoons minced fresh Italian (flat-leaf) parsley\n" +
                "1 tablespoon minced, fresh thyme\n" +
                "1 tablespoon minced, fresh rosemary\n" +
                "1 medium garlic clove (minced)\n" +
                "1/2 teaspoon black pepper ((coarsely ground preferred)) ");
        recipes.add("Pour the water into the pressure cooker. Place the steaming rack in the pressure cooker.\n" +
                "Place 4 sheets of parchment paper (each about 12 x 16 inches) on the counter top. Drizzle 1/4 teaspoon oil onto the center of each sheet. Brush to coat the center of the parchment.\n" +
                "Place a fish fillet in the center of each parchment sheet. Arrange the zucchini and tomato on the fish.\n" +
                "In a small bowl, stir together the remaining ingredients. Sprinkle the herb mixture over the fish and vegetables. Pull the edges of the parchment over the fish and vegetables. Fold the edges together several times, creasing tightly, to seal the packets securely.\n" +
                "Place 2 packets in the center of a sheet (about 18 inches square) of heavy-duty aluminum foil. Gently place the remaining 2 packets on top, perpendicular to the bottom 2 packets. Pull the edges of the foil over all, shaping into a bundle about 8 inches in diameter (to fit in the cooker). Fold the edges together several times, creasing tightly, to seal the foil packet securely.\n" +
                "Transfer the foil packet to the rack in the pressure cooker, gently pressing in on the packet so it fits in the cooker and rests well below the max fill line. Secure the lid. Pressure cook on high for 12 minutes. Quickly release the pressure.\n" +
                "Carefully lift the foil packet out of the pressure cooker. Transfer to the counter top. Remove the parchment packets from the foil packet. Transfer to serving plates. Or, using the tines of a fork, carefully open the parchment packets away from you (to prevent steam burns) and transfer the fish and vegetables to serving plates.");

        name.add("Grilled Shrimp with Mint Salsa Verde");
        description.add("A tiny dollop of yogurt gives a pleasant, unexpected creaminess to the piquant salsa that is drizzled over grilled shrimp in this attractive entrée. ");
        images.add(R.drawable.grilledshrimpwithmintsalsaverde);
        ingredients.add("In a small glass baking dish, whisk together 1/2 tablespoon plus 1 teaspoon lemon juice, 1 teaspoon oil, and garlic. Add the shrimp, turning to coat. Cover and refrigerate for 10 minutes, turning once.\n" +
                "Meanwhile, in a mini food processor, process the green onions, mint, cilantro, capers, jalapeño, yogurt, water, salt, pepper, remaining 1/2 tablespoon lemon juice, and remaining 1 tablespoon oil for 30 seconds, or until smooth and creamy. Scrape the side once or twice during this process.\n" +
                "Preheat a grill pan on medium-high heat. Lightly spray with cooking spray. Remove the shrimp from the marinade. Discard the marinade. Grill the shrimp for 2 to 3 minutes on each side, or until pink and cooked through. Serve with the salsa verde drizzled on top.");
        recipes.add("Season pork with salt and pepper. In a large pot over medium heat, add pork, onion, garlic, cloves, cumin seeds, bay leaf," +
                " and broth. Add enough water to cover pork by 2”. Bring to a boil, then cover and reduce heat to a simmer. Let simmer 1 ½ hours," +
                " skimming foam off top as necessary.  \n" +
                "Place dried chiles into a medium bowl and pour 2 cups boiling water over. Let soak 30 minutes. Place chiles and about " +
                "½ cup of their soaking liquid into a blender. Blend until smooth, adding more water as necessary. \n" +
                "Add chile puree and hominy to pot with pork. Continue to simmer, covered, until pork is very tender," +
                " 1 hour and 30 minutes more. \n" +
                "Serve pozole with radishes, cabbage, and cilantro. ");

        name.add("Fish Tacos with Broccoli Slaw");
        description.add("These fish tacos, packed with crunch, are sure to please. Dinner will be on the table in less than 20 minutes. ");
        images.add(R.drawable.fishtacoswithbroccolislaw);
        ingredients.add("1 cup water\n" +
                "4 firm white fish fillets (about 4 ounces each), such as cod or halibut, 3/4 to 1 inch thick, rinsed and patted dry\n" +
                "1 teaspoon chili powder\n" +
                "1/2 teaspoon ground cumin\n" +
                "1/8 teaspoon garlic powder\n" +
                "2 cups broccoli slaw\n" +
                "1/4 cup chopped, fresh cilantro\n" +
                "1 medium green onion (thinly sliced)\n" +
                "3 tablespoons light mayonnaise\n" +
                "2 tablespoons fresh lime juice\n" +
                "4 6-inch corn tortillas ");
        recipes.add("Pour the water into the pressure cooker.Place the steaming rack in the pressure cooker.Place the fish on the rack.\n" +
                "In a small bowl, stir together the chili powder, cumin, and garlic powder. Sprinkle the mixture over the fish. Secure the lid. Cook on high pressure for 4 minutes. Quickly release the pressure.\n" +
                        "Meanwhile, in a medium bowl, stir together the broccoli slaw, cilantro, and green onion, tossing gently to combine. Stir in the mayonnaise and lime juice until blended.\n" +
                        "Heat a small nonstick skillet over medium-high heat. Warm the tortillas, one at a time, turning until heated through. Transfer to a work surface. Place the fish on the tortillas. Top with the slaw. Serve immediately. ");

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
