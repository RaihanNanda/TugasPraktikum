
import java.util.Scanner;


public class Main {
    public static void main (String [] args){
    System.out.println("1. Bujur Sangkar");
    System.out.println("2. Persegi Panjang");
    System.out.println("Isikan Pilihan");
    
    Scanner sc = new Scanner(System.in);
    int pilihan = sc.nextInt();
    
    if(pilihan == 1){
        BujurSangkar bs = new BujurSangkar(10);
        System.out.println(bs);
    }
    if(pilihan == 2){
        PersegiPanjang pp = new PersegiPanjang(5, 10);
        System.out.println(pp);
     }
    }  
}
