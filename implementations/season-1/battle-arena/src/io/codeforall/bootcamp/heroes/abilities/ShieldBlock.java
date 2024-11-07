package io.codeforall.bootcamp.heroes.abilities;

import io.codeforall.bootcamp.heroes.Hero;

public class ShieldBlock extends AbstractAbility {

    private final int defenseBoost;
    private final int initialDuration;
    private int remainingDuration;

    public ShieldBlock(int defenseBoost, int duration, int cooldown) {
        super(cooldown, 0);
        this.defenseBoost = defenseBoost;
        this.initialDuration = duration;
        this.remainingDuration = 0;
    }

    @Override
    public void use(Hero caster, Hero target) {
        System.out.println(caster.getName() + " raises a shield, increasing defense by " + defenseBoost + " for " + initialDuration + " turns!");
        caster.setDefense(caster.getDefense() + defenseBoost);
        remainingDuration = initialDuration;
        resetCooldown();
    }

    public void updateEffect(Hero caster) {
        if (remainingDuration > 0) {
            remainingDuration--;
            if (remainingDuration == 0) {
                System.out.println(caster.getName() + "'s shield effect has worn off.");
                caster.setDefense(caster.getDefense() - defenseBoost);
            }
        }
    }

}
