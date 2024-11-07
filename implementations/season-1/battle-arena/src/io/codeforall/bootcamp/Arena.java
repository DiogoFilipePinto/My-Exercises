package io.codeforall.bootcamp;

import io.codeforall.bootcamp.heroes.Hero;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arena {

    private List<Hero> heroes;
    private TurnManager turnManager;

    public Arena() {
        this.heroes = new ArrayList<>();
        this.turnManager = new TurnManager(heroes);
    }

    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    public void startBattle() {

        System.out.println("Battle Start!");

        while (heroesAlive()) {
            System.out.println("\n--- Turn " + turnManager.getTurnCount() + " ---");

            Collections.shuffle(heroes);

            for (Hero hero : heroes) {
                if (hero.isAlive()) {
                    Hero target = turnManager.selectTarget(hero);
                    if (target != null) {
                        hero.takeTurn(target);
                    }
                }
            }

            turnManager.updateTurn();
            displayHeroStatuses();
            turnManager.incrementTurnCount();

        }

        displayWinner();
    }

    private boolean heroesAlive() {
        int aliveCount = 0;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                aliveCount++;
            }
        }
        return aliveCount > 1;
    }

    private void displayHeroStatuses() {
        System.out.println("\n-- Hero Statuses --");
        for (Hero hero : heroes) {
            System.out.println(hero.getName() + ": Health = " + hero.getHealth() + ", Mana = " + hero.getMana());
        }
    }

    private void displayWinner() {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                System.out.println(hero.getName() + " is the winner!");
                return;
            }
        }
    }
}
