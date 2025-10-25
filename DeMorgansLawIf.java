/*
 * Activity 1.3.6
 */
import java.util.Scanner;

public class DeMorgansLawIf
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 'true' or 'false' for A");
    boolean a = sc.nextBoolean(); 

    System.out.println("Enter 'true' or 'false' for B");
    boolean b = sc.nextBoolean();
    
    // Original: !(a && b)
    if (!(a && b))
    {
      System.out.println("NOT (a AND b) evaluates to true");
    }
    else 
    {
      System.out.println("NOT (a AND b) evaluates to false");
    }
    
    // Reproduce !(a && b) using nested if/else
    boolean result1;
    if (a) {
      if (b) {
        result1 = false;
      } else {
        result1 = true;
      }
    } else {
      result1 = true;
    }

    System.out.println("Nested version of !(a && b) = " + result1);
     
    // Original: !(a || b)
    if (!(a || b))
    {
      System.out.println("NOT (a OR b) evaluates to true");
    }
    else 
    {
      System.out.println("NOT (a OR b) evaluates to false");
    }
    
    // Reproduce !(a || b) using nested if/else
    boolean result2;
    if (a) {
      result2 = false;
    } else {
      if (b) {
        result2 = false;
      } else {
        result2 = true;
      }
    }

    System.out.println("Nested version of !(a || b) = " + result2);
    
    sc.close();
  }
}
