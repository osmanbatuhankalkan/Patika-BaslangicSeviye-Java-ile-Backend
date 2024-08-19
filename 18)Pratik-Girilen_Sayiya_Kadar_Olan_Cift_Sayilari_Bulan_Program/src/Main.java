import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int girilenSayi;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 0 dan başlayıp hangi sayıya kadar olan çift sayıları bulmak istiyorsanız, o sayıyı giriniz.");
        girilenSayi = input.nextInt();

        for (int i=0;i<=girilenSayi;i++){
          if(i%2==0){
              System.out.println("Çift Sayılarınız: "+i);
            }
        }
    }
}