import java.util.Scanner;

import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;

    private String currentDate;

    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();

    Scanner scnr = new Scanner(System.in);


    public ShoppingCart() {
        customerName = "none";

        currentDate = "January 1, 2016";
    }

    public ShoppingCart(String customerName, String currentDate) {

    }

    public void setCustomerName(String name) {
        customerName = name;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setDate(String date) {
        currentDate = date;

    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item) {
        cartItems.add(item);

    }

    public void removeItem(String itemName) {
        for (int i = 0; i < cartItems.size(); i++) {

            if (cartItems.get(i).getName().equals(itemName)) {
                cartItems.remove(i);

                return;

            }


        }
        System.out.println("Item not found in cart. Nothing removed.");


    }

    public void modifyItem(ItemToPurchase item) {
        for (int i =0; i < cartItems.size(); ++i){
            if(cartItems.get(i).getName().equals(item.getName())){
                if(!item.getDescription().equals("none")) {
                    cartItems.get(i).setDescription(item.getDescription());
                }

                if(item.getPrice() != 0){
                    cartItems.get(i).setPrice(item.getPrice());



                }

                if(item.getQuantity() != 0){
                    cartItems.get(i).setQuantity(item.getQuantity());
                }



            }

        }
        System.out.println("Item not found in cart. Nothing modified.");


    }

    public int getNumItemsInCart() {
        int count = 0;

        for (int i = 0; i < cartItems.size(); i++){
            count += cartItems.get(i).getQuantity();
        }
        return count;


    }

    public int  getCostOfCart() {
        int cost = 0;
        for (int i = 0; i < cartItems.size(); ++i){
            cost += cartItems.get(i).getPrice();

        }
        return cost;


    }

    public void printTotal() {
        if(cartItems.size() > 0){
            System.out.println(customerName + "'s Shopping Cart - " + currentDate);
            System.out.println("Number of Items:" + getNumItemsInCart());
            System.out.println("");
            System.out.println( +  getNumItemsInCart());
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.print("Total: " + getCostOfCart());

        }else if (cartItems.size() < 1) {
            System.out.println(customerName + "'s " + "Shopping Cart - "+ currentDate);
            System.out.println("Number of Items: " + getNumItemsInCart());
            System.out.println("");
            System.out.println("SHOPPING CART IS EMPTY");
            System.out.println("");
            System.out.println("Total: " + getCostOfCart());

        }


    }
    //John Doe's Shopping Cart - February 1, 2016
    //Number of Items: 8
    //
    //Nike Romaleos 2 @ $189 = $378
    //Chocolate Chips 5 @ $3 = $15
    //Powerbeats 2 Headphones 1 @ $128 = $128
    //
    //Total: $521

    //John Doe's Shopping Cart - February 1, 2016
    //Number of Items: 0
    //
    //SHOPPING CART IS EMPTY
    //
    //Total: $0

    public void printDescriptions() {
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("");
        System.out.println("Item Descriptions");

        for (int i = 0; i < cartItems.size(); ++i){
              cartItems.get(i).printItemDescription();

        }
        if(cartItems.size() < 1){
            System.out.println("SHOPPING CART IS EMPTY");
        }



    }

    //John Doe's Shopping Cart - February 1, 2016
    //
    //Item Descriptions
    //Nike Romaleos: Volt color, Weightlifting shoes
    //Chocolate Chips: Semi-sweet
    //Powerbeats 2 Headphones: Bluetooth headphones

}




