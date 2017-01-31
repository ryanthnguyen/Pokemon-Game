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
        System.out.println("Name: " + species);
        System.out.println("Level: " + level);
        System.out.println("Max Hit Point: " + currentHitPoints);
        System.out.println("Attack Damage: " + attackDamage);
        System.out.println("Experience Value: " + experienceValue);
        System.out.println("Experience Points: " + experiencePoints);
        System.out.println("Special: " + isSpecial);
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
        if (dmg > currentHitPoints)
        {
            currentHitPoints = (int)(dmg - currentHitPoints);
            if (currentHitPoints < 0 )
            {
                currentHitPoints = 0;
                System.out.println("Your character is incapitated!" );
            }
        }
    }
} 