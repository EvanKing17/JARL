import java.util.Scanner;

/**
 * Created by Evan on 2/9/2017.
 */
public class Staff extends Item {

    private int attack;
    private boolean isEquipped;

    public Staff(String name, String description, int attack) {
        this.setName(name);
        this.setDescription(description);
        this.attack = attack;
        this.setType("STAFF");
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
            Item old = Game.player.getEqWeapon();
            old.setEquipped(false);
            Game.player.setEqWeapon(this);
            this.setEquipped(true);
            System.out.println("You equip the " + this.getName() + ".");
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public boolean isEquipped() {
        return isEquipped;
    }

    @Override
    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }
}
