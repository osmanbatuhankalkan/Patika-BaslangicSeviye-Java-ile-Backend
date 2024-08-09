import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    double boy,kilo,VKE;
    Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        System.out.println("Girmiş olduğunuz Boy :"+boy);
        System.out.println("Girmiş olduğunuz kilo :"+kilo);

        //VKE Formul
        VKE= (kilo)/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz :"+VKE);

    }
}