package io.codeforall.bootcamp;

import io.codeforall.bootcamp.heroes.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TurnManager {

    private List<Hero> heroes;
    private int turnCount;

    public TurnManager(List<Hero> heroes) {
        this.heroes = heroes;
        this.turnCount = 1;
    }

    public Hero selectTarget(Hero attacker) {
        List<Hero> possibleTargets = new ArrayList<>();
        for (Hero hero : heroes) {
            if (hero != attacker && hero.isAlive()) {
                possibleTargets.add(hero);
            }
        }

        if (possibleTargets.isEmpty()) {
            return null;
        }

        return possibleTargets.get(new Random().nextInt(possibleTargets.size()));
    }

    public void updateTurn() {
        for (Hero hero : heroes) {
            hero.updateCooldowns();
            hero.updateEffects();
        }
    }

    public int getTurnCount() {
        return turnCount;
    }

    public void incrementTurnCount() {
        this.turnCount++;
    }
}
