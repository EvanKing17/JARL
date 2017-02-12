/**
 * Created by Evan on 2/9/2017.
 */
public class Item {

    private String type, name, description;

    public String getType() {
        return type;
    }

    public int getEffectNumber() {
        if (this.getType().equals("BLADE")) {
            Blade blade = (Blade) this;
            return blade.getAttack();
        }
        return 0;
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