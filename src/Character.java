/**
 * Created by Evan on 2/9/2017.
 */
public class Character {

    String name, charClass, gender;
    int health, mana, dex, intel, str, cons;
    Inventory inv;

    public Character(String name, String gender, int health, int mana, int dex, int intel, int str, int cons) {
        this.inv = new Inventory();
        this.name = name;
        this.gender = gender;
        this.health = health;
        this.mana = mana;
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