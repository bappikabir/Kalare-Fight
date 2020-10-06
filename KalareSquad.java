package nswitchois;

import java.util.Random;
import java.util.Scanner;

public class KalareSquad {

    public static void main(String[] args) {

        String strike;

        PlayerOne p1 = new PlayerOne();
        int p1StoredlifeSpan = p1.lifespan;

        PlayerTwo p2 = new PlayerTwo();
        int p2StoredlifeSpan = p2.lifespan;

        Scanner scanner = new Scanner(System.in);
        String starStar = "*************************************";
        System.out.println(starStar);
        System.out.println("player1 HandTools: Cutlass and Axe \n player2 Throwables: Spear and Arrow");
        System.out.println(starStar);

        while (true) {
            System.out.println("Player1 or player2 should strike: ");
            strike = scanner.next();
            if (!strike.equals("Cutlass") && !strike.equals("Axe") && !strike.equals("Spear") && !strike.equals("Arrow")) {
                System.out.println("System no gree, use correct fighting tools wey dey dia");
                continue;
            }

            if (strike.equals("Cutlass")) {
                p1StoredlifeSpan = p1StoredlifeSpan - 3;
                System.out.println("him don knack u " + strike + " -3 lives");
                System.out.println(starStar);
            } else if (strike.equals("Spear")) {
                p1StoredlifeSpan = p1StoredlifeSpan - 4;
                System.out.println("him don knack u " + strike + " -4 lives");
                System.out.println(starStar);
            } else if (strike.equals("Axe")) {
                p2StoredlifeSpan = p2StoredlifeSpan - 3;
                System.out.println("na " + strike + " him knack u ohhhh! 3 don go");
                System.out.println(starStar);
            } else if (strike.equals("Arrow")) {
                p2StoredlifeSpan = p2StoredlifeSpan - 2;
                System.out.println("u no wan dodge" + strike + "bah, na 2 lives!!!");
                System.out.println(starStar);
            }

            System.out.println("player1:" + p1StoredlifeSpan + " XXX  player2: " + p2StoredlifeSpan);

            if (p1StoredlifeSpan <= 0) {
                System.out.println("Player 2 knack P1");
                break;
            } else if (p2StoredlifeSpan <= 0) {
                System.out.println("Player 1 finish P2");
                break;
            }

        }
    }
}

class Game {

    int lifespan = 10;

    void showPlayers() {
        System.out.println("PlayerOne Vs PlayerTwo");
    }
}

class PlayerOne extends Game {

    String Cutlass = "Cutlass";
    String Axe = "Axe";

    void showWeapon() {
        System.out.println("Striking with a HandTools");
    }
}

class PlayerTwo extends Game {

    String Spear = "Spear";
    String Arrow = "Arrow";

    void showWeapon() {
        System.out.println("Striking with an Throwable");
    }

    void randomGen() {
        String rand = new Random().nextBoolean() ? Spear : Arrow;
        System.out.println(rand);
    }
}
