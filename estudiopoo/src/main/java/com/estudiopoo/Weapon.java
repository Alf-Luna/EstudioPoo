package com.estudiopoo;

public class Weapon extends Item implements Equippable{
    private boolean equipped;
    private int damage;

    public Weapon(String id, String name, int value, int damage) {
        super(id, name, value);
        this.damage = damage;
    }

    @Override
    public void equip() {
        equipped = true;
        System.out.println("Equipped " + name);
    }

    @Override
    public void unequip() {
        equipped = false;
        System.out.println("Unequipped " + name);
    }

    @Override
    public void use() {
        if (equipped){
            System.out.println("Hit for" + damage + "damage");
        } else{
            System.out.println("This item is not equipped, attack failed");
        }
    }

    public boolean isEquipped() {
        return equipped;
    }

    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
