/* Constructing Objects and Exercising Methods Challenge
   1. Construct one zero argument constructor Pet object.
   2. Construct three 6 argument constructor Pet objects.
   3. Make one of your pets sleep by exercising the sleep() method.
   4. Make one of your pets wake up by using the wakeUp() method.
   5. Age two of your pets by using the aging() method.
   6. Make one of your pets gain weight by exercising the changeWeight() method.
   7. Make one of your pets lose weight by exercising the changeWeight() method.
   Rules: You may not change ANYTHING about the Pet class file.
   You must do everything above by using the Pet class.
   Between each console output, place a System.out.println() to aid with readibility of your output.
   Place all of your code in the main method below.
*/

class Main {
  public static void main(String[] args) {
   // zero argument pet constructor
   Pet pet1 = new Pet();
   System.out.println("First dog:");
   System.out.println(pet1.toString());
   System.out.println();

   // First 6 argment pet constructor
   Pet pet2 = new Pet("Husky", "Apollo", 8, 59.5, false, true);
   System.out.println("Second dog:");
   System.out.println(pet2.toString());
   System.out.println();

   //Second 6 argument pet constructor
   Pet pet3 = new Pet("Maltese", "Penny", 5, 6.8, false, false);
   System.out.println("Third dog:");
   System.out.println(pet3.toString());
   System.out.println();

   //Third 6 argument pet constructor
   Pet pet4 = new Pet("Goldendoodle", "Max", 9, 55.6, true, true);
   System.out.println("Fourth Dog:");
   System.out.println(pet4.toString());
   System.out.println();
  
   

   // Excersing sleep method on pet1 object
   System.out.println("Pet actions:");
   pet1.sleep();

   // Excersizing wakeUp method on pet2 object
   pet2.wakeUp();

   // Excersizing aging method on pet1 and pet3
   pet1.aging(4);
   pet2.aging(5);

   // Excersizing changeWeight method on pet4 and pet2
   // Gain weight:
   pet4.changeWeight(5.0);
  // Lose weight
   pet2.changeWeight(-4.6);





  }
}