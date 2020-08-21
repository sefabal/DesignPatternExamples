package ceng.anadolu.bim492.baseClasses;

public class Skill {
    private String name;
    private double damage;


    public Skill(String name,double damage){
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }
}
