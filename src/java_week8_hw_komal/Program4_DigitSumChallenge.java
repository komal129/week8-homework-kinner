package java_week8_hw_komal;
//Digit Sum Challenge
//Write a method with the name sumDigits that has one int parameter called number.
//If the parameter is >= 10 then the method should process the number and return sum of all digits,
//otherwise return -1 to indicate an invalid value.
//The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
//negative numbers, so also return -1 for negative numbers.


public class Program4_DigitSumChallenge {

    public static void main(String[] args) {
        sumDigits(125);
        sumDigits(-1);
    }

    public static void sumDigits(int number) {

        int sum = 0;
        while (number > 0) {
            //finds the last digit of the given number
            sum = sum +  number % 10;
            //removes the last digit from the number
           number =  number / 10;

        }
        //prints the result
        System.out.println("Sum of digits " + sum);

    }


}
