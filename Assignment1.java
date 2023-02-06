// Import libraries here
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        // John Sabovik document and make comments
        printInitials();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int fDegrees = input.nextInt();
        int cDegrees = (fDegrees - 32) * (5/9);

        System.out.print("Enter a five character string:");
        String strIn = input.next();
        strIn = strIn.substring(1,4);

    }

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
