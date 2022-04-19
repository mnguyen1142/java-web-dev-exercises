package org.launchcode.ResturantMenu;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category; // appetizer, main course, dessert
    private boolean newItem;

    public MenuItem(String name, double price, String description, String category, boolean newItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = true;
    }

    /* getters */
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public boolean getNewItem() { return newItem; }

    /* setters */
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setDescription(String description) { this.description = description; }
    public void setCategory(String category) { this.category = category; }
    public void setNewItem(boolean newItem) { this.newItem = newItem; }

}
