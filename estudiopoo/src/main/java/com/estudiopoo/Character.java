package com.estudiopoo;

public class Character extends LivingEntity{
    private Inventory inventory;
    private int health;
    private String name;
    private Item equippedItem;
    
    public Character(int maxHealth, Inventory inventory, int health, String name) {
        super(maxHealth);
        this.inventory = inventory;
        this.health = health;
        this.name = name;
    }

    public void equipItem(String id){
        for(Item item : inventory.getItems()){
            if (item.getId().equals(id)){
                equippedItem = item;
                System.out.println("equipped " + item.getName());
                return;
            }
        }
        System.out.println("No item found");
    }

    public void useItem(){
        try{
            equippedItem.use();
        } catch (Exception e){
            System.out.println("lol");
        }
    }

    public void unequipItem(){
        equippedItem = null;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getEquippedItem() {
        return equippedItem;
    }

    public void setEquippedItem(Item equippedItem) {
        this.equippedItem = equippedItem;
    }

    @Override
    public void ReceiveDamage(int damage) {
        health -= damage;
        System.out.println("Received " + damage + ". Current healt: " + health);
    }

    @Override
    public void Attack(LivingEntity enemEntity) {
        enemEntity.ReceiveDamage(10);
        System.out.println(name + " attacked for " + 10 + "damage");
    }
}
