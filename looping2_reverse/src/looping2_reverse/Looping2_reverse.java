
package looping2_reverse;
import java.util.Scanner;
public class Looping2_reverse {

    public static void main(String[] args) {
        Scanner looping2 = new Scanner (System.in);
        System.out.print("Masukan angka : ");
        int angka = looping2.nextInt();
        
        for (int i=angka;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
       
    }
}
