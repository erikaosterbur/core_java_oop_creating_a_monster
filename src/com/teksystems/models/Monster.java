package com.teksystems.models;

public class Monster {
    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}