package dekorator.rpgGame.decorator.weapons;

public class Sword implements Weapon {
    @Override
    public String getName() {
        return "Powerful Sword!";
    }

    @Override
    public float getAttack() {
        return 30.0f;
    }
}
