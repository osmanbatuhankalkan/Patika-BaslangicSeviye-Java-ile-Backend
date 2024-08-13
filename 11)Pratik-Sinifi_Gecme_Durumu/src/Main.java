import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematikNotu,fizikNotu,turkceNotu,kimyaNotu,muzikNotu,notlarToplami = 0;
        double ortlamaHesabi;

        Scanner input = new Scanner(System.in);
        System.out.println("Sınıf Geçme Durumunu Kontrol Merkezine Hosgeldiniz... Sayın kullanıcımız gireceğiniz değerlerin 0-100 arasında olmasına dikkat ediniz !!!");

        System.out.println("Lütfen Matematik notunuzu giriniz.....");
        matematikNotu=input.nextInt();
        if(0<=matematikNotu && matematikNotu<=100){
            notlarToplami+=matematikNotu;
        }else System.out.println("Hatalı Değer girdiniz, gireceğiniz değerlerin 0-100 arasında olmasına dikkat ediniz...");

        System.out.println("Lütfen Fizik notunuzu giriniz.....");
        fizikNotu=input.nextInt();
        if(0<=fizikNotu && fizikNotu<=100){
            notlarToplami+=fizikNotu;
        }else System.out.println("Hatalı Değer girdiniz, gireceğiniz değerlerin 0-100 arasında olmasına dikkat ediniz...");

        System.out.println("Lütfen Turkce notunuzu giriniz.....");
        turkceNotu=input.nextInt();
        if(0<=turkceNotu && turkceNotu<=100){
            notlarToplami+=turkceNotu;
        }else System.out.println("Hatalı Değer girdiniz, gireceğiniz değerlerin 0-100 arasında olmasına dikkat ediniz...");

        System.out.println("Lütfen Kimya notunuzu giriniz.....");
        kimyaNotu=input.nextInt();
        if(0<=kimyaNotu && kimyaNotu<=100){
            notlarToplami+=kimyaNotu;
        }else System.out.println("Hatalı Değer girdiniz, gireceğiniz değerlerin 0-100 arasında olmasına dikkat ediniz...");

        System.out.println("Lütfen Muzik notunuzu giriniz.....");
        muzikNotu=input.nextInt();
        if(0<=muzikNotu && muzikNotu<=100){
            notlarToplami+=muzikNotu;
        }else System.out.println("Hatalı Değer girdiniz, gireceğiniz değerlerin 0-100 arasında olmasına dikkat ediniz...");

        ortlamaHesabi=(notlarToplami)/5;

        if (ortlamaHesabi<55){
            System.out.println("Ortalamanız: "+ortlamaHesabi+"  "+
                    "Üstün çalışma azminiz ve hırsınız yeterli değildir, Lütfen Seneye tekrar gelip şansınızı deneyiniz.");
        }else {
            System.out.println("Ortalamanız: "+ortlamaHesabi+"  "+
                    "Tebrikler Sınıfı Geçtiniz.");
        }
    }
}