import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Lütfen Test etmek istediğiniz değeri giriniz.!!!");
        Scanner input = new Scanner(System.in);

        //girilen değerim
        String kontrolDegeri = input.nextLine();
        System.out.println("Girilen Değer: "+kontrolDegeri);

        //methodla ters çevirdiğim değerim
        String tersDeger= kontrol(kontrolDegeri);
        System.out.println("Girilen değerin Tersi: "+tersDeger);

        if((kontrolDegeri).equals(tersDeger)){
            System.out.println("İşlem Başarıl, Girmiş olduğunuz değer Palindromdur !!!");
        }else {
            System.out.println("Malesef, girdiğiniz değer Palindrom DEĞİLDİR !!!");
        }
    }
        //metotum
    private static String kontrol(String kontrolDegeri) {
        return new StringBuilder(kontrolDegeri).reverse().toString();
    }

}