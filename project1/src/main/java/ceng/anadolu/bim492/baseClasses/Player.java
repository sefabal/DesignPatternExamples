package ceng.anadolu.bim492.baseClasses;

import ceng.anadolu.bim492.attackStrategies.AttackStrategy;
import ceng.anadolu.bim492.attackStrategies.PunchAttack;

import java.util.ArrayList;

public class Player {
    private String playerName;


    private AttackStrategy attackStrategy;
    private ArrayList<AttackItem> attackItems;
    private AttackItem attackItem;
    private Skill skill;

    public Player(String playerName) {
        this.playerName = playerName;
        this.attackStrategy = new PunchAttack();
        this.attackItems = new ArrayList<>();
    }

    public double attack() {

        return attackStrategy.attack(this);
    }

    public void setAttackItem(AttackItem item) {
        if (attackItems.contains(item)) {
            System.out.println(this.getPlayerName() + " has a " + item.getItemName() + " for attack.");
            this.attackItem = item;
        } else
            System.err.println("This player does not have that attack item.");
    }

    public void addAttackItem(AttackItem item) {

        attackItems.add(item);

        System.out.println(item.getItemName() + " added to " + this.getPlayerName() + "'s attackItems.");
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
        System.out.println(this.getPlayerName() + "'s skill setted to " + this.skill.getName());
    }

    public Skill getSkill() {
        if (this.skill != null)
            return this.skill;
        else {
            System.err.println(this.getPlayerName() +" does not have any skill ability.");
            return null;
        }
    }

    public AttackItem getAttackItem() {
        return this.attackItem;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }


}
