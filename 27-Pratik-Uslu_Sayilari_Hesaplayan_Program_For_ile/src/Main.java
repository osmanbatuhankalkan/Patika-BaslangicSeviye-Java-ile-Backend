import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tabanSayi,ustSayi,usluSayi;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Taban Değerinizi Giriniz.");
        tabanSayi = input.nextInt();
        System.out.println("Taban Değeriniz: "+tabanSayi);

        System.out.println("Lütfen Ust Değerinizi Giriniz.");
        ustSayi = input.nextInt();
        System.out.println("Ust Değeriniz: "+ustSayi);

        usluSayi=1;

        for (int i=1;i<=ustSayi;i++){
            usluSayi =(tabanSayi*usluSayi);
        }
        System.out.println("Ustlu ifadeleriniz Sonucu: "+usluSayi);
    }
}