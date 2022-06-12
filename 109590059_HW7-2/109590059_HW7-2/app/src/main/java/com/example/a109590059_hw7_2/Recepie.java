package com.example.a109590059_hw7_2;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Recepie extends AppCompatActivity {

    ActionBar actionBar;
    int pos;
    String fullReceipe;
    TextView mShowText;
    ImageView foodPic;
    int foodId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepie);
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        pos = intent.getIntExtra("Position", 0);
        switch (pos) {
            case 0:
                fullReceipe = "4 cloves garlic, finely chopped\n" +
                        "1/4 cloves garlic, finely chopped\n" +
                        "4 cloves garlic, finely chopped\n" +
                        "2 teaspoons Spanish paprika\n" +
                        "1/4 teaspoon kosher salt\n" +
                        "1/4 teaspoon kosher salt\n" +
                        "1/4 teaspoon kosher salt\n" +
                        "2 tablespoons white wine vinegar\n" +
                        "1 tablespoon honey";
                foodId = R.drawable.vietnamese;
                break;
            case 1:
                fullReceipe = "4 cups strawberries, sliced\n" +
                        "1 cup white sugar\n" +
                        "8 cups cold water\n" +
                        "1 lime, cut into 8 wedges\n" +
                        "8 fresh mint sprigs";
                foodId = R.drawable.strawberry;
                break;
            case 2:
                fullReceipe = "2 tablespoons good olive oil\n" +
                        "1 small orange bell pepper, 1/2-inch diced\n" +
                        "Kernels cut from 5 ears yellow or white corn (4 cups)\n" +
                        "2 tablespoons julienned fresh basil, minced fresh chives, and/or minced fresh parsley leaves";
                foodId = R.drawable.confetti;
                break;
            case 3:
                fullReceipe = "2 tablespoons good olive oil\n" +
                        "1 pound leeks, chopped\n" +
                        "1 onion, chopped\n" +
                        "2 quarts water\n" +
                        "3 large potatoes, chopped\n" +
                        "2 large carrots, chopped\n" +
                        "1 bunch fresh asparagus, trimmed and cut into 1 inch pieces\n" +
                        "⅓ cup uncooked long-grain white rice\n" +
                        "4 teaspoons salt\n" +
                        "½ pound fresh spinach\n" +
                        "1 cup heavy cream";
                foodId = R.drawable.soup;
                break;
            case 4:
                fullReceipe = "1 mango, peeled and diced\n" +
                        "1/2 cup peeled, diced cucumber\n" +
                        "1 tablespoon finely chopped jalapeno\n" +
                        "1/3 cup diced red onion\n" +
                        "1 tablespoon lime juice\n" +
                        "1/3 cup roughly chopped cilantro leaves\n" +
                        "salt and pepper to taste";
                foodId = R.drawable.mango;
                break;
            case 5:
                fullReceipe = "Kosher salt\n" +
                        "8 ounces dry cavatappi \n" +
                        "Quarter of a red onion, minced\n" +
                        "1/2 cup mayonnaise\n" +
                        "3 tablespoons sour cream\n" +
                        "3 tablespoons sour cream\n" +
                        "1 cup cherry or grape tomatoes, halved or quartered if large";
                foodId = R.drawable.pasta;
                break;
            case 6:
                fullReceipe = "1 cup raw peas\n" +
                        "1/2 cups broccoli florets (about 1 pound), cut into bite-size pieces\n" +
                        "½ lemon, juiced\n" +
                        "salt and ground black pepper to taste";
                foodId = R.drawable.salad;
                break;
            case 7:
                fullReceipe = "2 cups fresh strawberries, hulled and halved\n" +
                        "1 lemon, zested and juiced\n" +
                        "1 lemon, juiced\n" +
                        "¼ cup water\n" +
                        "2 tablespoons honey\n" +
                        "salt and cayenne pepper to taste\n" +
                        "¼ cup freshly sliced mint leaves";
                foodId = R.drawable.lamb;
                break;
            case 8:
                fullReceipe = "2 ounces rice vermicelli\n" +
                        "8 rice wrappers (8.5 inch diameter)\n" +
                        "8 large cooked shrimp - peeled, deveined and cut in half\n" +
                        "1 ⅓ tablespoons chopped fresh Thai basil\n" +
                        "3 tablespoons chopped fresh mint leaves\n" +
                        "3 tablespoons chopped fresh cilantro\n" +
                        "2 leaves lettuce, chopped\n" +
                        "4 teaspoons fish sauce\n" +
                        "¼ cup water\n" +
                        "2 tablespoons fresh lime juice\n" +
                        "1 clove garlic, minced\n" +
                        "2 tablespoons white sugar\n" +
                        "½ teaspoon garlic chili sauce\n" +
                        "3 tablespoons hoisin sauce\n" +
                        "1 teaspoon finely chopped peanuts";
                foodId = R.drawable.beef;
                break;
            default:
                break;

        }
        mShowText = (TextView) findViewById(R.id.recepieText);
        mShowText.setText(fullReceipe);
        foodPic = (ImageView) findViewById(R.id.foodPic);
        foodPic.setImageResource(foodId);

    }
}