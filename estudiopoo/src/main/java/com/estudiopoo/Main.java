package com.estudiopoo;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.setCapacity(10);
        Potion healthPotion = new Potion("123", "Minor Health Potion", 50, 10, true);
        inventory.addItem(healthPotion);
        inventory.showIventory();
        //inventory.removeItem(healthPotion);
        //inventory.showIventory();
        Weapon sword = new Weapon("A123", "Iron Sword", 10, 50);
        Character personaje = new Character(50, inventory, 0, "Alfo");
        personaje.getInventory().addItem(sword);
        personaje.equipItem("A123");

        NPC guard = new NPC(20, "Timmy");
        Combat encounter = new Combat(personaje, guard);
        encounter.combatStart();
    }
}