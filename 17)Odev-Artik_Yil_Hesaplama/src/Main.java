import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yilKontrol,yilDortKalan,yilYuzKalan,yilDortYuzKalan,yuzunKatiYillar;
        System.out.println("Artık yıl hesaplayan programa Hoş Geldiniz");

        Scanner input = new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz yılı lütfen giriniz...");
        yilKontrol=input.nextInt();

        yilDortKalan =(yilKontrol%4);
        yilYuzKalan =(yilKontrol%100);
        yilDortYuzKalan=(yilKontrol%400);

        if (yilDortYuzKalan==0 && yilYuzKalan==0 && yilKontrol>0){
                System.out.println("Girilen Yıl Değeri:"+yilKontrol+"\nBu bir 'ARTIK YILDIR'.");
        }else if(yilDortKalan==0 && !(yilYuzKalan==0) && yilKontrol>0 ){
            System.out.println("Girilen Yıl Değeri:"+yilKontrol+"\nBu bir 'ARTIK YILDIR'.");
        }else
            System.out.println("Bu bir 'ARTIK YIL DEĞİLDİR'!!!!...");
    }
}
