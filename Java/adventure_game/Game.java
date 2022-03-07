package adventure_game;

public class Game {
    public static void round(int round, Character hero, Character enemy) {
        System.out.format("Round %d\n", round);
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

    public static void main(String[] args) {
        Character hero = new Warrior();
        Character enemy;

        //round 1
        enemy = new Zombie();
        round(1, hero, enemy);

        //round 2
        enemy = new Skeleton();
        round(2, hero, enemy);
    }
}
