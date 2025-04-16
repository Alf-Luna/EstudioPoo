package com.estudiopoo;

public class Combat {
    private Character player;
    private NPC enemy;

    public Combat(Character player, NPC enemy){
        this.player = player;
        this.enemy = enemy;
    }

    public void combatStart(){
        int turn = 1;
        System.out.println("You have encountered an enemy " + enemy.getName());
        while(isThereCombat()){
            System.out.println("Turn: " + turn);
            player.Attack(enemy);
            enemy.Attack(player);
            turn++;
        }
    }

    public boolean isThereCombat(){
        if (!player.getIsDead() && !enemy.getIsDead()){
            return true;
        } else {
            return false;
        }
    }
}
