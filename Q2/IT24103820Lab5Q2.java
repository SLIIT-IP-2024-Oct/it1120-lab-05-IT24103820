import java.util.Scanner;

public class IT24103820Lab5Q2 {
    public static void main(String[] args) {
         //Declare variables
         int noOfNewMembers;

         //create a scanner object to read input
         Scanner input = new Scanner(System.in);

         //Input No of customers as the input 
         System.out.println("Enter the number of new members introduced: ");
         noOfNewMembers = input.nextInt();

         //Validate the input
         if (noOfNewMembers < 0) {
          System.out.println("Input must be a number 0 or greater");
         } 
         else {
           switch (noOfNewMembers) {
              case 0:
                 System.out.println("No Prize");
                 break;
              case 1:
                 System.out.println("Prize is a: Pen");
                 break;
              case 2:
                 System.out.println("Prize is a: Umbrella");
                 break;
              case 3:
                 System.out.println("Prize is a: Bag");
                 break;
              case 4:
                 System.out.println("Prize is a: Travelling chair");
                 break;
              default:
                 if (noOfNewMembers >= 5) {
                 System.out.println("Prize is a: Headphone");
                 }
                 break;
              }
           }
      }
}