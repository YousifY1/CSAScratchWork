import java.util.Scanner;

public class HaloGameRating {
   public static void main(String[] args) {
      int haloFans;
      double averageRating = 95;
      boolean greatGame= true;
      String gameRating = "95/100";

      System.out.println("Please enter your rating for Halo 3");
      Scanner scan = new Scanner(System.in);
      gameRating = scan.nextLine();
      System.out.println("You rated Halo 3 a \"" + gameRating + "\"");
      System.out.println("The average rating is \"" + (9.5*10) + "\"");
      scan.close();

      
   }
}