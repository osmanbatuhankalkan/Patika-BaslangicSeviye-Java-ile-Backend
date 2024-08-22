import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tabanSayi,ustSayi,usluSayi;
        Scanner input = new Scanner(System.in);

        System.out.println("Taban Değeri Giriniz...");
        tabanSayi=input.nextInt();
        System.out.println("Taban Değer: "+tabanSayi);

        System.out.println("Üst Değeri Giriniz...");
        ustSayi=input.nextInt();
        System.out.println("Taban Değer: "+ustSayi);

        int i=1;
        usluSayi=1;
        while (i<=ustSayi){
            usluSayi =(usluSayi*tabanSayi);
            i++;
        }
        System.out.println("Üslü Sayı Sonucunuz: "+usluSayi);
    }
}