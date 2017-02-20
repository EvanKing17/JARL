import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ITEMS {

    public static final Blade starterSword = new Blade("Basic Sword", "A very basic sword.", 10);
    public static final Staff starterStaff = new Staff("Basic Staff", "A very basic staff.", 10);
    public static final Dagger starterDagger = new Dagger("Basic Dagger", "A very basic dagger.", 10);

    public static final String[] swordNames = {"Blunt Sword", "Lixraika Cutlass", "The Supreme Trident"};
    public static final String[] swordDescs = {"a near useless blade", "The blade prefered by sailors from the Viryan Coast", "It's the best trident, everybody knows it"};

    public static final String[] daggerNames = {"Saladian Dagger", "dagger 2", "dagger3"};
    public static final String[] daggerDescs = {"A blade forged in Waldorf, Saladia", "A second cool dagger", "Third and final dagger"};

    public static final String[] staffDescs = {"The staff of the Legendary Wizard Kossis", "A second cool Staff", "Third and final Staff"};
    public static final String[] staffNames = {"Staff of Kossis", "Staff 2", "Staff3"};


    public static Blade generateSword() {
        int value = ThreadLocalRandom.current().nextInt(0, swordNames.length);
        int attack = ThreadLocalRandom.current().nextInt(Game.player.health / 20, Game.player.health / 10);
        return new Blade(swordNames[value], swordDescs[value], attack);
    }

    public static Dagger generateDagger() {
        int value = ThreadLocalRandom.current().nextInt(0, swordNames.length);
        int attack = ThreadLocalRandom.current().nextInt(Game.player.health / 20, Game.player.health / 10);
        return new Dagger(daggerNames[value], daggerDescs[value], attack);
    }

    public static Staff generateStaff() {
        int value = ThreadLocalRandom.current().nextInt(0, swordNames.length);
        int attack = ThreadLocalRandom.current().nextInt(Game.player.health / 15, Game.player.health / 6);
        return new Staff(staffNames[value], staffDescs[value], attack);
    }

}
