import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,yapilacakIslem;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk değerinizi giriniz.");
        sayi1 = input.nextInt();

        System.out.println("Lütfen iki'nci değerinizi giriniz.");
        sayi2 = input.nextInt();

        System.out.println("Yapmak istediğinizi işlemi numaralardan seçiniz...."+" "+
                "1-Toplama" +" "+
                "2-Çıkarma" +" "+
                "3-Bölme"  +" "+
                "4-Çarpma");
        yapilacakIslem =input.nextInt();
        switch (yapilacakIslem){
            case 1:
                System.out.println("Toplama İşleminiz Yapılıyor..." +
                        "Sonuc:"+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma İşleminiz Yapılıyor..." +
                        "Sonuc:"+(sayi1-sayi2));
                break;
            case 3: if(sayi2==0){
                System.out.println("Sıfıra Bölüm yapamazsınız !!!!");
            }else
                System.out.println("Bölme İşleminiz Yapılıyor..." +
                        "Sonuc:"+(sayi1/sayi2));
                break;
            case 4:
                System.out.println("Çarpma İşleminiz Yapılıyor..." +
                        "Sonuc:"+(sayi1*sayi2));
                break;
            default:
                System.out.println("Hatalı Tuşlama Yaptınız....!!!!");
        }
    }
}