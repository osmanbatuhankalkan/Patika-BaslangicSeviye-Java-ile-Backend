import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int girilenSayi;

        System.out.println("Lütfen kaçıncı sayıya kadar ikinin katlarının gitmesini istiyorsanız giriniz...");
        Scanner input = new Scanner(System.in);
        girilenSayi = input.nextInt();

        int i=1;
        while (i<girilenSayi){
            i*=2;
            System.out.println(i);
        }
    }
}