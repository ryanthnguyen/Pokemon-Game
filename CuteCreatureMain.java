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
        System.out.print("Enter true for special and false for not special: ");
        boolean special = input.nextBoolean();
        EvolvableCuteCreature createCharacter = new EvolvableCuteCreature(name, hitPoint, damage, expValue, special);
        EvolvableCuteCreature createEnemyCharacter = new EvolvableCuteCreature("Rem",800, 100, 1500, special);
        System.out.println(createCharacter);
        System.out.println(createEnemyCharacter);
        createCharacter.gainExp(1000);
        createEnemyCharacter.gainExp(1000);
        while (createCharacter.getHitPoints() > 0 && createEnemyCharacter.getHitPoints() > 0)
        {
           createCharacter.attack(createEnemyCharacter);
           createCharacter.elementalAttack(createEnemyCharacter);
           createEnemyCharacter.attack(createCharacter);
           createEnemyCharacter.elementalAttack(createCharacter);
        }
        System.out.println(createEnemyCharacter);
        System.out.println(createCharacter);
    }
}