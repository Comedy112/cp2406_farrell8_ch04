public class FormLetterWriter
{
   public static void main(String[] args) {

      String firstName = "Jonathan";
      String lastName = "Jones";

      displaySalutation(firstName);
      displaySalutation(firstName, lastName);

   }

   public static void displaySalutation(String firstName) {

      System.out.println("Dear Mr. or Ms. " + firstName + ","+ "\nThank you for your recent order");

   }

   public static void displaySalutation(String firstName, String lastName){

      System.out.println("Dear " + firstName + " " + lastName + "," + "\nThank you for your recent order");

   }
}

