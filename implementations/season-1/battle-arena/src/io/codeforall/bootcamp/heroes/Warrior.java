package io.codeforall.bootcamp.heroes;

import io.codeforall.bootcamp.heroes.abilities.Ability;

public class Warrior extends Hero {

    public Warrior(String name, Ability ability) {
        super(name, 200, 50, 10, 15, ability);
    }

}
