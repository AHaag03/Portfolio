package adventure_game;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Character hero = new Character(100, 10);
        Random rand = new Random();
        int round = 1;

        while(true) {
            System.out.println("An enemy approaches!");
            System.out.format("Round %d\n", round);
            Character enemy = new Character(rand.nextInt(100), rand.nextInt(10));

            hero.attack(enemy);
            System.out.format("You deal %d damage to the enemy!\n", hero.getAttackPower());
            System.out.format("The enemy has %d health left!\n", enemy.getHealth());

            enemy.attack(hero);
            System.out.format("The enemy deals %d damage to you!\n", enemy.getAttackPower());
            System.out.format("You have %d health left!\n", hero.getHealth());

            System.out.println();

            if(!hero.isAlive()) {
                System.out.println("You are dead!");
                break;
            }
            else if(!enemy.isAlive()) {
                System.out.println("You win!");
                break;
            }
            round++;
        }
    }
}
