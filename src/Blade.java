import java.util.Scanner;

public class Blade extends Item {

    private int attack;

    public Blade(String name, String description, int attack) {
        this.setName(name);
        this.setDescription(description);
        this.attack = attack;
        this.setType("BLADE");
    }

    @Override
    public String getEffectNumber() {
        return this.getAttack() + " ATK";
    }

    @Override
    public void activate(Scanner sc) {
        String choice = "";
        while (!Game.validInput(1, 2, choice)) {
            System.out.println("\nWould you like to equip " + this.getName() + "?");
            System.out.println("1) Yes\t2) No");
            choice = sc.nextLine();
        }
        if (choice.equals("1")) {
            System.out.println("\nEQUIP THE SWORD");
        } else {
            System.out.println("\nDON'T EQUIP THE SWORD");
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
