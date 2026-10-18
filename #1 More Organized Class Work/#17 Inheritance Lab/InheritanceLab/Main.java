/**
 * @author James McGuigan
 * CS 5210 Programming 2
 * Prof.B
 */
public class Main {
    public static void main(String[] args) {
        Ryu player1 = new Ryu();
        Ken player2 = new Ken();

        System.out.println("Player 1 ID: " + player1.getIdNumber());
        System.out.println("Player 2 ID: " + player2.getIdNumber());

        System.out.println("\nRyu equals Ken by ID: " + player1.equalsById(player2));
        System.out.println("Ken equals Ken by ID: " + player2.equalsById(player2));

        System.out.println("\nKen equals Ryu by Health: " + player1.equalsByHealth(player2));

        System.out.println("\nPlayer 1: Health: " + player1.getCurrentHealth());
        System.out.println("Player 2: Health: " + player2.getCurrentHealth());
        player1.takeDamage(30);
        System.out.println("\nPlayer 1: Health after taking damage: " + player1.getCurrentHealth());
        player2.takeDamage(40);
        System.out.println("\nPlayer 2: Health after taking damage: " + player2.getCurrentHealth());
        player2.heal(20);
        System.out.println("Player 2: Health after healing: " + player2.getCurrentHealth());

        System.out.println("\nPlayer 1: is dead: " + player1.isDead());
        System.out.println("Player 2: is dead: " + player2.isDead());

        if (player1.isDead()) {
            System.out.println("\nPlayer 1, you win!");
        }

        if (player2.isDead()) {
            System.out.println("\nPlayer 2, you lose!");
        }

        System.out.println("\nPlayer 2: Health before Hadouken: " + player2.getCurrentHealth());
        Ryu ryu = new Ryu();
        ryu.hadouken(player2);
        System.out.println("Player 2: Health after Hadouken: " + player2.getCurrentHealth());
        System.out.println("\nPlayer 2: is dead: " + player2.isDead());

        System.out.println("\nPlayer 1: Health before Jinrai Kick: " + player1.getCurrentHealth());
        Ken ken = new Ken();
        ken.jinraikick(player1);
        System.out.println("Player 1: Health after Jinrai Kick: " + player1.getCurrentHealth());
        player1.takeDamage(35);
        System.out.println("\nPlayer 1: Health after attack: " + player1.getCurrentHealth());
        System.out.println("\nPlayer 1: is dead: " + player1.isDead());

        if (player1.isDead()) {
            System.out.println("\nRyu Wins!");
        }   
        if (player2.isDead()) {
            System.out.println("\nKen Wins!");
        }

    }
}