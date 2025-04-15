package com.estudiopoo;

public class Tool extends Item implements Equippable{
    private int yield;
    private boolean equipped;

    public Tool(String id, String name, int value, int yield) {
        super(id, name, value);
        this.yield = yield;
    }

    @Override
    public void equip() {
        equipped = true;
    }

    @Override
    public void unequip() {
        equipped = false;
    }

    @Override
    public void use() {
        if (equipped){
            System.out.println("Used " + name + "produced " + yield + "rock(s)");
        } else{
            System.out.println("This item is not equipped, failed to use");
        }
    }

}
