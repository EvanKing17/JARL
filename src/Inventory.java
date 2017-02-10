import java.util.ArrayList;

/**
 * Created by Evan on 2/9/2017.
 */
public class Inventory {


    private ArrayList<Item> items = new ArrayList<>();

    public Inventory() {
        this.items.clear();
    }

    public void addItem(Item newItem) {
        this.items.add(newItem);
    }

    public ArrayList<Item> getItemArray() {
        return this.items;
    }

    public Item getItem(int position) {
        return items.get(position);
    }

}