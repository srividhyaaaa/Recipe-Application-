# 🍴 Recipe Book

**Recipe Book** is a simple and engaging Android application designed to make discovering and preparing delicious recipes easier. Users can select a recipe from the available menu and instantly view its ingredients, category, and step-by-step preparation instructions.

## ✨ Features

* 🍽️ Easy-to-use recipe selection menu
* 👨‍🍳 Clean and attractive user interface
* 🧂 Detailed list of ingredients
* 📖 Step-by-step preparation instructions
* 🍛 Includes Indian and international recipes
* 📱 Responsive and scrollable layout
* ⚡ Fast and lightweight
* 🌐 Works without an internet connection

## 🍴 Available Recipes

The application currently includes:

* 🍛 Veg Biryani
* 🍝 White Sauce Pasta
* 🍰 Chocolate Cake
* 🍕 Cheesy Pizza
* 🍛 Paneer Butter Masala
* 🥣 Rasmalai
* 🍮 Gulab Jamun

## 🛠️ Technologies Used

* **Java** – Application logic and recipe selection
* **XML** – User interface design
* **Android Studio** – Development environment
* **Android SDK** – Application development and testing


## 🚀 How to Run

1. Install **Android Studio**.
2. Open the Recipe Book project in Android Studio.
3. Allow Gradle to sync and download the required dependencies.
4. Connect an Android device or start an Android Emulator.
5. Click **Run ▶**.
6. The application opens with a **Select a Recipe** option.
7. Choose a recipe to view its ingredients and preparation steps.

## 🎯 How It Works

When the application starts, it displays a welcome screen instead of automatically opening a recipe. The user selects a recipe from the dropdown menu. Java handles the selection event and dynamically updates the recipe title, category, ingredients, and preparation instructions in the XML-based interface.

## 🔄 Application Flowchart

The following flowchart represents the basic working process of the Recipe Book application:

```text
                 ┌─────────────────────┐
                 │       START         │
                 └──────────┬──────────┘
                            │
                            ▼
                 ┌─────────────────────┐
                 │   Launch Recipe     │
                 │       Book App      │
                 └──────────┬──────────┘
                            │
                            ▼
                 ┌─────────────────────┐
                 │   Display Welcome   │
                 │       Screen        │
                 └──────────┬──────────┘
                            │
                            ▼
                 ┌─────────────────────┐
                 │   Select a Recipe   │
                 │   from Dropdown     │
                 └──────────┬──────────┘
                            │
                            ▼
                    ┌───────────────┐
                    │ Recipe Selected│
                    └───────┬───────┘
                            │
                            ▼
                 ┌─────────────────────┐
                 │ Display Recipe Name │
                 │ & Category          │
                 └──────────┬──────────┘
                            │
                            ▼
                 ┌─────────────────────┐
                 │ Display Ingredients │
                 └──────────┬──────────┘
                            │
                            ▼
                 ┌─────────────────────┐
                 │ Display Preparation │
                 │      Steps          │
                 └──────────┬──────────┘
                            │
                            ▼
                 ┌─────────────────────┐
                 │    Choose Another   │
                 │       Recipe?       │
                 └──────────┬──────────┘
                            │
                       ┌────┴────┐
                       │         │
                      YES        NO
                       │         │
                       ▼         ▼
              ┌─────────────┐  ┌─────────┐
              │ Select New  │  │   END   │
              │   Recipe    │  └─────────┘
              └──────┬──────┘
                     │
                     └──────────────►
                        Back to
                    Recipe Selection
```

### 🔍 Flow Explanation

1. **Start:** The application is launched by the user.
2. **Welcome Screen:** The app displays the Recipe Book interface without automatically opening a recipe.
3. **Recipe Selection:** The user selects a recipe from the dropdown menu.
4. **Recipe Details:** The application displays the selected recipe's name, category, ingredients, and preparation steps.
5. **Another Recipe:** The user can return to the dropdown and select another recipe.
6. **End:** The user exits the application when finished.


## 🎨 User Interface

The application uses a warm food-inspired design with:

* Cream-colored background
* Brown and gold accents
* Rounded recipe cards
* Clear section headings
* Chef-inspired branding
* Simple navigation

The interface is designed to keep the application **clean, readable, and beginner-friendly**.

## 🔮 Future Enhancements

Future versions of Recipe Book can include:

* 🔍 Recipe search functionality
* ❤️ Favorite recipes
* 🖼️ Recipe images
* ⏱️ Cooking timers
* ⭐ Recipe ratings
* 📋 Custom recipe creation
* 🗂️ Recipe categories
* 🔔 Cooking reminders
* 🗄️ Database support for storing recipes

## 📌 Project Objective

The main objective of Recipe Book is to develop a simple Android application that demonstrates fundamental concepts of mobile application development, including **XML-based UI design, Java programming, event handling, arrays, and dynamic content updates**.

## 👩‍💻 Author

**Recipe Book – Android Application**

Developed as an academic Android application project.

## 📄 License

This project is created for **educational and academic purposes**.
