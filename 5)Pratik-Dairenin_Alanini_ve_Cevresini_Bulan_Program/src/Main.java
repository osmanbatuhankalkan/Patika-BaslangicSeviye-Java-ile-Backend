import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Merkez açısının ölçüsünü alfa olarak alacağız.
        double pi = 3.14, alfa, formulAlan, formulCevre, dilimAlan;
        int r;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Yarıçap Değerini Giriniz:");
        r = input.nextInt();

        System.out.println("Lütfen Merkez Açısının Ölçüsünü Giriniz:");
        alfa = input.nextDouble();

        // Dairenin çevresini hesaplayan hesaplayan formül
        formulCevre = (2 * pi * r);

        // Dairenin alanını hesaplayan hesaplayan formül
        formulAlan = (pi * r * r);

        // Daire diliminin alanını hesaplayan formül
        dilimAlan = (pi * r * r * alfa) / 360;

        System.out.println("Dairenin Çevresi: " + formulCevre);
        System.out.println("Dairenin Alanı: " + formulAlan);
        System.out.println("Daire Diliminin Alanı: " + dilimAlan);
    }
}
