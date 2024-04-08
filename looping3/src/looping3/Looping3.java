package looping3;
import java.util.Scanner;
public class Looping3 {

    public static void main(String[] args) {
        Scanner looping3 = new Scanner (System.in);
        
        System.out.print("Masukan angka : ");
        int angka = looping3.nextInt();
        
        for(int i=1; i<=angka; i++){
            for(int j=angka; j>i; j--){
                System.out.print("  ");
            }
            for(int k=i; k>=1; k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    
}
