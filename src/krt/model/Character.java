package krt.model;

import krt.characterbehaviour.IMovable;
import krt.exceptions.WeaponException;

public abstract class Character implements IMovable
{
    private String name;
    private String RPGClass;
    private int life;
    private int strength;
    private int agility;
    private int wit;

    public Character(String pName, String pRPGClass) {
        this.name = pName;
        this.RPGClass = pRPGClass;
    }

    public abstract void attack(String pWeapon) throws WeaponException;

    public void unsheatheWeapon(String pWeapon)
    {
        System.out.println("["+getName()+"] : "+" unsheathes his! "+pWeapon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    public void setRPGClass(String RPGClass) {
        this.RPGClass = RPGClass;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }
}
