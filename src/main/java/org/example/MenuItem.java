package org.example;

public class MenuItem {
    private double price;
    private String name;
    private String description;
    private String category;

    private String newOrNaw;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

        private String isNew(MenuItem){
        if(MenuItem.Updated()) {
            return "is new";

        }else{
            return "is not new";
        }
    }
}
