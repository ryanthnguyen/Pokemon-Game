//Ryan Nguyen
//Main
import java.util.*;
public class CuteCreatureMain
{
     public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.println("Please creature your special creature" );
        System.out.print("Please pick a name for your creature: ");
        String name = input.nextLine();
        System.out.print("Please enter max hit point: " );
        int hitPoint = input.nextInt();
        System.out.print("Please enter attack damage: " );
        int damage = input.nextInt();
        System.out.print("Please enter beginning exp value: " );
        int expValue = input.nextInt();
        System.out.println("Enter true for special and false for not special: ");
        boolean special = input.nextBoolean();
        CuteCreature createCharacter = new CuteCreature(name, hitPoint, damage, expValue, special);
        CuteCreature createEnemyCharacter = new CuteCreature("Emilia", 60, 50, 70, special);
        createCharacter.getSpecies();
        createCharacter.getCurrentLevel();
        createCharacter.getAttackDmg();
        createCharacter.getExpValue();
        createCharacter.getExpPoints();
        createCharacter.getSpecial();
        System.out.println(createCharacter);
        createCharacter.gainExp(450);
        System.out.println(createCharacter);
        while(createCharacter.getHitPoints() > 0)
        {
           createCharacter.attack(createEnemyCharacter);
        }
    }
}