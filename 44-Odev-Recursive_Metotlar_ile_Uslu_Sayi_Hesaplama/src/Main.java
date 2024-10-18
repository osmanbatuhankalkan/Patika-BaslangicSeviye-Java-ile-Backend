import java.util.Scanner;
public class Main {
    static int usluMethod(int a, int b) {
        int sonuc=1;
        for (int i=1;i<=b;i++) {
            sonuc*=a;
            System.out.println(i+"."+"üslü sayınızın değeriz:" +sonuc);
        }
        return sonuc;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen taban değerini Giriniz.");
        int a = input.nextInt();
        System.out.println("Girmiş olduğunuz taban değeri."+a);

        System.out.println("Lütfen üst değerini Giriniz.");
        int b = input.nextInt();
        System.out.println("Girmiş olduğunuz üslü değer."+b);

        System.out.println(usluMethod(a,b));

    }
}