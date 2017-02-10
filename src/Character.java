/**
 * Created by Evan on 2/9/2017.
 */
public class Character {

    String name, charClass, gender;
    int health, mana, stamina, dex, intel, str, cons;
    Inventory inv;

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
    }

    /**
     * <h1>Constructor</h1>
     * <p>Creates a character by taking all of their information at creation. This is not a good way to do it, as it means you
     * have to brute force the stats. Instead use the Character constructor that takes two strings and then set the class
     * using setClass()</p>
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
        this.mana = mana;
        this.stamina = stamina;
        this.dex = dex;
        this.intel = intel;
        this.str = str;
        this.cons = cons;
    }

    /**
     * Set the class of the character (once the player is prompted to choose a class and makes their choice
     * @param charClass - A string representation of the character's class
     */
    public void setClass(String charClass) {
        this.charClass = charClass;
        if (this.charClass.equals("Warrior")) {
            //set the stats for the warrior
        } else if (this.charClass.equals("Wizard")) {
            //set the stats for wizard
        } else if (this.charClass.equals("Rogue")) {
            //set the stats for rogue
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