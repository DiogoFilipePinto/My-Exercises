package io.codeforall.bootcamp.heroes;

import io.codeforall.bootcamp.heroes.abilities.Ability;
import io.codeforall.bootcamp.heroes.abilities.ShieldBlock;

public abstract class Hero {

    private final String name;
    private int health;
    private int mana;
    private final int attackPower;
    private int defense;
    private final Ability ability;

    public Hero(String name, int health, int mana, int attackPower, int defense, Ability ability) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.attackPower = attackPower;
        this.defense = defense;
        this.ability = ability;
    }

    public void takeDamage(int damage) {
        int actualDamage = Math.max(0, damage - defense);
        this.health -= actualDamage;
        System.out.println(name + " takes " + actualDamage + " damage. Health now: " + health);
    }

    public void takeTurn(Hero target) {
        if (this.ability.isAvailable() && this.getMana() > ability.getManaCost()) {
            useAbility(target);
            return;
        }
        attack(target);
    }

    public void attack(Hero target) {
        System.out.println(name + " attacks " + target.getName());
        target.takeDamage(attackPower);
    }

    private void useAbility(Hero target) {
        this.ability.use(this, target);
    }

    public void updateCooldowns() {
        this.ability.reduceCooldown();
    }

    public void updateEffects() {
        if (ability instanceof ShieldBlock shieldBlock) {
            shieldBlock.updateEffect(this);
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getDefense() {
        return defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

}
