package io.codeforall.bootcamp.heroes.abilities;

import io.codeforall.bootcamp.heroes.Hero;

public class Fireball extends AbstractAbility {

    private final int damage;

    public Fireball(int damage, int manaCost, int cooldown) {
        super(cooldown, manaCost);
        this.damage = damage;
    }

    @Override
    public void use(Hero caster, Hero target) {
        System.out.println(caster.getName() + " casts Fireball at " + target.getName() + ", dealing " + damage + " damage!");
        target.takeDamage(damage);
        caster.setMana(caster.getMana() - manaCost);
        resetCooldown();
    }

}
