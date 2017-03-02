import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ITEMS {

    public static final Blade starterSword = new Blade("Basic Sword", "A very basic sword.", 10);
    public static final Staff starterStaff = new Staff("Basic Staff", "A very basic staff.", 10);
    public static final Dagger starterDagger = new Dagger("Basic Dagger", "A very basic dagger.", 10);

    public static final String[] swordNames = {"Sword 1", "Sword 2", "Sword3"};
    public static final String[] swordDescs = {"A cool sword", "A second cool sword", "Third and final sword"};

    public static final String[] daggerNames = {"dagger 1", "dagger 2", "dagger3"};
    public static final String[] daggerDescs = {"A cool dagger", "A second cool dagger", "Third and final dagger"};

    public static final String[] staffDescs = {"A cool Staff", "A second cool Staff", "Third and final Staff"};
    public static final String[] staffNames = {"Staff 1", "Staff 2", "Staff3"};


    public static Blade generateSword() {
        int value = ThreadLocalRandom.current().nextInt(0, swordNames.length);
        int attack = ThreadLocalRandom.current().nextInt(Game.player.health / 15, Game.player.health / 10);
        return new Blade(swordNames[value], swordDescs[value], attack);
    }

    public static Dagger generateDagger() {
        int value = ThreadLocalRandom.current().nextInt(0, swordNames.length);
        int attack = ThreadLocalRandom.current().nextInt(Game.player.health / 15, Game.player.health / 10);
        return new Dagger(daggerNames[value], daggerDescs[value], attack);
    }

    public static Staff generateStaff() {
        int value = ThreadLocalRandom.current().nextInt(0, swordNames.length);
        int attack = ThreadLocalRandom.current().nextInt(Game.player.health / 15, Game.player.health / 6);
        return new Staff(staffNames[value], staffDescs[value], attack);
    }

}
