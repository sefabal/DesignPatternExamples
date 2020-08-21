package ceng.anadolu.bim492.attackStrategies;

import ceng.anadolu.bim492.baseClasses.AttackItem;
import ceng.anadolu.bim492.baseClasses.Player;

public class ItemAttack implements AttackStrategy {
    @Override
    public double attack(Player player) {
        AttackItem attackItem = player.getAttackItem();
        if (attackItem != null) {
            System.out.println(player.getPlayerName() +" attacked to enemy and damage = " + attackItem.getDamage());
            return attackItem.getDamage();
        }else
            return 0;
    }
}
