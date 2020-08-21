package ceng.anadolu.bim492.attackStrategies;

import ceng.anadolu.bim492.baseClasses.Player;
import ceng.anadolu.bim492.baseClasses.Skill;

public class SkillAttack implements AttackStrategy {
    @Override
    public double attack(Player player) {
        Skill selectedSkill = player.getSkill();
        if (selectedSkill != null) {
            System.out.println(player.getPlayerName() + " attacked to enemy with skill " + selectedSkill.getName() + " and damage = " + selectedSkill.getDamage());
            return player.getSkill().getDamage();
        }
        else return 0;

    }
}
