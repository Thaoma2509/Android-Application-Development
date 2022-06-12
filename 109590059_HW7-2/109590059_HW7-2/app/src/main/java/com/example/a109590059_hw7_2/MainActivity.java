package com.example.a109590059_hw7_2;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a109590059_hw7_2.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.util.LinkedList;
public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> name = new LinkedList<>();
    private final LinkedList<String> description = new LinkedList<>();
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        name.addLast("Vietnamese Fresh Spring Rolls");
        name.addLast("Strawberry Shortcake");
        name.addLast("Confetti Corn");
        name.addLast("French Spring Soup");
        name.addLast("Mango Salsa");
        name.addLast("Healthy Summer Pasta");
        name.addLast("Lightened-Up Creamy Broccoli Salad");
        name.addLast("Rack of Lamb with Strawberry Mint Sauce");
        name.addLast("Garlic-Mustard Grilled Beef Skewers");

        description.addLast("These spring rolls are a refreshing change from the usual fried variety, and have become a family favorite. They are great as a cool summertime appetizer, and are delicious dipped in one or both of the sauces.");
        description.addLast("Aromatic citrus pervades this dessert: There's lemon zest in the shortcakes and orange zest in the macerated strawberries. Tangy Greek yogurt is a great substitute for whipped cream.");
        description.addLast("Showcase summer's best corn with Ina's off-the-cob recipe. Cook the kernels with onion and bell pepper and then toss with a mix of fresh green herbs.");
        description.addLast("I make this during asparagus season when my husband's patch is producing a lot. It is very fresh tasting, and the longer it sits, the better it is.");
        description.addLast("This fresh tasting asparagus dish is always popular. Try it with Havarti or Swiss cheese melted on top.");
        description.addLast("Ellie's summery twist on salsa includes mango and cucumber. Make homemade tortilla chips in minutes to scoop up the chunky goodness.");
        description.addLast("Healthy eating is about moderation: Two strips of bacon are all you need for a little indulgence that goes a long way in flavor.");
        description.addLast("As far as mint sauces go, I love experimenting with new ideas, especially around Easter time, and I really liked how this came out. The combination of the sweet-savory sauce and the Dijon crumb crust complemented the lamb perfectly.");
        description.addLast("Bobby's garlic-mustard glaze adds a ton of flavor to his beef tenderloin skewers while keeping things healthy. A little soy sauce goes a long way.");
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerView);
        mAdapter = new WordListAdapter(this, name, description);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}