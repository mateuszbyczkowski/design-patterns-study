package dekorator.rpgGame.decorator;

import dekorator.rpgGame.character.Character;
import dekorator.rpgGame.decorator.armor.Armor;

public class DefenceDecorator extends CharacterDecorator {
    Armor armor;

    public DefenceDecorator(Character character, Armor armor) {
        super(character);
        this.armor = armor;
        setDefence(character.getDefence() + armor.getDefence());
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " " + "with " + armor.getName();
    }
}
