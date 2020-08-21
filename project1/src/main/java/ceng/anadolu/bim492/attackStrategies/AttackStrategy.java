package ceng.anadolu.bim492.attackStrategies;

import ceng.anadolu.bim492.baseClasses.Player;

/*
//This interface define a general strategy for attacking to enemy.
//It takes player paramer attack(Player player) method for checking players ability or items.
*/
public interface AttackStrategy {
    public double attack(Player player);

}
