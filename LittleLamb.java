public class LittleLamb {

   public static void main(String[] args) {
      System.out.print("Marry had a ");
      marysPet("Honey-baked ham", ", ");
      marysPet("Honey-baked ham", ", ");
      marysPet("Honey-baked ham", ". ");
   }
   
   public static void marysPet(String petName, String punctuation) {
      System.out.print(petName + punctuation);
   }
}