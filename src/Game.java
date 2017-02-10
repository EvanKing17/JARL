import java.awt.print.Printable;

/**
 * Created by Evan on 2/9/2017.
 */
public class Game {

    public static void main(String[] args) {
        Character def = new Character("Evan", "Man", 100, 0, 6, 8, 10, 7);
        Blade blade = new Blade("Evan's Sword", "A sword that belongs to Evan", 1000);
        def.inv.addItem(blade);



    }


}
