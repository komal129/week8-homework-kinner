package java_week8_hw_komal;
//10. Write a program to input any number and check if it Armstrong number or not
import java.util.Scanner;

public class Program10_Armstrong {

    int number;
    int length;
    Program10_Armstrong(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        number = s.nextInt();
        length = String.valueOf(number).length(); // Convert to String and get the length
        s.close();
    }

    public static void main(String[] args) {
        Program10_Armstrong obj = new Program10_Armstrong();
        obj.CheckArmstrongNumber();
    }

    public void CheckArmstrongNumber(){
        int num = this.number;
        double armstrongNumber = 0;
        while (num > 0){
            armstrongNumber = armstrongNumber + Math.pow(num % 10, length);
            num = num / 10;
        }
        if (armstrongNumber == this.number){
            System.out.println("The given number is Armstrong Number");
        }
        else{
            System.out.println("The number is not Armstrong Number");
        }
    }

}
