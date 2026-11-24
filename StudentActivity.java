public class StudentActivity {

   // instance variables
   private String name;
   private String category; 
   private int numberOfStudents;
   private double financialRequirements;
   private boolean scholarshipsAvailable;
   private double meetingCost;
 
   // constructors
   public StudentActivity() {
      name = "Chess of the Month Club";  
      category = "Recreational";
      numberOfStudents = 25;
      financialRequirements = 0.0;
      scholarshipsAvailable = false;
      fundsAvailable = 100.00;
      meetingCost = 10.00;
   }
   public StudentActivity(String name, String category, int numberOfStudents, double financialRequirements, boolean scholarshipsAvailable, double fundsAvailble,
      double meetingCost) {
      this.name = name;
      this.category = category;
      this.numberOfStudents = numberOfStudents;
      this.financialRequirements = financialRequirements; 
      this.scholarshipsAvailable = scholarshipsAvailable;
      this.fundsAvailble = 100.00;
      this.meetingCost = 10.00;
   }
   
   // methods
   public void meet() {
      // decrement the budget by the monthly meeting cost
      fundsAvailable -= meetingCost;
      System.out.println("Subtracted " + meetingCost + " from fundsAvailable. Funds remaining: " + fundsAvailble);
   }
}