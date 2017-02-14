
public class Dagger extends Item {

    private int attack;

    public Dagger(String name, String description, int attack) {
        this.setName(name);
        this.setDescription(description);
        this.attack = attack;
        this.setType("DAGGER");
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
