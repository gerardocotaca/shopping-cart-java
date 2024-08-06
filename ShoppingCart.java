//Gerardo Cota-Canez, gcotacan, CIS 340, A4

import java.util.Scanner;

public class ShoppingCart {

	private static Object[] categories;
	private static Object targetCategory;
	private static double[] prices;
	private static char[][] names;
	private static String categoryTitle;
	private static String targertCategory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//Initializing our arrays to store the info of the products
		String[] productNames = new String[5];
		String[] productCategories = new String[5];
		double[] productPrices = new double [5];
		
		
		//Displaying shopping cart by the category it is grouped in
				System.out.println("\nShopping Cart");
				System.out.println("This program maintains a list of products(name, category, price). It will calculate average dollars spent per category for you.");
				
				
		//Entering the information for the 5 products
		for(int i = 0; i < 5; i++) {
			System.out.println();
			System.out.print("Enter product name: ");
			productNames[i]= scanner.nextLine();
			
		//Asking user for a category input
		boolean validCategory = false;
		
		while(!validCategory) {
			System.out.print("Enter product category(Tech/Grocery/Office):");
			
			String categoryInput = scanner.nextLine().toUpperCase();
			
		//Checking if category is valid
		switch(categoryInput) {
		case "TECH":
		case "GROCERY":
		case "OFFICE":
			
		productCategories[i] = categoryInput;
		
		validCategory = true;
		break;
		
		default:	
		System.out.println("Invalid category. Please enter Tech, Grocery, or Office.");
		}
	}
		
		System.out.print("Enter product price: ");
		productPrices[i] = Double.parseDouble(scanner.nextLine());
		}
		
	
		//Tech products
		displayCategory("TECH PRODUCTS", "Tech", productNames, productCategories, productPrices);
		
		//Grocery products
		displayCategory("GROCERY PRODUCTS", "Grocery", productNames, productCategories, productPrices);
		
		//Office products
		displayCategory("OFFICE PRODUCTS", "Office", productNames, productCategories, productPrices);
		
		//Invalid products
		displayCategory("OTHER", "Invalid", productNames, productCategories, productPrices);
		
		//closing the scanner
		scanner.close();
		
	}

	private static void displayCategory(String categoryTitle, String targetCategory, String[] productNames,
			String[] productCategories, double[] productPrices) {
		// TODO Auto-generated method stub
		
		System.out.println("\n" + targetCategory + "PRODUCTS");
		
		int count = 0;
		double total = 0.0;
		
		//checking for null
		if(names != null) 
		{
		for(int i = 0; i < names.length; i++)
		{
		//Checking if category fits the target category
			if(categories[i] != null && equalsIgnoreCase(categories[i], targetCategory))
			{
			System.out.println(names[i]);
			total +=  prices[i];
			count++;
				}
			}
		}
		
		double average = (count > 0) ? total/names.length : 0.0;
		
		if(average > 0) {
		}System.out.printf("Average dollars spent: %.2f\n",average);
		}

	private static boolean equalsIgnoreCase(Object object, String targetCategory2) {
		// TODO Auto-generated method stub
		return false;
	}	
}


