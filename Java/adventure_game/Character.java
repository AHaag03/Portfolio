package adventure_game;

public class Character {
    private int health;
    private int attackPower;

    public Character(int health, int attackPower) {
        this.health = health;
        this.attackPower = attackPower;
    }

    public int getHealth() {
        if(this.health <= 0) {
            return 0;
        }
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void attack(Character enemy) {
        enemy.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }
}