import java.util.Scanner;

public class ShoppingCartManager {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */

        ItemToPurchase purchase1 = new ItemToPurchase();

        ItemToPurchase purchase2 = new ItemToPurchase();

        System.out.println("Item 1");

        System.out.println("Enter the item name:");

        purchase1.setName(scnr.nextLine());

        System.out.println("Enter the item price:");

        purchase1.setPrice(scnr.nextInt());

        System.out.println("Enter the item quantity:");

        System.out.println("");

        purchase1.setQuantity(scnr.nextInt());

        System.out.println("Item 2");

        System.out.print(scnr.nextLine());

        System.out.println("Enter the item name:");

        purchase2.setName(scnr.nextLine());

        System.out.println("Enter the item price:");

        purchase2.setPrice(scnr.nextInt());

        System.out.println("Enter the item quantity:");

        System.out.println("");

        purchase2.setQuantity(scnr.nextInt());

        System.out.println("TOTAL COST");

        System.out.println(purchase1.getName() + " " +  purchase1.getQuantity() + " @ $" + purchase1.getPrice() + " = $" + (purchase1.getPrice() * purchase1.getQuantity()));

        System.out.println(purchase2.getName() + " " + purchase2.getQuantity() + " @ $" + purchase2.getPrice() + " = $" + (purchase2.getPrice() * purchase2.getQuantity()));

        System.out.println("");

        System.out.println("Total: " + "$"+ ((purchase1.getPrice() * purchase1.getQuantity()) + (purchase2.getPrice() * purchase2.getQuantity())));

        ShoppingCart name = new ShoppingCart();

        ShoppingCart date = new ShoppingCart();

        System.out.println("Enter Customer's Name:");

        name.setCustomerName(scnr.nextLine());

        System.out.println("");

        System.out.println("Enter Today's Date:");

        date.setDate(scnr.nextLine());

        System.out.println("Customer Name: " + );

        System.out.println("Today's Date: " + date);






    }
}




