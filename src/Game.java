import java.awt.print.Printable;
import java.util.Scanner;

/**
 * Created by Evan on 2/9/2017.
 */
public class Game {

    public static void main(String[] args) {

        //Create the default console scanner
        Scanner sc = new Scanner(System.in);

        //New inventory to hold the player's items
        Inventory inv = new Inventory();

        //Prompts the player to create their character
        Character player = Character.createNewChar(sc, inv);



    }
}