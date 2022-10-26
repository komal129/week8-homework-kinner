package java_week8_hw_komal;

//2. -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
import java.util.Scanner;

public class Program2_MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Program2_MinAndMaxInputChallenge obj = new Program2_MinAndMaxInputChallenge();
        obj.showMinMax();
    }

    public void showMinMax(){
        int min = 0;
        int max = 0;
        int num;
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter integer number ");

            // if input is not integer then break the loop
            if (!s.hasNextInt()){
                break;
            }

            num = s.nextInt();

            // Set first input as min and max
            if ((min == 0) && (max == 0 )){
                min = num;
                max = num;
            }
            else {
                if (num < min){
                    min = num;
                }
                if (num > max){
                    max = num;
                }
            }

        }
        s.close();
        System.out.println("Min integer number " + min);
        System.out.println("Max integer number " + max);
    }
}
