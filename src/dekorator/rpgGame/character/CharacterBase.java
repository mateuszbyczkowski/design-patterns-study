package dekorator.rpgGame.character;

public class CharacterBase implements Character {
    protected String name;
    protected float attack;
    protected float defence;
    protected float inventory;

    public CharacterBase(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name + " Attack: " + attack + " Defence: " + defence + " Inventory: " + inventory;
    }

    @Override
    public void setAttack(float attack) {
        this.attack = attack;
    }

    @Override
    public float getAttack() {
        return attack;
    }

    @Override
    public void setDefence(float defence) {
        this.defence = defence;
    }

    @Override
    public float getDefence() {
        return defence;
    }

    @Override
    public void setInventory(float inventory) {
        this.inventory = inventory;
    }

    @Override
    public float getInventory() {
        return inventory;
    }
}
