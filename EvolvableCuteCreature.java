//Ryan Nguyen
//subclass of CuteCreature
public class EvolvableCuteCreature extends CuteCreature
{
    public boolean equalCuteCreature(object o)
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
    public void elementalAttack(CuteCreature c)
    {
        
    }
}