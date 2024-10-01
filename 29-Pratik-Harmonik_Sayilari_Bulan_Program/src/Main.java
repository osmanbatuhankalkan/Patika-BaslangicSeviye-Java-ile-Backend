import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Harmonik Sayımız için n değerini giriniz.");
        int n= input.nextInt();
        double harmonikDeger=0;
        for (double i=1;i<=n;i++){
            harmonikDeger +=(1/i);
        }
        System.out.println("Harmonik değerimizin sonucu: "+harmonikDeger);
    }
}