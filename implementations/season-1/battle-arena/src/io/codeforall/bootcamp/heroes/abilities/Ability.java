package io.codeforall.bootcamp.heroes.abilities;

import io.codeforall.bootcamp.heroes.Hero;

public interface Ability {

    void use(Hero caster, Hero target);
    int getCooldown();
    void resetCooldown();
    void reduceCooldown();
    boolean isAvailable();
    int getManaCost();

}
