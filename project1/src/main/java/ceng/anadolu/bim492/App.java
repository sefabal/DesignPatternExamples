package ceng.anadolu.bim492;

import ceng.anadolu.bim492.attackStrategies.ItemAttack;
import ceng.anadolu.bim492.attackStrategies.SkillAttack;
import ceng.anadolu.bim492.baseClasses.AttackItem;
import ceng.anadolu.bim492.baseClasses.Player;
import ceng.anadolu.bim492.baseClasses.Skill;

public class App {
    public static void main(String[] args) {
        Player player = new Player("Sefa");
        Player player2 = new Player("Ethan");

        AttackItem gun = new AttackItem("Gun",15);
        AttackItem sword = new AttackItem("Sword",35);

        Skill fireball = new Skill("Fireball",50);
        Skill snowball = new Skill("Snowball",80);

        player.addAttackItem(gun);
        player.addAttackItem(sword);

        player.setAttackStrategy(new ItemAttack());
        System.out.println("---------------");
        player.setAttackItem(sword);
        player.attack();

        System.out.println("--------------");

        player.setAttackItem(gun);
        player.attack();

        System.out.println("-----------------");

        player.setAttackStrategy(new SkillAttack());
        player.setSkill(fireball);
        player.attack();

        System.out.println("---------------");

        player2.attack();

        System.out.println("-----------");

        player2.setAttackStrategy(new SkillAttack());
        player2.attack();

        System.out.println("--------------");

        player2.setSkill(snowball);
        player2.attack();

    }
}
