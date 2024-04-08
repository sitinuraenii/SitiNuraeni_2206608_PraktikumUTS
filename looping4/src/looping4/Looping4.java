package looping4;
import java.util.Scanner;
public class Looping4 {

    public static void main(String[] args) {
        Scanner looping4 = new Scanner (System.in);
        
        System.out.print("Masukan angka : ");
        int angka = looping4.nextInt();
        
        for(int i=1; i<=angka; i++){
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=angka-i+1; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    
}
