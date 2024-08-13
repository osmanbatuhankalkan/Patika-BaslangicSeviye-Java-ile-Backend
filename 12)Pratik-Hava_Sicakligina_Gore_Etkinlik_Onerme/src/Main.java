import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int havaSicaklik,otomasyonSicaklik;

        System.out.println("Etkinlik Önerme Sistemine Hoşgeldiniz....\n " +
                "Sıcaklık 5 dereceden den küçük ise '1' numarasını tuşlayınız.\n " +
                "Sıcaklık 25 dereceden den büyük ise '2' numarasını tuşlayınız.\n " +
                "Sıcaklık 5 ile 25 derece arasındaysa '3' numarasını tuşlayınız.");

        Scanner input = new Scanner(System.in);
        otomasyonSicaklik=input.nextInt();

        switch (otomasyonSicaklik){
            case 1:
                    System.out.println("Şuan yapabileceğiniz en iyi etkinlik 'KAYAK'tır.");
                break;
            case 2:
                    System.out.println("Şuan yapabileceğiniz en iyi etkinlik 'YÜZME'dir.");
                 break;
            case 3:
                System.out.println("Lütfen Sıcaklık değerinizi Giriniz.");
                havaSicaklik = input.nextInt();
                System.out.println("Girmiş olduğunuz Sıcaklık Değeri:"+havaSicaklik+" Derecedir."+" "+
                        "Size Uygun Seçeneği en kısa sürede bulacağım...");

                if (5<=havaSicaklik && havaSicaklik<15){
                    System.out.println("Şuan yapabileceğiniz en iyi etkinlik 'Sinema'dır.");

                } else if (havaSicaklik>=15 && havaSicaklik<25) {
                    System.out.println("Şuan yapabileceğiniz en iyi etkinlik 'Piknik'dir.");

                }else System.out.println("Şuan yapabileceğiniz en iyi etkinlik 'YÜZME'dir.");
                break;
            default:
                System.out.println("Hatalı Tuşlama Yaptınız Tekrar Deneyiniz....");
                break;
        }
    }
}