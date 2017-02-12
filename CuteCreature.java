//Ryan Nguyen
//Cute Creature Class
import java.util.*;
public class CuteCreature
{
    protected String species;
    protected int level;
    protected int currentHitPoints;
    protected int attackDamage;
    protected int experiencePoints;
    protected int accumulatedExperiencePoints = 250;
    protected int experienceValue;
    protected int count = 250;
    protected boolean isSpecial = true;
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
        return this.species;
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
    public void takeDamge(int dmg)
    {
        currentHitPoints = (int)(currentHitPoints - dmg);
        System.out.print("Damage Received: " + currentHitPoints);
        if (currentHitPoints < 0)
        {
            currentHitPoints = 0;
            System.out.println("HP: " + currentHitPoints + "Your character is incapitated! ");
        }
    }
    public String attribute(String species)
    {
        uppercaseSpecies = species.UpperCase();
        String attribute = "";
        if (species().charAt(0) >= 'A' && species().charAt(0) <= 'G')
        {
            attribute = "fire";
        }
        else if (species().charAt(0) >= 'H' && species().charAt(0) <= 'M')
        {
            attribute = "water";
        }
        else if(species(0).charAt(0) >= 'N' && species(0).charAt(0) <= 'N')
        {
            attribute = "air";
        }
        else if (species(0).charAt(0) >= 'T' && species(0).charAt(0) <= 'Z')
        {
            attribute = "earth";
        }
        return attribute;
    }
    private void levelUp()
    {
        level++;
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
        System.out.println("\n" + "You gained " + experiencePoints);
    }
    public void attack(CuteCreature c)
    {
        double chanceOfAttack = (100 * Math.random() + 1);
        double basicDamage = attackDamage * .08;
        double critDamage = 2 * (attackDamage * .08);
        if (currentHitPoints > 0)
        {
        if (chanceOfAttack > 80.0)
        {
            this.currentHitPoints -= basicDamage;
            System.out.println("Hit For " + basicDamage);
        }
        else if (chanceOfAttack <= 15.0)
        {
            System.out.println("You Missed!");
        }
        else if (chanceOfAttack <= 5.0)
        {
            this.currentHitPoints -= critDamage;
            System.out.println("Critical Hit For! " + critDamage);
        }
       }
       else 
       {
        if (this.currentHitPoints < 0)
        {
        this.currentHitPoints = 0;
        System.out.println(c + " has been decapitated!");
       }
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