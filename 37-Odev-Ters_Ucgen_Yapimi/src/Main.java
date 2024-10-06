import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Yıldızlar(*) ile Ekrana Ters Ucgen Cizen Program'a Hoş Geldiniz.");

        System.out.println("Lütfen basamak sayınısı giriniz: ");
        int basamakSayisi= input.nextInt();
        String yildizSembolu="*";

        int sayacDeger=basamakSayisi;
        for (int i=1;i<=basamakSayisi;i++){//döngü tekrarım

            for (int j=1;j<=sayacDeger;j++){//yıldız tekrarım
                System.out.print(yildizSembolu);
            }
            System.out.println();// Her satırdan sonra yeni bir satıra geçmesi için
            sayacDeger--;//her adımda 1 yıldız eksildiği için
        }
    }
}