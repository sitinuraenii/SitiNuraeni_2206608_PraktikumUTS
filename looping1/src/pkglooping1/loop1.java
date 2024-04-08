package pkglooping1;

import java.util.Scanner;
public class loop1 {

    public static void main(String[] args) {
        Scanner looping = new Scanner (System.in);
        
        System.out.print("Masukan angka : ");
        int angka = looping.nextInt();
        
            for (int i=1;i<=angka;i++){
                for (int j=1;j<=i;j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
    }
    
}