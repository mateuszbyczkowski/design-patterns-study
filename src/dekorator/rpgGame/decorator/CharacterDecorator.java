package dekorator.rpgGame.decorator;

import dekorator.rpgGame.character.Character;

public abstract class CharacterDecorator implements Character {
    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    @Override
    public String getDescription() {
        return character.getDescription();
    }

    @Override
    public void setAttack(float attack) {
        if (character.getAttack() + attack <= 100) {
            character.setAttack(attack);
        }
    }

    @Override
    public void setDefence(float defence) {
        if (character.getDefence() + defence <= 100) {
            character.setDefence(defence);
        }
    }

    @Override
    public void setInventory(float inventory) {
        if (character.getInventory() + inventory <= 50) {
            character.setDefence(inventory);
        }
    }

    @Override
    public float getAttack() {
        return character.getAttack();
    }

    @Override
    public float getDefence() {
        return character.getDefence();
    }

    @Override
    public float getInventory() {
        return character.getInventory();
    }
}
