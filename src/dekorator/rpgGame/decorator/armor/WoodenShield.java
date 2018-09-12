package dekorator.rpgGame.decorator.armor;

public class WoodenShield implements Armor {
    @Override
    public String getName() {
        return "Wooden shield";
    }

    @Override
    public float getDefence() {
        return 15.0f;
    }
}
