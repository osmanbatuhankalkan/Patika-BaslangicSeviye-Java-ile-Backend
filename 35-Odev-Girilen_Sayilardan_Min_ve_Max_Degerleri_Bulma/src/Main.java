import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Girilen Sayıların Max ve Min değerlerini bulan Programa Hoş Geldiniz.");
        System.out.println("Lütfen kaç adet sayı gireceğinizi giriniz:");

        int sayiAdeti = input.nextInt();
        //sınır değerler
        int kiyaslanilacakBuyukSayi = Integer.MIN_VALUE;
        int kiyaslanilacakKucukSayi = Integer.MAX_VALUE;

        for (int i = 1; i <= sayiAdeti; i++) {
            System.out.println(i + ". sayıyı giriniz: ");
            int girilenSayi = input.nextInt();
            System.out.println("Girilen " + i + ". sayı: " + girilenSayi);

            // En büyük sayıyı bulma
            if (girilenSayi > kiyaslanilacakBuyukSayi) {
                kiyaslanilacakBuyukSayi = girilenSayi;
            }

            // En küçük sayıyı bulma
            if (girilenSayi < kiyaslanilacakKucukSayi) {
                kiyaslanilacakKucukSayi = girilenSayi;
            }

            System.out.println("Şu ana kadar girilen en büyük sayı: " + kiyaslanilacakBuyukSayi);
            System.out.println("Şu ana kadar girilen en küçük sayı: " + kiyaslanilacakKucukSayi);
        }

        System.out.println("En büyük sayı: " + kiyaslanilacakBuyukSayi);
        System.out.println("En küçük sayı: " + kiyaslanilacakKucukSayi);
    }
}
