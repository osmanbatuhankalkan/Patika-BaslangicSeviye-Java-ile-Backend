import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] Dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println("Lütfen bir sayı giriniz.");
        Scanner input = new Scanner(System.in);

        int girilenDeger = input.nextInt();

        int girilendenKucuk = Integer.MAX_VALUE; // Büyük bir başlangıç değeri
        int girilendenBuyuk = Integer.MIN_VALUE; // Küçük bir başlangıç değeri

        // Kontrol değerleri
        boolean kucukBulundu = false;
        boolean buyukBulundu = false;

        for (int i : Dizi) {
            if (i < girilenDeger) {

                // Girilen sayıdan küçük en yakın değeri bul
                if (!kucukBulundu || (girilenDeger - i) < (girilenDeger - girilendenKucuk)) {
                    girilendenKucuk = i;
                    kucukBulundu = true;
                }
            }
            if (i > girilenDeger) {
                // Girilen sayıdan büyük en yakın değeri bul
                if (!buyukBulundu || (i - girilenDeger) < (girilendenBuyuk - girilenDeger)) {
                    girilendenBuyuk = i;
                    buyukBulundu = true;
                }
            }
        }
        System.out.println("Girilen Sayı: " + girilenDeger);
        if (kucukBulundu) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + girilendenKucuk);
        } else {
            System.out.println("Girilen sayıdan küçük bir değer bulunamadı.");
        }

        if (buyukBulundu) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + girilendenBuyuk);
        } else {
            System.out.println("Girilen sayıdan büyük bir değer bulunamadı.");
        }
    }
}
