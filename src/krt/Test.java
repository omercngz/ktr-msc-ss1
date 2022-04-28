package krt;

import krt.exceptions.WeaponException;
import krt.model.Mage;
import krt.model.Warrior;

public class Test
{
    public static void main(String[] args)  {


        Warrior warrior = new Warrior("Jean -Luc","50");
        Mage mage =  new Mage("Robert","60");

        System.out.println();
        try {
            warrior.attack(" screwdriver");
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }

        try {
            mage.attack("hammer");
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
        try {
            warrior.attack("hammer");
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
        try {
            mage.attack("");
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }
}
