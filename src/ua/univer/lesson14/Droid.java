package ua.univer.lesson14;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Droid implements Serializable {
    public static String armyName;
    private String name;
    private int move;
    private double health;
    private transient List<String> weapons;

    public Droid() {
        this("Anonim", 1, 1);
    }

    public Droid(String name, int move, double health) {
        this.name = name;
        this.move = move;
        this.health = health;
        this.weapons = new ArrayList<>();
        this.weapons.add("Gun");
        this.weapons.add("Shield");
    }
    public void addWeapon(String weapon){
        this.weapons.add(weapon);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String toCSVString(){
        return  name + ';' +
                move + ';' +
                health;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", move=" + move +
                ", health=" + health +
                ", weapons=" + weapons +
                ", armyName=" + armyName +
                '}';
    }
}
