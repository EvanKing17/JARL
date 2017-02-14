import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    private ArrayList<Item> items = new ArrayList<>();

    public Inventory() {
        this.items.clear();
    }

    public void addItem(Item newItem) {
        this.items.add(newItem);
    }

    public ArrayList<Item> getItemArray() {
        return this.items;
    }

    public Item getItem(int position) {
        return items.get(position);
    }

    public void accessInv(Scanner sc) {
        String choice = "";
        while (!choice.equalsIgnoreCase("Q")) {
            while (!Game.validInput(1, this.items.size(), choice)) {
                System.out.println(this.toString());
                System.out.println("\nSelect an item, or Q to go back");
                choice = sc.nextLine();
                if (choice.equalsIgnoreCase("Q")) {
                    break;
                }
            }
            if (!choice.equalsIgnoreCase("Q")) {
                this.getItem(Integer.parseInt(choice)).activate(sc);
                choice = "";
            }
        }

    }

    @Override
    public String toString() {
        String output = "";
        int position = 1;
        for (Item item : this.items) {
            output += "\n" + position + ") " + item.getName() + "\t" + item.getDescription() + "\t" + item.getEffectNumber();
            position++;
        }

        return output;
    }

}