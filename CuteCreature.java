//Ryan Nguyen
//Cute Creature Class
public class CuteCreature
{
    private String species;
    private int level;
    private int currentHitPoints;
    private int attackDamage;
    private int experiencePoints;
    private int experienceValue;
    private boolean isSpecial = true;
    public CuteCreature(String monster, int maxHitPoint, int attackDmg, int expValue, boolean special)
    {
        species = monster;
        level = 1;
        currentHitPoints = maxHitPoint;
        attackDamage = attackDmg;
        experienceValue = expValue;
        experiencePoints = 0;
        isSpecial = special;
        System.out.println("Level " + level + " " +  species);
        System.out.println("--------------");
        if (isSpecial == true)
        {
            System.out.println("*** Special! ***");
        }
        else
        {
            System.out.println("*** Normal ***");
        }
        System.out.println("HP: " + currentHitPoints + "/" + currentHitPoints);
        System.out.println("Attack Dmg: " + attackDamage);
        System.out.println("XP: " + experiencePoints + "/" + 250);
        System.out.println("XP Value: " + experienceValue);
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
    private void levelUp()
    {
        experienceValue +=10;
        if (level >= 2 && level <= 10)
        {
            currentHitPoints +=4;
            attackDamage +=3;
            System.out.println("Your character leveled up!");
        }
        else if (level >= 11)
        {
            currentHitPoints +=1;
            attackDamage +=1;
            System.out.println("Your character leveled up!");
        }
    }
    public void gainExp(int exp)
    {
        experiencePoints = 250;
        if (exp > experiencePoints)
        {
            level +=1;
            this.levelUp();
            experiencePoints = (int)(experiencePoints + 50);
        }
    }
}