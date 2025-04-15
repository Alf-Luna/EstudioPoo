package com.estudiopoo;

public class Potion extends Item implements Consumable{
    private int heal;
    private boolean filled;
    
    public Potion(String id, String name, int value, int heal, boolean filled){
        super(id,name, value);
        this.heal = heal;
        this.filled = filled;
    }

    public int getHeal(){
        return heal;
    }
    
    public void setHeal(int heal){
        this.heal = heal;
    }

    @Override
    public void use() {
        System.out.println("Healed " + heal + "HP");
    }

    @Override
    public void Consume() {
        if(filled){
            use();
            filled = false;
        } else {
            System.out.println(name + " is empty!");
        }
    }
}
