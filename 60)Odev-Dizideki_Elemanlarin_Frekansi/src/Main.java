import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen sayı örüntüsü kaç adet sayı yada rakamdan oluşacaksa tuşlayınız.");
        Scanner input = new Scanner(System.in);
        int adet= input.nextInt();

        //kullanıcıdan aldığım inputla dizi sınırımı belirledim.
        int[] sayiOruntusu = new int[adet];

        //belirlenen sınır kadar değeri aldım, dizime yazdırdım.
        for (int i = 0; i < adet; i++) {
            sayiOruntusu[i] = input.nextInt();
        }
        //küçükten büyüge sıraladım.
        Arrays.sort(sayiOruntusu);

        //frekansını ölçtüğüm kısım
        int i=0;
        while (i<adet) {
            int sayi = sayiOruntusu[i];
            int sayac =0;

            while(i<adet && sayi==sayiOruntusu[i]) {
                sayac++;
                i++;
            }
            System.out.println("Girmiş olduğunuz"+" "+sayi+" "+"Degeri"+"Kendisini"+" "+ sayac+ " "+"kere tekrar etiştir.");
        }
    }
}