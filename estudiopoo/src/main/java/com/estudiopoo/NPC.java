package com.estudiopoo;

public class NPC extends LivingEntity{
    private String name;

    public NPC(int maxHealth, String name){
        super(maxHealth);
        this.name = name;
    }

    @Override
    public void Attack(LivingEntity enemEntity) {
        enemEntity.ReceiveDamage(10);
        System.out.println(name + " attacked for " + 10 + "damage");
    }

    public String getName(){
        return name;
    }
}
