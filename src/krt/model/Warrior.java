package krt.model;

import krt.exceptions.WeaponException;

public class Warrior extends Character
{
    private static final String HAMMER = "hammer";
    private static final String SWORD = "sword";
    private static final String ANNOUNCE = "May the God be with me !";

    public Warrior(String pName, String pRPGClass)
    {
        super(pName, pRPGClass);
        announce();
    }

    private void announce()
    {
        System.out.println("["+getName()+"]: " +ANNOUNCE);
    }

    @Override
    public void attack(String pWeapon) throws WeaponException
    {
        if(pWeapon  == "")
        {
            throw new WeaponException("["+getName()+"]: I refuse to fight with my bare hands");
        }

        else if(pWeapon.equals(HAMMER) || pWeapon.equals(SWORD))
        {
            unsheatheWeapon(pWeapon);
            System.out.print("["+getName()+"]:");
            System.out.println("Rrrrrrrrrrr...");
            System.out.print("["+getName()+"]:");
            System.out.println("I will crush you with my "+pWeapon);
        }
        else
        {
            throw new WeaponException("["+getName()+"]: ["+pWeapon+"]??"+ " What should I do with this !?");
        }

    }

    @Override
    public void moveLeft() {
        System.out.print("["+getName()+"] : "  );
        System.out.println(" moves left like a bad boy.");
    }

    @Override
    public void moveRight() {
        System.out.print("["+getName()+"] : "  );
        System.out.println(" moves right like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.print("["+getName()+"] : "  );
        System.out.println(" moves bach like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.print("["+getName()+"] : "  );
        System.out.println(" moves forward like a bad boy.");
    }
}
