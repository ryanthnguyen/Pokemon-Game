//Ryan Nguyen
//subclass of CuteCreature
public class EvolvableCuteCreature extends CuteCreature
{
    private String attribute;
    public boolean equalCuteCreature(EvolvableCuteCreature o)
    {
        if (!(o instanceof CuteCreature))
        
            return false;
        else
            
            return true;
    }
    public EvolvableCuteCreature(String species, int maxHitPoint, int attackDmg, int expValue, boolean special, String attribute)
    {
        super(species, maxHitPoint, attackDmg, expValue, special);
    }
    public String attribute(String s)
    {
        s = s.toUpperCase();
        String atribute = "";
        if (s.charAt(0) >= 'A' && s.charAt(0) <= 'G')
        {
            attribute = "fire";
        }       
        else if (s.charAt(0) >= 'H' && s.charAt(0) <= 'M')
        {
            attribute = "water";
        }
        else if (s.charAt(0) >= 'N' && s.charAt(0) <= 'S')
        {
            attribute = "air";
        }
        else if (s.charAt(0) >= 'T' && s.charAt(0) <= 'Z')
        {
            attribute = "earth";
        }
        return attribute;
    }
}