//Ryan Nguyen
public class EvolvableCuteCreature extends CuteCreature
{
    private String attributes = "";
    private int elementalAttack = 0;
    public EvolvableCuteCreature(String species, int maxHitPoint, int attackDmg, int expValue, boolean special)
    {
        super(species, maxHitPoint, attackDmg, expValue, special);
        attributes = species;
    }
    //now we have to override the levelUp method from CuteCreature
    protected void levelUp()
    {
       level++;
       experienceValue += 10;
        if (level >= 2 && level <= 10)
        {
            currentHitPoints +=4;
            attackDamage +=3;
        }
        else if (level >= 11)
        {
        currentHitPoints +=1;
        attackDamage +=1;
        if (level == 20)
        {
        currentHitPoints += 16;
        attackDamage += 6;
        attributes = attributes.toUpperCase();
        char firstCharacter = attributes.charAt(0);
        if (firstCharacter>= 65 && firstCharacter<= 71)
        {
            attributes = "fire";
        } 
        else if (firstCharacter >= 72 && firstCharacter <= 77)
        {
            attributes = "water";
        }
        else if (firstCharacter >= 78 && firstCharacter <= 83)
        {
            attributes = "air";
        }
        else 
        {
            attributes = "earth";
        }
        }
       }
     }
     public String getAttribute()
    {
       return attributes;
    }
    //this method will work only if the level is over 20 
     public void elementalAttack(CuteCreature l)
    {
        //check to see if cutecreature is over level 20
        if (l instanceof EvolvableCuteCreature && level >= 20)
        {
                //check to see if the attributes is fire
                EvolvableCuteCreature c = (EvolvableCuteCreature)l;
                if (getAttribute() == "fire")
                {
                    if(c.getAttribute() == "")
                    {
                    elementalAttack = attackDamage;
                    System.out.println("Elemental Attack: " + elementalAttack);
                    c.takeDamage(elementalAttack);
                   }
                   else if (c.getAttribute() == "water")
                   {
                       elementalAttack = (int)(0.25 * attackDamage);
                       System.out.println("Elelemtal Attack: " + elementalAttack);
                   }
                   else if (c.getAttribute() == "air")
                   {
                       elementalAttack = (int)(4* attackDamage);
                       System.out.println("Elemental Attack: " + elementalAttack);
                       c.takeDamage(elementalAttack);
                   }
                   else if (c.getAttribute() == "Earth")
                   {
                       elementalAttack = attackDamage;
                        System.out.println("Elemental Attack: " + elementalAttack);
                       c.takeDamage(elementalAttack);
                   }
                }
                else if (getAttribute() == "water")
                {
                    if(c.getAttribute() == "")
                    {
                    elementalAttack = attackDamage;
                    System.out.println("Elemental Attack: " + elementalAttack);
                    c.takeDamage(elementalAttack);
                   }
                   else if (c.getAttribute() == "earth")
                   {
                       elementalAttack = (int)(0.25 * attackDamage);
                       System.out.println("Elelemtal Attack: " + elementalAttack);
                   }
                   else if (c.getAttribute() == "fire")
                   {
                       elementalAttack = (int) (4* attackDamage);
                       System.out.println("Elemental Attack: " + elementalAttack);
                       c.takeDamage(elementalAttack);
                   }
                   else if (c.getAttribute() == "air")
                   {
                       elementalAttack = attackDamage;
                        System.out.println("Elemental Attack: " + elementalAttack);
                       c.takeDamage(elementalAttack);
                   }
                }
                else if (getAttribute() == "air")
                {
                    if(c.getAttribute() == "")
                    {
                    elementalAttack = attackDamage;
                    System.out.println("Elemental Attack: " + elementalAttack);
                    c.takeDamage(elementalAttack);
                   }
                   else if (c.getAttribute() == "fire")
                   {
                       elementalAttack = (int)(0.25 * attackDamage);
                       System.out.println("Elemental Attack: " + elementalAttack);
                       c.takeDamage(elementalAttack);
                   }
                   else if (c.getAttribute() == "earth")
                   {
                       elementalAttack = (int)(4* attackDamage);
                       System.out.println("Elemental Attack: " + elementalAttack);
                       c.takeDamage(elementalAttack);
                   }
                   else if (c.getAttribute() == "water")
                   {
                       elementalAttack = attackDamage;
                        System.out.println("Elemental Attack: " + elementalAttack);
                       c.takeDamage(elementalAttack);
                   }
                }
                else if (getAttribute() == "earth")
                {
                    if(c.getAttribute() == "")
                    {
                    elementalAttack = attackDamage;
                    System.out.println("Elemental Attack: " + elementalAttack);
                    c.takeDamage(elementalAttack);
                   }
                   else if (c.getAttribute() == "air")
                   {
                       elementalAttack = (int)(0.25 * attackDamage);
                       System.out.println("Elemental Attack: " + elementalAttack);
                       c.takeDamage(elementalAttack);
                   }
                   else if (c.getAttribute() == "water")
                   {
                       elementalAttack = (int) (4* attackDamage);
                       System.out.println("Elemental Attack: " + elementalAttack);
                       c.takeDamage(elementalAttack);
                   }
                   else if (c.getAttribute() == "fire")
                   {
                       elementalAttack = attackDamage;
                        System.out.println("Elemental Attack: " + elementalAttack);
                       c.takeDamage(elementalAttack);
                   }
                }
               }
               else
                {
                    System.out.println("Your character is not level 20 yet so they can't use elementalAttack");
                }
        if (l.getHitPoints() <= 0)
           {
             l.currentHitPoints = 0;
             gainExp(l.getExpValue());
             System.out.println(l.getSpecies() + " has been incapitated");
           }
    }
    //now we have to override the toString method from CuteCreature
    public String toString()
       {
        if (level < 20)
        return super.toString() + "\n" + "Attribute: " + "";
        else       
        return super.toString() + "\n" + "Attribute: " + getAttribute();
       }
     }