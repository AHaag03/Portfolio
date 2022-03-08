package adventure_game;

import java.util.Scanner;

public class Game {
    static Scanner console = new Scanner(System.in);

    public static void round(int round, Character hero, Character enemy) {
        System.out.format("\nRound %d\n", round);
        System.out.format("A %s approaches!\n", enemy);

        while(true) {
            hero.attack(enemy);
            System.out.format("You deal %d damage to the %s!\n", hero.getAttackPower(), enemy);
            System.out.format("The %s has %d health left!\n", enemy, enemy.getHealth());

            enemy.attack(hero);
            System.out.format("The %s deals %d damage to you!\n", enemy, enemy.getAttackPower());
            System.out.format("You have %d health left!\n", hero.getHealth());

            System.out.println();

            if(!hero.isAlive()) {
                System.out.println("You are dead!");
                break;
            } else if(!enemy.isAlive()) {
                if(round == 10) {
                    System.out.println("You won the game!");
                }
                else {
                    System.out.println("You won this round.");
                }
                break;
            }
        }
    }

    public static Character choice(int choice) {
        if(choice == 1) {
            return new Knight();
        }
        else if(choice == 2) {
            return new Mage();
        }
        else {
            return new Thief();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to The Dungeon!");
        System.out.println("Choose your class:");
        System.out.println("1. A valiant knight in search of glory.");
        System.out.println("2. A cunning mage looking to research the mysterious dungeon.");
        System.out.println("3. A tricky thief looking to prove his skills.");
        System.out.print("Choose: ");

        int choice = console.nextInt();
        if(!(choice == 1 || choice == 2 || choice == 3)) {
            System.out.print("Invalid choice, please enter again: ");
            choice = console.nextInt();
        }
        Character hero = choice(choice);
        System.out.format("You chose to be a %s.\n", hero);
        System.out.println("You enter the dungeon.");

        //round 1
        Character enemy = new Zombie();
        round(1, hero, enemy);
        hero.heal();


        //round 2
        enemy = new Skeleton();
        round(2, hero, enemy);
        hero.heal();
    }
}
