package io.codeforall.bootcamp.heroes.abilities;

public abstract class AbstractAbility implements Ability {

    private final int initialCooldown;
    private int currentCooldown;
    protected final int manaCost;

    public AbstractAbility( int cooldown, int manaCost) {
        this.initialCooldown = cooldown;
        this.currentCooldown = 0;
        this.manaCost = manaCost;
    }

    @Override
    public int getManaCost() {
        return this.manaCost;
    }

    @Override
    public int getCooldown() {
        return currentCooldown;
    }

    @Override
    public void resetCooldown() {
        this.currentCooldown = initialCooldown;
    }

    @Override
    public void reduceCooldown() {
        if (currentCooldown > 0) {
            currentCooldown--;
        }
    }

    @Override
    public boolean isAvailable() {
        return currentCooldown == 0;
    }
}
