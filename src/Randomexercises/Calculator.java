package Randomexercises;

import java.util.Scanner;

public class Calculator {
    //Create a command line calculator
//the user may enter a number
//the user may enter an operator
//give the user an option (+, -, x, /)  and use a conditional to know which operation to do
//don't try to convert the string input into an actual operator
//the user may enter a second number
//the program should output a result, then prompt the user to do another calculation (recursion)
//CalculatorApp.java (for your main method), Calculator.java (for your actual calculator programming), Input.java (for user input)
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        double number, other, resolution;
        System.out.println("Enter a number");
        number = cal.nextInt();
        System.out.println("Enter an operator");
        String operator = cal.next();
        System.out.println("Enter a other number");
        other = cal.nextInt();

        switch (operator) {
            case "+":
                resolution = number + other;
                break;
            case "-":
                resolution = number - other;
                break;
            case "*":
                resolution = number * other;
                break;
            case "/":
                resolution = number / other;
                break;
            default:
                System.out.println("That's not an operator");
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        System.out.print(number + " " + operator +" "+ other + " = " + resolution);
        System.out.println("Have you finished you're homework");
        String userInput = cal.next();
        if (userInput.equalsIgnoreCase("y")) {
            return;
        }else if (userInput.equalsIgnoreCase("n")){
            //start over
        }
    }

}


