package com.estudiopoo;

public abstract class Item {
    //Variables
    public String id;
    public String name;
    public int value;
    
    //Constructor
    public Item(String id, String name, int value){
        this.id = id;
        this.name = name;
        this.value = value;
    }

    //Getters
    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }

    public String getId(){
        return id;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setValue(int value){
        if (value >= 0){
            this.value = value;
        } else{
            System.out.println("The item's value can't be lower than 0");
        }
    }

    public abstract void use();
}

