package lecture;

import java.util.ArrayList;
import java.util.Scanner;

public class Exceptions {
    public Exceptions(String msg) {
    }

    public static void main(String[] args) throws Exception {
        //pareInt Exception
//        int myNum = Integer.parseInt("eighteen");

//        ArrayList<Integer> myArrList = new ArrayList<Integer>();
//        myArrList.get(2);
//        kim(8,0);
        betterHaveMyMoney(16);
    }
//    public static void kim (int num1,int  num2){
//        System.out.println(num1/num2);
//        if (num2 == 0) {
//            throw new ArithmeticException("Try again");
//        }

//   TODO: Let’s say that you’re writing a program that checks whether or not a user is eligible to open up a new bank account.
//    They requirements are that they have to be older than 16 years old and have at least $200 to start their bank account.
//    Write a method that will return a string that states whether they’re eligible to bank at Banco di Laura or whether they are not eligible,
//    make sure to  throw an `NumberFormatException` if the user inputs anything that’s not a number (none, zero, zilch, nada, etc).

    public static void betterHaveMyMoney(int age) throws Exception {
        System.out.println("Do you have at least $200 to start ");
        Scanner smacks = new Scanner(System.in);
        String dontHaveMyMoney = smacks.next();
        if (age >= 16 && dontHaveMyMoney.equalsIgnoreCase("yes")) {
            System.out.println("You are eligible!");
        } else {
            System.out.println("You'll never bank at Banco di Laura!");
            throw new NumberFormatException("Get out of here, Don't act like you forgo");
        }
    }

    public static class customException extends Exceptions  {
public customException (String msg){
    super(msg);
}

        static class MyException extends Exception {
            String message;

            public MyException(String str) {
                this.message = str;
            }

            @Override
            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }
        }

    }
}
