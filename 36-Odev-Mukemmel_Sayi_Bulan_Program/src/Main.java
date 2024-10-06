import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mükemmel Sayı Bulan Programa Hoş Geldiniz."+"Lütfen bir değer giriniz.");
        int sayi=input.nextInt();
        int testDeger=0;
        for (int i=1;i<sayi;i++){
            if(sayi%i==0){
                testDeger +=i;
            }
        }
        if (sayi==testDeger){
            System.out.println(testDeger+ " "+" Mükemmel Sayidir.");
        }else System.out.println(sayi+" "+"Malesef! Mükemmel Sayi Değildir.");

    }
}