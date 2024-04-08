package uts3_palindrome_reverse;
import java.util.Scanner;

public class Uts3_palindrome_reverse {
    public static int reverse(int number){
        int reversedNumber = 0;
        while (number != 0 ){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /=10;
        }
        return reversedNumber;
    }
    
    public static boolean isPalindrome (int number){
        return number == reverse (number);
    }

    public static void main(String[] args) {
        Scanner palindromeee = new Scanner (System.in);
            
            System.out.print("Masukkan bilangan : ");
            int bilangan = palindromeee.nextInt();

            if (isPalindrome(bilangan)){
                System.out.println(bilangan + " adalah palindrome");
            } else {
                System.out.println(bilangan + " adalah bukan palindrome");
            }
    }
}
