//Ryan Nguyen
//subclass of CuteCreature
public class EvolvableCuteCreature extends CuteCreature
{
    private String attributes;
    private int elementalAttack;
    public EvolvableCuteCreature(String species, int maxHitPoint, int attackDmg, int expValue, boolean special, String attributes)
    {
        super(species, maxHitPoint, attackDmg, expValue, special);
    }
    public String attributes(String species)
    {
        species = species.toUpperCase();
        if (species.charAt(0) >= 'A' && species.charAt(0) <= 'G')
        {
            attributes = "fire";
        } 
        else if (species.charAt(0) >= 'H' && species.charAt(0) <= 'M')
        {
            attributes = "water";
        }
        else if (species.charAt(0) >= 'N' && species.charAt(0) <= 'S')
        {
            attributes = "air";
        }
        else if (species.charAt(0) >= 'T' && species.charAt(0) <= 'Z')
        {
            attributes = "earth";
        }
        return attributes;
    }
	public String getAttribute()
	{
		return attributes;
	}
    //this method will work only if the level is over 20 
    public void elementalAttack(CuteCreature c)
    {
        //check to see if cutecreature is over level 20
        if (c instanceof CuteCreature)
        {
            if (this.level >= 20)
            {
                //check to see if the attributes is fire
                if (attributes(this.getSpecies()) == attributes(c.getSpecies()))
                {
                    elementalAttack = 0;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "fire" && attributes(c.getSpecies()) == "water")
                {
                    elementalAttack = (int)0.25 * attackDamage;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "fire" && attributes(c.getSpecies()) == "air")
                {
                    elementalAttack = 4 * attackDamage;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "fire" && attributes(c.getSpecies()) == "earth")
                {
                    elementalAttack = attackDamage;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "water" && attributes(c.getSpecies()) == "earth")
                {
                    elementalAttack = (int)0.25 * attackDamage;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "water" && attributes(c.getSpecies()) == "fire")
                {
                    elementalAttack = 4 * attackDamage;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "water" && attributes(c.getSpecies()) == "air")
                {
                    elementalAttack = attackDamage;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "air" && attributes(c.getSpecies()) == "fire")
                {
                    elementalAttack = (int)0.25 * attackDamage;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "air" && attributes(c.getSpecies()) == "earth")
                {
                    elementalAttack = 4 * attackDamage;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "air" && attributes(c.getSpecies()) == "water")
                {
                    elementalAttack = attackDamage;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "earth" && attributes(c.getSpecies()) == "air")
                {
                    elementalAttack = (int)0.25 * attackDamage;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "earth" && attributes(c.getSpecies()) == "wate")
                {
                    elementalAttack = 4 * attackDamage;
                    currentHitPoints -= elementalAttack;
                }
                else if (attributes(this.getSpecies()) == "earth" && attributes(c.getSpecies()) == "fire")
                {
                    elementalAttack = attackDamage;
                    currentHitPoints -= elementalAttack;
                }
            }
        }
        else
        {
			System.out.println("Error your character is not level 20 to use the special elemental attack!");
        }
    }
	//now we have to override the levelUp method from CuteCreature
    protected void levelUp()
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
		else if (level >= 20)
		{
			currentHitPoints += 6;
			attackDamage += 6;
			System.out.println("\n" + "Your character leveled up to " + level);
		}
    }
	public String toString()
    {
         if (isSpecial == true)
        {
            return ("\n" + "Level " + level + " " + species + "\n" + "--------------" + "\n" + "*** Special! ***" + "\n" + "HP: " + currentHitPoints + "/" + currentHitPoints + "\n" + "Attack Dmg: " + attackDamage + "\n" + "XP: " + experiencePoints + "/" + accumulatedExperiencePoints + "\n" + "XP Value: " + experienceValue + "\n" + "Attribute: " + getAttribute());       
        }
         else
        {
            return ("\n" + "Level " + level + " " + species + "\n" + "--------------" + "\n" + "*** Normal ***" + "\n" + "HP: " + currentHitPoints + "/" + currentHitPoints + "\n" + "Attack Dmg: " + attackDamage + "\n" + "XP: " + experiencePoints + "/" + accumulatedExperiencePoints + "\n" + "XP Value: " + experienceValue + "\n" + "Attribute: " + getAttribute());   
        }
    }
}