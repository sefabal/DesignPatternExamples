package ceng.anadolu.bim492.attackStrategies;

import ceng.anadolu.bim492.baseClasses.Player;

public class PunchAttack implements AttackStrategy {

    //This is the default attack for player. It's damage 1.
    @Override
    public double attack(Player player) {
        System.out.println(player.getPlayerName() +" attacked to enemy with punch and damage = 1");
        return 1;
    }
}
