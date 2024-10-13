import java.util.Scanner;
public class Main {
    static boolean palindromsayiKontrol(int girilenDeger) {
        int degiskenDeger=girilenDeger,basamakSayisi,yeniSayi=0;

        //öncelikle sayının son değerini almak için modunu alacağız(%) aldığımız degeri bir degiskene atayıp,
        // onu yeni bir degere ekleyeceğiz(*),
        // sonra da başta girmiş old degerden bir basamak sileceğiz.(/)

        while (!(degiskenDeger==0)){
            System.out.println("*****************************************************************************************");
            System.out.println("Girmiş Olduğumuz Deger: "+girilenDeger);


            basamakSayisi=degiskenDeger%10;
            System.out.println("Şimdi Tersten okunuşuda aynı mı olacak kontrol edeceğimiz için son basamağını alıyoruz: "+basamakSayisi);

            yeniSayi=(yeniSayi*10)+basamakSayisi;
            System.out.println("Tersten yazımı aynı mı diye kontrol edeceğimiz için, ters çevirdiğimiz kısım: "+yeniSayi);

            degiskenDeger/=10;
            System.out.println("Girilen değerin son basamağı alınıp gerekli işlemler yapıldı. Şimdi bir basamak kaydırma zamanı: "+degiskenDeger);
            System.out.println("Girmiş Olduğumuz Degerin Ters Cevirme İşlemi devam ederkenki son hali: "+yeniSayi);
        }

        if (girilenDeger==yeniSayi){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
        System.out.println("Palindrom Sayi Kontrol Sistemine Hoş geldiniz. Lütfen Test Edilecek Degeri giriniz.");
    int girilenDeger = input.nextInt();
        System.out.println(palindromsayiKontrol(girilenDeger));
    }
}