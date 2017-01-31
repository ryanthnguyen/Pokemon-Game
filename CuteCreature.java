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
        System.out.println(species);
        System.out.println(level);
        System.out.println(currentHitPoints);
        System.out.println(attackDamage);
        System.out.println(experienceValue);
        System.out.println(experiencePoints);
        System.out.println(isSpecial);
    }
} 