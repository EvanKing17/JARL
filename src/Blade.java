/**
 * Created by Evan on 2/9/2017.
 */
public class Blade extends Item {

    private int attack;

    public Blade(String name, String description, int attack) {
        this.setName(name);
        this.setDescription(description);
        this.attack = attack;
        this.setType("BLADE");
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
