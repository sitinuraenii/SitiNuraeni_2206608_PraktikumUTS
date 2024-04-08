package uts4_balokk;
import java.util.Scanner;
class Balok{
    int panjang;
    int lebar;
    int tinggi;
    public Balok (){    
    }
    public Balok(int panjangBaru,int lebarBaru, int tinggiBaru )
        { 
            this.panjang=panjangBaru;
            this.lebar=lebarBaru;
            this.tinggi=tinggiBaru;
        }
    int getLuas(){
        return 2 * ((panjang * lebar)+ (panjang * tinggi)+ (lebar * tinggi) );
    }
    int getKeliling(){
        return 4 * (panjang + lebar + tinggi);
    }
    int getVolume(){
        return panjang * lebar * tinggi;
    }
    public void setPanjang(int panjangBaru){
        panjang=panjangBaru;
    }
    public void setLebar(int lebarBaru){
        lebar=lebarBaru;
    }
    public void setTinggi(int tinggiBaru){
        tinggi=tinggiBaru;
    }
}
public class Uts4_balokk {

    public static void main(String[] args) {
        Scanner balok = new Scanner(System.in);
        
        System.out.print("Masukan panjang : ");
        int panjang=balok.nextInt();
        System.out.print("Masukan lebar : ");
        int lebar=balok.nextInt();
        System.out.print("Masukan tinggi : ");
        int tinggi=balok.nextInt();
        
        Balok hitung = new Balok(panjang, lebar, tinggi);
        
         System.out.println("Balok dengan panjang : " + panjang + "," + " lebar : " + lebar + "," + " tinggi : " + tinggi + ".");
         System.out.print("Luasnya : " + hitung.getLuas() + "," + " sedangkan Kelilingnya : " + hitung.getKeliling() +"," + " Volumenya : " 
         + hitung.getVolume()+"\n" );
    }   
}
