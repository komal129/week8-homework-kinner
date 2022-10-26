package java_week8_hw_komal;

//8. Display right angle triangle of @ using nested for loops

import java.util.Scanner;

public class Program8_rightAngleTriangle {

    public static void main(String[] args) {

        Program8_rightAngleTriangle obj = new Program8_rightAngleTriangle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        s.close();
        obj.rightAngleTriangle(num);
    }

    public void rightAngleTriangle(int num){

        // loop to print the pattern
        for(int i =0; i<= num; i++){
            // print column
            for(int j=0; j<i; j++){
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
