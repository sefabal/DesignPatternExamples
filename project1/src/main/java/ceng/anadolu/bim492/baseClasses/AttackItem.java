package ceng.anadolu.bim492.baseClasses;

import ceng.anadolu.bim492.baseClasses.Item;

public class AttackItem extends Item {
    private double damage;

    public AttackItem(String itemName,double damage) {
        super(itemName);
        this.damage = damage;
    }

    public double getDamage(){
        return this.damage;
    }
}
