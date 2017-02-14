import java.util.Scanner;


public class Game {

    public static Character player;

    public static void main(String[] args) {

        //Create the default console scanner
        Scanner sc = new Scanner(System.in);

        //New inventory to hold the player's items
        Inventory inv = new Inventory();

        //Prompts the player to create their character
        //player = Character.createNewChar(sc, inv);
        //player.setEqWeapon(inv.getItem(0));

        //Skip character creation for testing
        player = new Character("Evan", "Male", 100, 100, 100, 8, 6, 12, 8);
        player.setClass("Warrior");
        inv.addItem(ITEMS.starterSword);
        inv.getItem(0).setEquipped(true);
        player.setEqWeapon(inv.getItem(0));
        inv.addItem(ITEMS.starterDagger);
        inv.addItem(ITEMS.generateSword());
        inv.addItem(ITEMS.generateDagger());
        inv.addItem(ITEMS.generateStaff());

        System.out.println(player.toString());
        inv.accessInv(sc);


    }








    //Helper Functions

    /**
     * <h1>Input Validator</h1>
     * <p>Checks if the input is between the maximum and minimum allowed values.</p>
     * <p>This just makes writing and reading the multiple choice validation statements a bit more elegant.</p>
     * @param lowerInt the bottom number of the range (inclusive)
     * @param upperInt the upper number of the range (inclusive)
     * @param checkedStr the number that is being checked
     * @return true if the checked value falls between the minimum and maximum, and false otherwise
     */
    public static boolean validInput(int lowerInt, int upperInt, String checkedStr) {
        int checkedInt;
        try {
            checkedInt = Integer.parseInt(checkedStr);
            return ((checkedInt >= lowerInt) && (checkedInt <= upperInt));
        } catch (NumberFormatException e) {
            return false;
        }
    }

}