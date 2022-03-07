package adventure_game;

abstract class Character {
    private int health;
    private final int attackPower;
    private int stamina;
    private final int magicPower;
    private final int defense;

    public Character(int health, int attackPower, int stamina, int magicPower, int defense) {
        this.health = health;
        this.attackPower = attackPower;
        this.stamina = stamina;
        this.magicPower = magicPower;
        this.defense = defense;
    }

    public int getHealth() {
        if(health < 0) {
            return 0;
        }
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getDefense() {
        return defense;
    }

    public void updateStamina(int stamina) {
        this.stamina -= stamina;
    }

    public void attack(Character other) {
        other.takeDamage(this.getAttackPower());
    }

    public void takeDamage(int damage) {
        this.health -= Math.abs(damage - defense);
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}