package java_week8_hw_komal;

/*3. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message. */

import java.util.Scanner;

public class Program3_VowelAndConsonant {

    public static void main(String[] args) {

        Program3_VowelAndConsonant obj = new Program3_VowelAndConsonant();
        obj.vowelAndConsonant();

    }

    public void vowelAndConsonant(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter");
        String a = sc.next();
        if(a.length() == 1 && Character.isAlphabetic((a.charAt(0)))){
            char ch = Character.toLowerCase((a.charAt(0)));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                System.out.println(a+ " is a vowel");
            } else {

                System.out.println(a+ " is a consonant");
            }

        } else {

            System.out.println("Invalid Input");
        }



    }
}
