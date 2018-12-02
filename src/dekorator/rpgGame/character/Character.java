package dekorator.rpgGame.character;

public interface Character {
    String getDescription();

    void setAttack(float attack);

    float getAttack();

    void setDefence(float defence);

    float getDefence();

    void setInventory(float inventory);

    float getInventory();
}
