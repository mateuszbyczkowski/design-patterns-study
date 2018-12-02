package dekorator.rpgGame.decorator;

import dekorator.rpgGame.character.Character;
import dekorator.rpgGame.decorator.weapons.Weapon;

public class AttackDecorator extends CharacterDecorator {

    private Weapon weapon;

    public AttackDecorator(Character character, Weapon weapon) {
        super(character);
        this.weapon = weapon;
        setAttack(character.getAttack() + weapon.getAttack());
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " " + "with " + weapon.getName();
    }
}
