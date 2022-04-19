package org.launchcode.ResturantMenu;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        ArrayList<MenuItem> menu = new ArrayList<>();
        String[] categories = {"appetizer", "main course", "dessert"};

        Scanner input = new Scanner(System.in);
        String itemName;
        double itemPrice;
        String itemDesc;
        String itemCategory;
        String itemNew;
        String exit = "";


        /* create menu items */
        do {
            boolean categoryValidate = false;


            /* gather menu item info */
            System.out.print("Enter Menu Item: ");
            itemName = input.nextLine().toLowerCase().trim();

            System.out.print("Enter Item Price: ");
            itemPrice = input.nextDouble();
            input.nextLine();

            System.out.print("Enter Item Description: ");
            itemDesc = input.nextLine().toLowerCase().trim();

            do {
                System.out.print("Enter Item Category (");
                for (int i = 0; i < categories.length; i++) {
                    System.out.print(categories[i]);
                    if (i != categories.length - 1) {
                        System.out.print("/");
                    }
                }
                System.out.print("): ");
                itemCategory = input.nextLine().toLowerCase().trim();

                /* validate category */
                for (int i = 0; i < categories.length; i++) {
                    if (itemCategory.equals(categories[i])) {
                        categoryValidate = true;
                        break;
                    }
                }

            } while(categoryValidate == false);

            do {
                System.out.print("New Menu Item? (Y/N): ");
                itemNew = input.nextLine().toLowerCase().trim();
            } while(!itemNew.equals("y") && !itemNew.equals("n"));


            /* create menu item and add to menu */
            MenuItem item = new MenuItem(itemName, itemPrice, itemDesc, itemCategory);
            if(itemNew.equals("y")) {
                item.setNewItem(true);
            } else if (itemNew.equals("n")) {
                item.setNewItem(false);
            }
            menu.add(item);


            /* stop adding menu items */
            do {
                System.out.print("Done adding menu items? (Y/N): ");
                exit = input.nextLine().toLowerCase().trim();
            } while(!exit.equals("y") && !exit.equals("n"));

        } while(exit.equals("n"));

        String displayMenu;


        /* validate menu view */
        do {
            System.out.print("Display [whole] or [new] menu: ");
            displayMenu = input.nextLine().toLowerCase().trim();
        } while(!displayMenu.equals("whole") && !displayMenu.equals("new"));

        if(displayMenu.equals("whole")) {
            for(int i = 0; i < menu.size(); i++) {
                System.out.println(menu.get(i).getName() + "   -   " + menu.get(i).getPrice());
                System.out.println("   " + menu.get(i).getDescription());
                System.out.println();
            }
        } else if (displayMenu.equals("new")) {
            for(int i = 0; i < menu.size(); i++) {
                if(menu.get(i).getNewItem() == true) {
                    System.out.println(menu.get(i).getName() + "   -   " + menu.get(i).getPrice());
                    System.out.println("   " + menu.get(i).getDescription());
                    System.out.println();
                }
            }
        }
    }
}
