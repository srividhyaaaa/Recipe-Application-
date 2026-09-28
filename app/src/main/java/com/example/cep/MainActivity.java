package com.example.cep;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner recipeSpinner;

    TextView recipeEmoji;
    TextView recipeTitle;
    TextView recipeCategory;
    TextView ingredientsText;
    TextView stepsText;

    // Recipe names
    String[] recipes = {
            "Select a Recipe",
            "Biryani",
            "Pasta",
            "Cake",
            "Pizza",
            "Paneer Butter Masala",
            "Rasmalai",
            "Gulab Jamun"
    };

    // Recipe emojis
    String[] emojis = {
            "🍛",   // Biryani
            "🍝",   // Pasta
            "🍰",   // Cake
            "🍕",   // Pizza
            "🍛",   // Paneer Butter Masala
            "🥣",   // Rasmalai
            "🍮"    // Gulab Jamun
    };

    // Recipe titles
    String[] titles = {
            "Veg Biryani",
            "White Sauce Pasta",
            "Chocolate Cake",
            "Cheesy Pizza",
            "Paneer Butter Masala",
            "Rasmalai",
            "Gulab Jamun"
    };

    // Recipe categories
    String[] categories = {
            "Main Course • Indian",
            "Main Course • Italian",
            "Dessert • Bakery",
            "Main Course • Italian",
            "Main Course • Indian",
            "Dessert • Indian",
            "Dessert • Indian"
    };

    // Ingredients
    String[] ingredients = {

            // Biryani
            "• Rice\n" +
                    "• Mixed vegetables\n" +
                    "• Onion\n" +
                    "• Tomato\n" +
                    "• Biryani masala\n" +
                    "• Salt\n" +
                    "• Oil",

            // Pasta
            "• Pasta\n" +
                    "• Milk\n" +
                    "• Butter\n" +
                    "• Cheese\n" +
                    "• Black pepper\n" +
                    "• Salt\n" +
                    "• Oregano",

            // Cake
            "• All-purpose flour\n" +
                    "• Sugar\n" +
                    "• Cocoa powder\n" +
                    "• Milk\n" +
                    "• Eggs\n" +
                    "• Butter\n" +
                    "• Baking powder",

            // Pizza
            "• Pizza base\n" +
                    "• Tomato sauce\n" +
                    "• Mozzarella cheese\n" +
                    "• Onion\n" +
                    "• Capsicum\n" +
                    "• Oregano\n" +
                    "• Chilli flakes",

            // Paneer Butter Masala
            "• Paneer\n" +
                    "• Tomato\n" +
                    "• Onion\n" +
                    "• Butter\n" +
                    "• Fresh cream\n" +
                    "• Cashews\n" +
                    "• Garam masala\n" +
                    "• Salt",

            // Rasmalai
            "• Milk\n" +
                    "• Sugar\n" +
                    "• Paneer balls\n" +
                    "• Cardamom\n" +
                    "• Saffron\n" +
                    "• Dry fruits",

            // Gulab Jamun
            "• Khoya\n" +
                    "• All-purpose flour\n" +
                    "• Milk\n" +
                    "• Sugar\n" +
                    "• Cardamom\n" +
                    "• Oil"
    };

    // Preparation steps
    String[] steps = {

            // Biryani
            "1. Wash and soak the rice for 20 minutes.\n\n" +
                    "2. Heat oil and fry the onions until golden brown.\n\n" +
                    "3. Add vegetables, tomato and biryani masala.\n\n" +
                    "4. Add soaked rice and required water.\n\n" +
                    "5. Cover and cook until the rice is completely done.\n\n" +
                    "6. Serve hot with raita.",

            // Pasta
            "1. Boil the pasta until soft and drain the water.\n\n" +
                    "2. Melt butter in a pan.\n\n" +
                    "3. Add milk and cook on low flame.\n\n" +
                    "4. Add cheese, salt and pepper.\n\n" +
                    "5. Add the boiled pasta and mix well.\n\n" +
                    "6. Sprinkle oregano and serve hot.",

            // Cake
            "1. Preheat the oven to 180°C.\n\n" +
                    "2. Mix flour, cocoa powder and baking powder.\n\n" +
                    "3. Add sugar, milk, eggs and butter.\n\n" +
                    "4. Mix everything until the batter becomes smooth.\n\n" +
                    "5. Pour the batter into a baking tray.\n\n" +
                    "6. Bake for about 30 minutes.",

            // Pizza
            "1. Place the pizza base on a baking tray.\n\n" +
                    "2. Spread tomato sauce evenly over the base.\n\n" +
                    "3. Add onion and capsicum.\n\n" +
                    "4. Add a generous layer of cheese.\n\n" +
                    "5. Sprinkle oregano and chilli flakes.\n\n" +
                    "6. Bake for 10–15 minutes.",

            // Paneer Butter Masala
            "1. Cut paneer into small cubes.\n\n" +
                    "2. Fry onion, tomato and cashews.\n\n" +
                    "3. Add butter and garam masala.\n\n" +
                    "4. Add the paneer pieces and mix gently.\n\n" +
                    "5. Add fresh cream and cook for a few minutes.\n\n" +
                    "6. Serve hot with naan or rice.",

            // Rasmalai
            "1. Boil milk in a heavy-bottomed pan.\n\n" +
                    "2. Add sugar and cardamom.\n\n" +
                    "3. Gently add the paneer balls.\n\n" +
                    "4. Add saffron and chopped dry fruits.\n\n" +
                    "5. Simmer for a few minutes.\n\n" +
                    "6. Cool and serve chilled.",

            // Gulab Jamun
            "1. Mix khoya, flour and a little milk.\n\n" +
                    "2. Make small smooth balls from the mixture.\n\n" +
                    "3. Heat oil and deep fry the balls until golden brown.\n\n" +
                    "4. Prepare sugar syrup with cardamom.\n\n" +
                    "5. Add the fried balls to the warm syrup.\n\n" +
                    "6. Allow them to soak and serve."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Connect Java with XML views
        recipeSpinner = findViewById(R.id.recipeSpinner);

        recipeEmoji = findViewById(R.id.recipeEmoji);
        recipeTitle = findViewById(R.id.recipeTitle);
        recipeCategory = findViewById(R.id.recipeCategory);

        ingredientsText = findViewById(R.id.ingredientsText);
        stepsText = findViewById(R.id.stepsText);

        // Create Spinner Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                recipes
        );

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        recipeSpinner.setAdapter(adapter);

        // Handle recipe selection
        recipeSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(
                            AdapterView<?> parent,
                            View view,
                            int position,
                            long id) {

                        showRecipe(position);
                    }

                    @Override
                    public void onNothingSelected(
                            AdapterView<?> parent) {

                        showRecipe(0);
                    }
                }
        );

        // Show welcome screen initially
        showRecipe(0);
    }

    private void showRecipe(int position) {

        // =========================================
        // DEFAULT SCREEN
        // =========================================

        if (position == 0) {

            recipeEmoji.setText("🍽️");

            recipeTitle.setText("Choose a Recipe");

            recipeCategory.setText(
                    "Select a recipe from the menu"
            );

            ingredientsText.setText(
                    "Select a recipe to view its ingredients."
            );

            stepsText.setText(
                    "Select a recipe to view the preparation steps."
            );

            return;
        }

        // =========================================
        // SELECTED RECIPE
        // =========================================

        int index = position - 1;

        recipeEmoji.setText(emojis[index]);

        recipeTitle.setText(titles[index]);

        recipeCategory.setText(categories[index]);

        ingredientsText.setText(
                ingredients[index]
        );

        stepsText.setText(
                steps[index]
        );
    }
}
