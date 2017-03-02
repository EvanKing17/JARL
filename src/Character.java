import java.util.Scanner;

public class Character {

    String name, charClass, gender;
    int health, gold, mana, stamina, dex, intel, str, cons;
    Inventory inv;
    Item eqWeapon;

    /**
     * <h1>Constructor</h1>
     * <p>Creates a new character with a given name and gender. This method should be used in conjunction with
     * the setClass() method to create a new Character.</p>
     * <p>This Class should <b>NEVER</b> be used to create anything except the main player character.</p>
     * @param name The name that the character will be referred to as
     * @param gender The gender of the character
     */
    public Character(String name, String gender) {
        this.inv = new Inventory();
        this.name = name;
        this.gender = gender;
        this.gold = 0;
        this.health = 100;
    }

    /**
     * <h1>Creates a new Character</h1>
     * <p>Returns a new character, while handling asking the player what their name, gender, and class is</p>
     * @param sc - the input scanner
     * @return
     */
    public static Character createNewChar(Scanner sc, Inventory inv) {
        String name, gender;
        System.out.println("Please enter your character's name: ");
        name = sc.nextLine();
        System.out.println("Please enter your character's gender: ");
        gender = sc.nextLine();
        Character temp = new Character(name, gender);

        //While the class selection is not acceptable, prompt continously
        String classSelection = "";
        while (!Game.validInput(1, 3, classSelection)) {
            System.out.println("What class is your character?\n1) Warrior\n2) Wizard\n3) Rogue");
            classSelection = sc.nextLine();
        }

        //Set the class according to the selection, and add items according to that class
        switch (classSelection.toLowerCase()) {
            case "1":
                temp.setClass("Warrior");
                inv.addItem(ITEMS.starterSword);
                inv.getItem(0).setEquipped(true);
                break;
            case "2":
                temp.setClass("Wizard");
                inv.addItem(ITEMS.starterStaff);
                inv.getItem(0).setEquipped(true);
                break;
            case "3":
                temp.setClass("Rogue");
                inv.addItem(ITEMS.starterDagger);
                inv.getItem(0).setEquipped(true);
                break;
        }

        //TODO: Add the items that are not class specific (potions etc)



        return temp;
    }

    /**
     * *@deprecated Instead use Character(String name, String gender), and then set the class
     * using setClass()
     * <h1>Constructor</h1>
     * <p>Creates a character by taking all of their information at creation. This is not a good way to do it, as it means you
     * have to brute force the stats. </p>
     * @param name
     * @param gender
     * @param health
     * @param mana
     * @param stamina
     * @param dex
     * @param intel
     * @param str
     * @param cons
     */
    public Character(String name, String gender, int health, int mana, int stamina, int dex, int intel, int str, int cons) {
        this.inv = new Inventory();
        this.name = name;
        this.gender = gender;
        this.health = health;
        this.gold = 0;
        this.mana = mana;
        this.stamina = stamina;
        this.dex = dex;
        this.intel = intel;
        this.str = str;
        this.cons = cons;
    }

    /**
     * <p>Set the class of the character (once the player is prompted to choose a class and makes their choice)</p>
     * @param charClass - A string representation of the character's class
     */
    public void setClass(String charClass) {
        this.charClass = charClass;
        if (this.charClass.equals("Warrior")) {
            this.dex = 8;
            this.intel = 6;
            this.str = 12;
            this.cons = 8;
        } else if (this.charClass.equals("Wizard")) {
            this.dex = 6;
            this.intel = 12;
            this.str = 4;
            this.cons = 2;
        } else if (this.charClass.equals("Rogue")) {
            this.dex = 12;
            this.intel = 8;
            this.str = 6;
            this.cons = 6;
        }
    }

    /**
     * <p>Returns a character's stats (likely to be printed to the screen)</p>
     */
    @Override
    public String toString() {
        String resultStr = "";
        resultStr += this.getName() + "\n";
        resultStr += this.getCharClass() + "\n";
        resultStr += "Dexterity: " + this.getDex() + "\n";
        resultStr += "Intelligence: " + this.getIntel() + "\n";
        resultStr += "Strength: " + this.getStr() + "\n";
        resultStr += "Constitution: " + this.getCons() + "\n";
        return resultStr;
    }


    //Getters and Setters


    public Item getEqWeapon() {
        return eqWeapon;
    }

    public void setEqWeapon(Item eqWeapon) {
        this.eqWeapon = eqWeapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getCons() {
        return cons;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }
}