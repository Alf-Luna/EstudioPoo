package com.estudiopoo;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(5);
        Potion healthPotion = new Potion("123", "Minor Health Potion", 50, 10, true);
        inventory.addItem(healthPotion);
        inventory.showIventory();
        inventory.removeItem(healthPotion);
        inventory.showIventory();
    }
}