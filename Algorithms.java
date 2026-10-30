public class Algorithms {

   public static void main(String[] args) {
      System.out.println(sumAllNumbersLessThan(3));
   }
   
   public static int sumAllNumbersLessThan(int num) {
      int value = 0;
      
      for (int i = 1; i < num; i++) {
         value += i;
   }
   return value;
   }
   
   public static int largestRandomNumber(int loopTimes) {
      int smallestRandomInt = -10000;
      for (int i = 0; i <= loopTimes; i++) {
         int num = (int) (Matho.random() * 10000);
         if (num > smallestRandomInt) {
            smallestRandomInt = num;
         }
   }
}