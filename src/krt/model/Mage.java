package krt.model;

import krt.exceptions.WeaponException;

public class Mage extends Character
{
    private static final String MAGIC = "magic";
    private static final String WAND = "wand";
    private static final String ANNOUNCE = "I am your reaper!";

    public Mage(String pName, String pRPGClass) {
        super(pName, pRPGClass);
        announce();
    }

    private void announce()
    {
        System.out.println("["+getName()+"]: "+ANNOUNCE);
    }

    @Override
    public void attack(String pWeapon) throws WeaponException
    {
        if(pWeapon  == "")
        {
            throw new WeaponException("["+getName()+ "] : I refuse to fight with my bare hands");
        }

        else if(pWeapon.equals(MAGIC) || pWeapon.equals(WAND))
        {
            unsheatheWeapon(pWeapon);
            System.out.print("["+getName()+ "]  : ");
            System.out.println("Feel the power of my "+pWeapon);
        }

        else{
            throw  new WeaponException("["+getName()+ "]  :I don 't need this stupid ["+pWeapon+"]! Don 't misjudge my powers !");
        }
    }

    @Override
    public void moveLeft() {
        System.out.print("["+ getName()+"] : ");
        System.out.println(" moves left furtively");
    }

    @Override
    public void moveRight() {

        System.out.print("["+ getName()+"] : ");
        System.out.println(" moves right furtively");

    }

    @Override
    public void moveBack() {

        System.out.print("["+ getName()+"] : ");
        System.out.println(" moves back furtively");
    }

    @Override
    public void moveForward() {

        System.out.print("["+ getName()+"] : ");
        System.out.println(" moves forward furtively");
    }
}
