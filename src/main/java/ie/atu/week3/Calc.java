/*
Simon Hurney
Week 3 assignment - Using git to add updated methods to Calc file.
02/10/24
 */

package ie.atu.week3;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        double firstNumber, secondNumber, result = 0;
        String operation;
        boolean validOperation = true;
        Scanner sc = new Scanner(System.in);
        //Entering first number
        System.out.println("Enter the first number: ");
        firstNumber = sc.nextDouble();
        System.out.println("You entered "+ firstNumber);
        //Entering second number
        System.out.println("Enter the second number: ");
        secondNumber = sc.nextDouble();
        System.out.println("You entered "+ secondNumber);
        System.out.println("Choose an operation: (add, subtract, multiply, divide): ");
        operation = sc.next();

        switch (operation) {
            case "add":
                result = add(firstNumber,secondNumber);
                break;

            case "subtract":
                result = subtract(firstNumber,secondNumber);
                break;

            default:
                System.out.println("Invalid operation");
                validOperation = false;
                break;
        }


        if(validOperation) {
            System.out.println("The result is " + result);
        }

    }

    public static double add(double a, double b) {
        return a + b;

    }
    public static double subtract(double a, double b) {
        return a - b;
    }
}
