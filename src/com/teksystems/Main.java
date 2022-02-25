package com.teksystems;


import com.teksystems.models.FireMonster;
import com.teksystems.models.Monster;
import com.teksystems.models.StoneMonster;
import com.teksystems.models.WaterMonster;

public class Main {

    public static void main(String[] args) {
        Monster m1 = new FireMonster("FLAMEZ"); // upcast
        Monster m2 = new WaterMonster("HYDROBLAST"); // upcast
        Monster m3 = new StoneMonster("ROCKLER");
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonster("STONEZ");
        System.out.println(m1.attack());

        Monster m4 = new Monster ("????");
        System.out.println(m4.attack());

    }
}
