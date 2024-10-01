import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int girilenSayi, basamakSayisi = 0, geciciSayi, kiyaslanacakDeger = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Armstrong sayısını test etmek için lütfen değerinizi giriniz.");
        girilenSayi = input.nextInt();

        // Kaç basamaklı olduğunu bulduğumuz kısım
        geciciSayi = girilenSayi;
        while (geciciSayi != 0) {
            geciciSayi /= 10;
            basamakSayisi++;
        }
        System.out.println("Basamak sayısı: " + basamakSayisi);

        // Basamak kaydırarak rakamların üst değerlerini aldığımız bölüm
        geciciSayi = girilenSayi;
        while (geciciSayi != 0) {
            int ustualinacakSayi = geciciSayi % 10;
            int ustlerToplami = 1;

            // Rakamın basamak sayısı kadar üstünü al
            for (int i = 1; i <= basamakSayisi; i++) {
                ustlerToplami *= ustualinacakSayi;
            }

            kiyaslanacakDeger += ustlerToplami;
            geciciSayi /= 10;
        }

        // Sonuç kontrolü
        if (kiyaslanacakDeger == girilenSayi) {
            System.out.println("Başarılı! Bulmuş olduğumuz değer: " + kiyaslanacakDeger + ". Bu sayı Armstrong sayısıdır.");
        } else {
            System.out.println("Bulmuş olduğunuz değer: " + kiyaslanacakDeger + ". Malesef bu sayı Armstrong sayısı değildir.");
        }
    }
}
