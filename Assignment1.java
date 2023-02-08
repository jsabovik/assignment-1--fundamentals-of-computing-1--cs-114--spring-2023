// *****************************************************
// Assignment1.java
// John Sabovik
// CS114
// 2/5/23
/* Description: The program prints the initials, then takes a user input of degrees fahrenheit and
   converts it to celsius, then takes a 5 character string, then cuts the beginning and last letter
   and reverses it, generates a random number, and lastly prints the degrees celsius, reversed string,
   and random number together.
*/
// *****************************************************
import java.util.Scanner;
import java.util.Random;
public class Assignment1 {
    public static void main(String[] args) {

      printInitials(); // Method call, calling the print intial method, finds and prints it

      Scanner input = new Scanner(System.in); // Initializing the scanner object
      Random rand = new Random(); // Initializing the random object

      System.out.print("Enter a number in F: "); // Prints the phrase
      double fDegrees = input.nextDouble(); // Saves user double input
      double cDegrees = (fDegrees - 32.0) * (5.0/9.0); // Uses calculations to convert the fdegree input into celsius output

      System.out.print("Enter a five character string:");
      String strIn = input.next(); // Saves the user string input
      strIn = strIn.substring(1,4); // Cuts off the beginning and last character
      strIn = reverseString(strIn); // Method call

      System.out.println("Random number generated. Continuing..."); // Prints the phrase

      int randNumber = rand.nextInt(16384 - 32) + 32; // Calculations for random number

      System.out.println(cDegrees + strIn + randNumber); // Prints the variables together

    }

    //Reverse string method, takes a string, reverses it, and returns it
    public static String reverseString(String str){
      String rev = ""; // Initializing an empty string
      for(int i = 0; i < str.length(); i++) { //Loops from zero to length of string
        rev = str.charAt(i) + rev; // Adds each character in front of previous character
      }
      return rev;
    }

    // Method print initials to console
    public static void printInitials() {
      System.out.println("JJJJJJJJJJJJ      SSSSSSSSSSS");
      System.out.println("     JJJJ         SSSS");
      System.out.println("     JJJJ         SSSS");
      System.out.println("     JJJJ         SSSSSSSSSSS");
      System.out.println("JJJ  JJJJ                SSSS");
      System.out.println("JJJ  JJJJ                SSSS");
      System.out.println("JJJJJJJJJ         SSSSSSSSSSS");
    }

}
