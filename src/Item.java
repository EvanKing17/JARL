import java.util.Scanner;

public class Item {

    private String type, name, description;
    private boolean isEquipped;

    public String getType() {
        return type;
    }

    public String getEffectNumber() {
        //Return the relevant stat for the inventory to display. For example, weapons show their attack, and health potions the amount of health they restore
        //Each item type MUST override this to display stats properly in the inventory.
        return "";
    }

    public void activate(Scanner sc) {
        //MUST be overridden in each item in order to activate that item from the inventory. Otherwise it will never be selectable.
    }

    //MUST OVERRIDE FOR ITEMS THAT ARE EQUIPPABLE
    public boolean isEquipped() {
        return false;
    }

    public void setEquipped(boolean equipped) {
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}