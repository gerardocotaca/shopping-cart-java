# Shopping Cart

## Overview

The Shopping Cart program is a Java console application designed to maintain a list of products, including their names, categories, and prices. The application categorizes products into different types (Tech, Grocery, Office) and calculates the average dollars spent per category. This project demonstrates basic Java programming skills, including array handling, user input processing, and category-based calculations.

## Project Goals

The main objective of this project was to create a shopping cart system that allows users to input product details and view categorized products along with the average spending per category. This project showcases the ability to handle arrays, user input validation, and basic arithmetic operations in Java.

## Key Features

- **Product Input**: Allows users to enter details for five products, including name, category, and price.
- **Category-Based Display**: Categorizes products into Tech, Grocery, and Office, and displays them accordingly.
- **Average Spending Calculation**: Computes and displays the average amount spent per category.
- **Validation and Error Handling**: Ensures valid category input and handles invalid categories appropriately.

## Technologies Used

- **Java**: The project is implemented in Java, utilizing core language features such as arrays, conditionals, and loops.
- **Scanner Class**: Used for reading user input from the console.
- **String Handling**: Processes and validates product categories and names.

## Implementation Details

The program is structured to perform the following steps:

1. **Input Collection**: Prompts the user to enter the name, category, and price for each product.
2. **Category Display**: Displays products categorized as Tech, Grocery, or Office, and computes the average spending for each category.
3. **Validation**: Checks if the entered category is valid (Tech, Grocery, or Office) and handles invalid categories.
4. **Average Calculation**: Computes the average amount spent on products in each category and displays it.

### Key Variables and Methods

- **`productNames`**: Array to store the names of the products.
- **`productCategories`**: Array to store the categories of the products.
- **`productPrices`**: Array to store the prices of the products.
- **`displayCategory()`**: Method that displays products for a specific category and calculates the average spending.
- **`equalsIgnoreCase()`**: Method to compare category names in a case-insensitive manner.

## Relevance to Software Engineering Roles

This project aligns with software engineering roles that require:

- **Java Programming**: Demonstrates proficiency in Java, including array handling and user input processing.
- **Data Categorization**: Shows the ability to categorize and process data based on user input.
- **Basic Calculations**: Highlights skills in performing calculations and displaying results in a user-friendly format.

## How to Use

1. **Compile the Program**: Use a Java compiler to compile the `ShoppingCart.java` file.
2. **Run the Application**: Execute the compiled Java program to start the shopping cart application.
3. **Input Data**: Enter the name, category, and price for each product when prompted.
4. **View Results**: The program will display products categorized by Tech, Grocery, and Office, along with the average amount spent per category.

## Future Enhancements

- **Dynamic Product Management**: Allow users to add or remove products dynamically.
- **Improved User Interface**: Develop a graphical user interface (GUI) for a more interactive experience.
- **Enhanced Validation**: Add more robust validation for user inputs and categories.

## License

This project is licensed under the MIT License.
