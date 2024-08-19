import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int girilenSayi,bolunebilenSayiAdeti = 0,tamBolunenSayilarToplami = 0,tamBolunenSayilarimizOrt;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıfırdan Başlayıp Girmiş Olacağınız Sayıya Kadar Olacak, 3'e ve 4'e Tam Bölünen Sayınızın Ortalamasını Hesaplayan Programa Hoşgeldiniz."+
                "\nLüten bir değer giriniz.");
        girilenSayi = input.nextInt();

        for (int i=0;i<=girilenSayi;i++){
            if((i>0) && (i%3==0) && (i%4==0)){
                System.out.println("Tam Bölünebilen Sayı Bulundu Sayınız: "+i);
                tamBolunenSayilarToplami+=i;
                System.out.println("***");
                bolunebilenSayiAdeti++;
            }
        }
        System.out.println("3'e ve 4'e Tam Bölünebilen Sayılar Toplamı: "+tamBolunenSayilarToplami);
        System.out.println("3'e ve 4'e Tam bölünebilen Sayı adeti: "+bolunebilenSayiAdeti);
        tamBolunenSayilarimizOrt = (tamBolunenSayilarToplami/bolunebilenSayiAdeti);
        System.out.println("3'e ve 4'e Tam Bölünebilen Sayıların Ortalaması: "+tamBolunenSayilarimizOrt);
    }
}