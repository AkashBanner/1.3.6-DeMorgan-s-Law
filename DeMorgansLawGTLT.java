/*
 * Activity 1.3.6
 */
import java.util.Scanner; 

public class DeMorgansLawGTLT
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number for X");
    int x = sc.nextInt();

    System.out.println("Enter a number for Y");
    int y = sc.nextInt(); 
    
    System.out.println("\nChecking that both x and y are not negative ... ");
    if (!(x < 0) && !(y < 0)) {
      System.out.println("Both x and y are not negative");
    } else {
      System.out.println("At least one value is negative");
    }
    
    // New test using logical OR
    System.out.println("\nChecking if either x or y is zero ...");
    if (x == 0 || y == 0) {
      System.out.println("At least one of x or y is zero.");
    } else {
      System.out.println("Neither x nor y is zero.");
    }

    // SHORT-CIRCUIT COMMENT:
    // Short-circuiting can occur in (x == 0 || y == 0).
    // If x == 0 is true, Java does not evaluate (y == 0) because the entire OR
    // expression is already guaranteed to be true.

    sc.close();
  }
}
