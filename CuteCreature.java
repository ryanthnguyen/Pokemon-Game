//Ryan Nguyen
//Cute Creature Class
import java.util.*;
public class CuteCreature
{
    private String species;
    private int level;
    private int currentHitPoints;
    private int attackDamage;
    private int experiencePoints;
    private int accumulatedExperiencePoints = 250;
    private int experienceValue;
    private int count = 250;
    private boolean isSpecial = true;
    public CuteCreature(String monster, int maxHitPoint, int attackDmg, int expValue, boolean special)
    {
        species = monster;
        level = 1;
        currentHitPoints = maxHitPoint;
        attackDamage = attackDmg;
        experienceValue = expValue;
        experiencePoints = 0;
        accumulatedExperiencePoints = 250;
        isSpecial = special;
    }
    public int getHitPoints()
    {
        return currentHitPoints;
    }
    public String getSpecies()
    {
        return species;
    }
    public int getCurrentLevel()
    {
        return level;
    }
    public int getAttackDmg()
    {
        return attackDamage;
    }
    public int getExpValue()
    {
        return experienceValue;
    }
    public int getExpPoints()
    {
        return experiencePoints;
    }
    public boolean getSpecial()
    {
        return isSpecial;
    }
    public void takeDamage(int dmg)
    {
        if (this.currentHitPoints > 0)
        {
            this.currentHitPoints -= dmg;
            System.out.println(this.getSpecies() + " received "  + dmg);
        }
    }
    private void levelUp()
    {
        level++;
        experienceValue += 10;
        if (level >= 2 && level <= 10)
        {
            currentHitPoints +=4;
            attackDamage +=3;
            System.out.println("\n" + "Your character leveled up to " + level);
            
        }
        else if (level >= 11)
        {
            currentHitPoints +=1;
            attackDamage +=1;
            System.out.println("\n" + "Your character leveled up to " + level);
        }
         System.out.println("\n" + this.getSpecies() + " gained " + experiencePoints);
    }
    public void gainExp(int exp)
    {
        experiencePoints += exp;
        for (int i  = experiencePoints; i > count;)
        {
            experiencePoints = exp;
            this.levelUp();
            count+=50;
            accumulatedExperiencePoints += count;
        }
    }
    public void attack(CuteCreature c)
    {
        //need to fix so how that basic attack is +- 20%;
        double chanceOfAttack = (Math.random() * 100) + 1;
        double maxAttack = 1.2 * attackDamage;
        double minAttack = .8 * attackDamage;
        double basicDamage = (Math.random() * (maxAttack - minAttack + 1)) + minAttack;
        double critDamage = 2 * basicDamage;
        if (chanceOfAttack  <= 80)
         {
          System.out.println("\n" + this.getSpecies() + " hit For " + (int)basicDamage);
          c.takeDamage((int)basicDamage);
        }
        else if (chanceOfAttack <= 15)
        {
            System.out.println("\n" + this.getSpecies() + " Missed!");
        }
        else if (chanceOfAttack <= 5)
        {
            System.out.println("/n" + this.getSpecies() + " Critical Hit For! " + (int)critDamage);
            c.takeDamage((int)critDamage);
        }
        if (c.getHitPoints() <= 0)
        {
            c.currentHitPoints = 0;
            gainExp(c.getExpValue());
            System.out.println("\n" + c.getSpecies() + " has been incapitated");
            System.out.println("HP " + 0 + " " + c.getSpecies() + " is incapitated! ");
        }
        }
    public String toString()
    {
         if (isSpecial == true)
        {
            return ("\n" + "Level " + level + " " + species + "\n" + "--------------" + "\n" + "*** Special! ***" + "\n" + "HP: " + currentHitPoints + "/" + currentHitPoints + "\n" + "Attack Dmg: " + attackDamage + "\n" + "XP: " + experiencePoints + "/" + accumulatedExperiencePoints + "\n" + "XP Value: " + experienceValue);        
        }
         else
        {
            return ("\n" + "Level " + level + " " + species + "\n" + "--------------" + "\n" + "*** Normal ***" + "\n" + "HP: " + currentHitPoints + "/" + currentHitPoints + "\n" + "Attack Dmg: " + attackDamage + "\n" + "XP: " + experiencePoints + "/" + accumulatedExperiencePoints + "\n" + "XP Value: " + experienceValue);       
        }
    }
    }