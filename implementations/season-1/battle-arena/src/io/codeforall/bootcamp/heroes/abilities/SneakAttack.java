package io.codeforall.bootcamp.heroes.abilities;

import io.codeforall.bootcamp.heroes.Hero;

public class SneakAttack extends AbstractAbility {

    private final int criticalDamage;

    public SneakAttack(int criticalDamage, int cooldown) {
        super(cooldown, 0);
        this.criticalDamage = criticalDamage;
    }

    @Override
    public void use(Hero caster, Hero target) {
        System.out.println(caster.getName() + " performs Sneak Attack on " + target.getName() + ", dealing " + criticalDamage + " critical damage!");
        target.takeDamage(criticalDamage);
        resetCooldown();
    }

}
