package io.codeforall.bootcamp.heroes.abilities;

import io.codeforall.bootcamp.heroes.Hero;

public class Heal extends AbstractAbility {

    private final int healingAmount;

    public Heal(int healingAmount, int manaCost, int cooldown) {
        super(cooldown, manaCost);
        this.healingAmount = healingAmount;
    }

    @Override
    public void use(Hero caster, Hero target) {
        System.out.println(caster.getName() + " heals herself for " + healingAmount + " health.");
        caster.setHealth(target.getHealth() + healingAmount);
        caster.setMana(caster.getMana() - manaCost);
        resetCooldown();
    }

}
