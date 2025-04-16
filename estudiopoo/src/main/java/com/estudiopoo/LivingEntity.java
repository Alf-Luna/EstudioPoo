package com.estudiopoo;

public abstract class LivingEntity implements IDamagable{
    private int maxHealth;
    private int currentHealth;
    private boolean isDead;

    public LivingEntity(int maxHealth){
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }
    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public boolean getIsDead(){
        return isDead;
    }

    public boolean setIsDead(boolean isDead){
        this.isDead = isDead;
        return isDead;
    }

    @Override
    public void ReceiveDamage(int damage) {
        currentHealth -= damage;
        System.out.println("Received " + damage + ". Current healt: " + currentHealth);
        if (currentHealth <= 0){
            isDead = true;
        }
    }

    public abstract void Attack(LivingEntity enemEntity);
}
