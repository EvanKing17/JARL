/**
 * Created by Evan on 2/9/2017.
 */
public class Staff extends Item {

    private int attack;

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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
