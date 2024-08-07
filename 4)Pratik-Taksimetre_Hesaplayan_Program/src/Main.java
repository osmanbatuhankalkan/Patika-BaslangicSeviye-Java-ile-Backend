import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //gidilen mesafe KM üzerinden hesaplanmaktadır.

        double kmbasinaUcret = 2.20;
        double gidilenMesafe;


        int acilisUcreti = 10, minOdemeTutari = 20;
        int toplamUcret;

        System.out.println("Lütfen gidilen yada gidilecek mesafeyi(KM) giriniz...");
        Scanner input = new Scanner(System.in);
        gidilenMesafe = input.nextInt();

        toplamUcret = (int) (acilisUcreti + (kmbasinaUcret * gidilenMesafe));
        System.out.println((toplamUcret > 20 ? toplamUcret : minOdemeTutari) + "TL");

    }
}