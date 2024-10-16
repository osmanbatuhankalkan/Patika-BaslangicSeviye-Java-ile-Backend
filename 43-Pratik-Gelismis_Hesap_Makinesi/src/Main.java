import java.util.Scanner;
public class Main {
    static int toplam(int a,int b){
        int sonuc = a+b;
        System.out.println("Toplama işleminizin sonucu: "+sonuc);
        return sonuc;
    }
    static int cikarma(int a,int b){
        int sonuc = a-b;
        System.out.println("Çıkarma işleminizin sonucu: "+sonuc);
        return sonuc;
    }
    static int carpma(int a,int b){
        int sonuc = a*b;
        System.out.println("Çarpma işleminizin sonucu: "+sonuc);
        return sonuc;
    }
    static int bolme(int a,int b){
        if (b==0){
            System.out.println("Bir Sayı Sıfıra bölünemez tekrar deneyiniz.");
            return 0;
        }
        int sonuc = a/b;
        System.out.println("Bölme işleminizin sonucu: "+sonuc);
        return sonuc;
    }
    static int usluAlma(int a,int b){
       int sonuc=1;
        for (int i=1;i<=b;i++){
           sonuc *=a;
       }
        System.out.println("Üslü Alma işleminizin sonucu: "+sonuc);
       return sonuc;
    }
    static int faktoriyel(int a){
        int sonuc =1;
        for(int i=1;i<=a;i++){
        sonuc*=i;
        }
        System.out.println("Faktoriyel işleminizin sonucu: "+sonuc);
        return sonuc;
    }
    static int modAlma(int a,int b){
        int sonuc = a%b;
        System.out.println("Mod Alma işleminizin sonucu: "+sonuc);
        return sonuc;
    }
    static void  dikdortgenAlanVeCevreHesabi(int a,int b){
       int cevre=2*(a+b);
       int alan=(a*b);
        System.out.println("Çevresi: "+cevre);
        System.out.println("Alanı: "+ alan);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hesapMakFonk ="1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n"+
                "0- Çıkış Yap";

        while (true){
            System.out.println("=========================================================");
            System.out.println(hesapMakFonk);
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
            int secilenFonk= input.nextInt();

            if (secilenFonk==0){
                System.out.println("Oturum Sonlandırılıyor.");
                break;
            }

            System.out.println("Lütfen ilk degerinizi giriniz.");
            int a=input.nextInt();

            System.out.println("Lütfen ikinci degerinizi giriniz.");
            int b=input.nextInt();

            switch (secilenFonk){

                case 1:toplam(a,b);
                    break;

                case 2:cikarma(a,b);
                    break;
                case 3:carpma(a,b);
                    break;
                case 4:bolme(a,b);
                    break;
                case 5:usluAlma(a,b);
                    break;
                case 6:faktoriyel(a);
                    break;
                case 7:modAlma(a,b);
                    break;
                case 8:dikdortgenAlanVeCevreHesabi(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz :");
            }

        }
    }
}