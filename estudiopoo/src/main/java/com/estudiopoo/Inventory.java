package com.estudiopoo;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;
    private int capacity;

    public Inventory(int capacity){
        items = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addItem(Item item){
        if(items.size() < capacity){
            items.add(item);
            System.out.println(item.getName() + " was successfully added to the inventory");
        } else{
            System.out.println("Inventory at full capacity");
        }
    }

    public void removeItem(Item item){
        if(items.remove(item)){
            System.out.println("Removed " + item.getName() + " successfully");
        } else{
            System.out.println("No " + item.getName() + " found in your inventory");
        }
    }

    public void showIventory(){
        System.out.println("Inventory:");
        for(Item item : items){
            System.out.println(item.getName() + " - value: " + item.getValue());
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
