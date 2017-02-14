import java.util.Scanner;


public class Game {

    public static void main(String[] args) {

        //Create the default console scanner
        Scanner sc = new Scanner(System.in);

        //New inventory to hold the player's items
        Inventory inv = new Inventory();

        //Prompts the player to create their character
        Character player = Character.createNewChar(sc, inv);

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