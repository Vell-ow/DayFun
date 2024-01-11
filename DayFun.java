import java.util.Scanner;
/**
 * Write a description of class whatIsDoing here.
 * 
 * @author Andrew Coviello 
 * @version 4/24/2017
 */
public class DayFun
{
    public static void main(String [] args)
    {
        System.out.println("Enter your name(capitals and spaces): ");
        Scanner persona = new Scanner (System.in);
        String name = persona.nextLine();
        int situation = (int) (Math.random()*7)+1;
        if(situation == 1)
        {
            System.out.println(name + " is getting pizza.");
        }
        if(situation == 2)
        {
            System.out.println(name + " is at the park.");
        }
        if(situation == 3)
        {
            System.out.println(name + " is swimming.");
        }
        if(situation == 4)
        {
            System.out.println(name + " is out with friends.");
        }
        if(situation == 5)
        {
            System.out.println(name + " is programming inside of home.");
        }
        if(situation == 6)
        {
            System.out.println(name + " is getting a good night's rest.");
        }
        if(situation == 7)
        {
            System.out.println(name + " is at the mall.");
        } 
    }
}
