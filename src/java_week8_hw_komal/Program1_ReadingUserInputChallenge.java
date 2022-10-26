package java_week8_hw_komal;

//1. Read 10 numbers from the console entered by the user and print the sum of those numbers.

import java.util.Scanner;

public class Program1_ReadingUserInputChallenge {

        public static void main(String[] args) {
            Program1_ReadingUserInputChallenge obj = new Program1_ReadingUserInputChallenge();
            obj.sumInput();
        }

        public void sumInput(){
            int i = 1;
            int sum = 0;
            Scanner s = new Scanner(System.in);
            while (i <= 10){
                System.out.println("Enter integer number " + i );
                if (s.hasNextInt()){
                    sum = sum + s.nextInt();
                    i++;
                }
                else {
                    System.out.println("Invalid number");
                    s.next(); // use this to flush the input number
                }

            }
            s.close();
            System.out.println(sum);
        }

    }
