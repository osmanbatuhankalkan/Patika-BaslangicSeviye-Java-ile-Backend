import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int girilenSayi,tekSayilarToplami=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Lütfen Sayı Giriniz: ");
            girilenSayi = input.nextInt();
            if (girilenSayi%2==1){
                tekSayilarToplami +=girilenSayi;
            }

        }while (girilenSayi>0);
            System.out.println("Girilen Tek Sayılar Toplamınız :"+tekSayilarToplami);
    }
}