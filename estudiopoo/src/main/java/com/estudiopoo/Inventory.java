package com.estudiopoo;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;
    private int capacity;
    private int currentCapacity;

    public Inventory(){
        items = new ArrayList<>();
        this.currentCapacity = 0;
    }

    public void setCapacity(int capacity){
        if (capacity > -1){
            this.capacity = capacity;
        } else{
            System.out.println("Capacity can't be lower than 0");
        }
    }

    public void addItem(Item item){
        if(currentCapacity < capacity){ //Checks for space
            items.add(item);
            currentCapacity++; //adds to currently used inventory space
            System.out.println(item.getName() + " was successfully added to the inventory. Current capacity: " + currentCapacity + "/" + capacity);
        } else{
            System.out.println("Inventory at full capacity");
        }
    }

    public void removeItem(Item item){
        if(items.remove(item)){
            System.out.println("Removed " + item.getName() + " successfully");
            currentCapacity--; //substracts to currently used inventory space
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
