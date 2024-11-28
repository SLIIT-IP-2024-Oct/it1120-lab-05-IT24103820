import java.util.Scanner;

public class IT24103820Lab5Q1 {
    public static void main(String[] args) {
         //Declare variables
         int number1, number2, number3, smallestNumber, largestNumber ;

        //create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        //Take number1, number2, number3 as inputs
        System.out.println("Enter the first integer:");
        number1 = input.nextInt();
        System.out.println("Enter the second integer:");
        number2 = input.nextInt();
        System.out.println("Enter the third integer:");
        number3 = input.nextInt();

        System.out.println("User entered numbers are:" + number1 + " " + number2 + " " + number3);

        //calculate the largest number
        largestNumber = number1; //assume number1 is the largest
        if (number2 > largestNumber) {
           largestNumber = number2;
        } 
        if (number3 > largestNumber) {
           largestNumber = number3;
        } 
 
        // Calculate the smallest number
        smallestNumber = number1; //assume number1 is the smallest
        if (number2 < smallestNumber) {
           smallestNumber = number2;
        } 
        if (number3 < smallestNumber) {
           smallestNumber = number3;
        } 
   
        //Display the output
        System.out.println("The smallest number is:" + smallestNumber);
        System.out.println("The largest number is:" + largestNumber );
    }
}