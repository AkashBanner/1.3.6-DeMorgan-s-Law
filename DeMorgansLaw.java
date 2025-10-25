/*
 * Activity 1.3.6
 */
import java.util.Scanner;

public class DeMorgansLaw
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 'true' or 'false' for A");
    boolean a = sc.nextBoolean(); 

    System.out.println("Enter 'true' or 'false' for B");
    boolean b = sc.nextBoolean();
    
    // 1st part of De Morgan’s Law:
    // !(a && b) == (!a || !b)
    System.out.println("\nTesting first De Morgan’s Law: !(a && b) == (!a || !b)");
    
    boolean leftSide1 = !(a && b);
    boolean rightSide1 = (!a || !b);

    if (leftSide1)
      System.out.println("!(a && b) is TRUE");
    else
      System.out.println("!(a && b) is FALSE");

    if (rightSide1)
      System.out.println("(!a || !b) is TRUE");
    else
      System.out.println("(!a || !b) is FALSE");

    System.out.println("Do they match? " + (leftSide1 == rightSide1));
    
    // 2nd part of De Morgan’s Law:
    // !(a || b) == (!a && !b)
    System.out.println("\nTesting second De Morgan’s Law: !(a || b) == (!a && !b)");

    boolean leftSide2 = !(a || b);
    boolean rightSide2 = (!a && !b);

    if (leftSide2)
      System.out.println("!(a || b) is TRUE");
    else
      System.out.println("!(a || b) is FALSE");

    if (rightSide2)
      System.out.println("(!a && !b) is TRUE");
    else
      System.out.println("(!a && !b) is FALSE");

    System.out.println("Do they match? " + (leftSide2 == rightSide2));

    // close Scanner when done
    sc.close();
  }
}
