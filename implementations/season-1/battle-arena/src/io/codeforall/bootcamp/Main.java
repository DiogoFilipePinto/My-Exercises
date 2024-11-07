package io.codeforall.bootcamp;

import io.codeforall.bootcamp.heroes.*;
import io.codeforall.bootcamp.heroes.abilities.Fireball;
import io.codeforall.bootcamp.heroes.abilities.Heal;
import io.codeforall.bootcamp.heroes.abilities.ShieldBlock;
import io.codeforall.bootcamp.heroes.abilities.SneakAttack;

public class Main {

    public static void main(String[] args) {

        Hero mage = new Mage("Gandalf", new Fireball(75, 35, 3));
        Hero rogue = new Rogue("Shadow", new SneakAttack(40, 2));
        Hero warrior = new Warrior("Thor", new ShieldBlock(20, 2, 4));
        Hero cleric = new Cleric("Mercy", new Heal(50, 30, 2));

        Arena arena = new Arena();
        arena.addHero(mage);
        arena.addHero(rogue);
        arena.addHero(warrior);
        arena.addHero(cleric);

        // Start the battle
        arena.startBattle();
    }
}
