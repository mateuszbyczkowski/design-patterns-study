package dekorator.rpgGame.character;

public class Paladin extends CharacterBase {
    public Paladin(String name) {
        super("Paladyn" + " " + name);
        setAttack(10f);
        setDefence(20f);
        setInventory(5f);
    }
}
