 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

/*
         DYNAMIC SHOPPING CART
*/

public class ArrayList_Level_One {
    
    static Scanner userInput = new Scanner(System.in);
    static boolean running = true;
    static List<String> shoppingCart = new ArrayList<>();
    public static void main(String[] args) {
        
        
        //MyFrame myFrame = new MyFrame();
        
        do{
            
            int Select = shoppingMenu();
            switch(Select){
                case 1:
                    addItems();
                    break;
                case 2:
                    removeItems();
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    clearCart();
                    break;
            }
        }while(running);
        
        userInput.close();
    }
    
    static int shoppingMenu(){
        int select;
        System.out.println("Online Shopping Cart\n"
                + "\n1 Add items"
                + "\n2 Remove items"
                + "\n3 View Cart"
                + "\n4 Clear Cart"
                + "\nExit");
        
        do{
            select = selectOption();
            
        }while(false);
        return select;
    }
    
    static void addItems(){
        String item;
        int itemAmount;
        System.out.print("Enter the name of the item that you want to add: ");
        item = userInput.nextLine();
        System.out.println("Amount: ");
        itemAmount = userInput.nextInt();
        System.out.println(itemAmount +"x "+ item+" has now been added to your Cart");
        for (int i = 0; i > itemAmount; i++){
            shoppingCart.add(item);
        }
            System.out.println("Still want to continue?\n"
                    + "Yes\n"
                    + "No");
            String ifContinue = userInput.nextLine();
            
        if (ifContinue.equalsIgnoreCase("no")){ // end loop
        }
    }
    
    static void removeItems(){
        
    }
    
    static void viewCart(){  
        System.out.println(shoppingCart);
    }
    
    static void clearCart(){
        
    }

    static int selectOption(){
        String input;
        while (true) {
            System.out.print("Select your choice: ");
            input = userInput.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
            System.out.println("Thank you for using Shopping Cart!");
            running=false;
            return -99;
            }
            try {
            int number = Integer.parseInt(input);
            return number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please try again.");
            }
        }
    } 
}
