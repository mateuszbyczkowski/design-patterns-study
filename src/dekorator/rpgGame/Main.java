package dekorator.rpgGame;

import dekorator.rpgGame.character.Character;
import dekorator.rpgGame.character.Paladin;
import dekorator.rpgGame.decorator.AttackDecorator;
import dekorator.rpgGame.decorator.DefenceDecorator;
import dekorator.rpgGame.decorator.armor.WoodenShield;
import dekorator.rpgGame.decorator.weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Character paladin = new Paladin("Wojtek");
        System.out.println(paladin.getDescription());

        paladin = new AttackDecorator(paladin, new Sword());
        System.out.println(paladin.getDescription());

        paladin = new DefenceDecorator(paladin, new WoodenShield());
        System.out.println(paladin.getDescription());
    }
}
