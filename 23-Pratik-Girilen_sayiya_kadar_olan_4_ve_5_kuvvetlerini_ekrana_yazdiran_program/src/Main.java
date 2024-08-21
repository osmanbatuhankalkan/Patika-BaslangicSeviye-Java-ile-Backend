import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int girilenSayi;
        System.out.println("4 ve 5'in kuvvetlerini ekrana yazdıran programa hoş geldiniz."+
                "\nLütfen bir sayı giriniz.");
        Scanner input = new Scanner(System.in);
        girilenSayi = input.nextInt();

        for(int i=1;i<=girilenSayi;i*=4){
            System.out.println("4'ün kuvvetleri: "+i);
        }
        System.out.println("****************");
        for(int i=1;i<=girilenSayi;i*=5){
            System.out.println("5'in kuvvetleri: "+i);
        }
    }
}