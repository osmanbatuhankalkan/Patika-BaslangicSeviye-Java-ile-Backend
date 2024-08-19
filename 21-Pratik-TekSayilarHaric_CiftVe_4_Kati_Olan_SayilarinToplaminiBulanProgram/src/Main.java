import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int girilenSayi,ciftsayilarToplami=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Lütfen Sayı Giriniz: ");
            girilenSayi = input.nextInt();
            if ((girilenSayi%4==0)){
                ciftsayilarToplami +=girilenSayi;
            }

        }while (!(girilenSayi%2==1));
        System.out.println("Girilen Tek Sayılar Toplamınız :"+ciftsayilarToplami);
    }
}