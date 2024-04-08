package uts1_palindrome;
import java.util.Scanner;
public class uts1_palindrome {
    
    public static void main(String[] args) {
        Scanner palindrome = new Scanner (System.in);
            
            System.out.print("Masukkan bilangan tiga digit: ");
            int bilangan = palindrome.nextInt();

            if (validInput(bilangan) ){
                if (isPalindrome(bilangan)){
                    System.out.println(bilangan + " adalah palindrome");
                } else {
                    System.out.println(bilangan + " adalah bukan palindrome");
                }
            }else {
                System.out.println("Bilangan harus tiga digit");
            }
    }
    
    public static boolean validInput(int bilangan){
        return bilangan >=100 && bilangan <=999;
    }
    
    public static boolean isPalindrome(int bilangan){
    int bilanganInput = bilangan;
    int bilanganReverse = 0;

    while (bilangan != 0){
        int angka = bilangan % 10;
        bilanganReverse = bilanganReverse * 10 + angka;
        bilangan = bilangan / 10;
    }
        return bilanganInput == bilanganReverse;
    }
    
}
