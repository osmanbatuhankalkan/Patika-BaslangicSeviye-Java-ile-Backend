import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1-100 arasındaki Sayilari Tahmin Etmeye Calisilan, Oyun boyunca 5 kez tahmin hakkimizin oldugu," +
                " Sayi tahmin Oyununa Hoşgeldiniz");
        int randomSayi = (int) (Math.random() * 100);
        System.out.println("Test İcin Urettigimiz Random Sayi:" + randomSayi);


        int oyunHakki=5;
        while(oyunHakki>0){

            System.out.println("Lütfen tahmin ettiginiz Sayiyi Tuslayiniz.");
            Scanner input = new Scanner(System.in);
            int tahminEdilenSayi = input.nextInt();

            if(tahminEdilenSayi<0 || tahminEdilenSayi>100){
                System.out.println("Lütfen Sizdem istenilen Sayi Aralıgında, sayi tahmin tuslamanizi yapınız.(1-100)");
            }
            if (tahminEdilenSayi==randomSayi){
                System.out.println("Tebrikler! Doğru tahmini yaptınız.... <3");
                break;
            }else{
                System.out.println("Malesef, Tahmininizde doğru sonuca ulaşamadınız. :( ");
                if (tahminEdilenSayi>randomSayi){
                    System.out.println("Tahmin ettiğiniz sayi, Bulmaya Calıştığınız sayıdan büyüktür. Daha küçük bir sayi girerek tekrar dene !");
                }else {
                    System.out.println("Tahmin ettiğiniz sayi, Bulmaya Calıştığınız sayıdan küçüktür. Daha büyük bir sayi girerek tekrar dene !");
                }
                oyunHakki--;
            }
            System.out.println("Kalan Oyun Hakkı Sayısı: "+oyunHakki);

        }
        System.out.println("Yeterli Oyun Hakkınız Kalmamıştır. Oturum Sonlandırılıyor...");
    }
}