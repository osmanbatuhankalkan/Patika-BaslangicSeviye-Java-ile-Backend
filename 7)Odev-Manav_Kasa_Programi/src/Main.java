import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        double secilenKiloArmut,secilenKiloElma,secilenKiloDomates,secilenKiloMuz,secilenKiloPatlican,toplamTutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen almış olduğunuz ürünlerin KG olarak değerlerini giriniz.");

        System.out.println("Kaç Kilo Armut aldıysanız tuşlayınız...");
        secilenKiloArmut=input.nextDouble();
        System.out.println("Kaç Kilo Armut: "+secilenKiloArmut+"KG");

        System.out.println("Kaç Kilo Elma aldıysanız tuşlayınız...");
        secilenKiloElma=input.nextDouble();
        System.out.println("Kaç Kilo Elma: "+secilenKiloElma+"KG");

        System.out.println("Kaç Kilo Domates aldıysanız tuşlayınız...");
        secilenKiloDomates=input.nextDouble();
        System.out.println("Kaç Kilo Domates: "+secilenKiloDomates+"KG");

        System.out.println("Kaç Kilo Muz aldıysanız tuşlayınız...");
        secilenKiloMuz=input.nextDouble();
        System.out.println("Kaç Kilo Muz: "+secilenKiloMuz+"KG");

        System.out.println("Kaç Kilo Patlican aldıysanız tuşlayınız...");
        secilenKiloPatlican=input.nextDouble();
        System.out.println("Kaç Kilo Patlican: "+secilenKiloPatlican+"KG");

        toplamTutar=(armut*secilenKiloArmut)+(elma*secilenKiloElma)+(domates*secilenKiloDomates)+(muz*secilenKiloMuz)+(patlican*secilenKiloPatlican);
        System.out.println("Toplam tutar"+toplamTutar+"TL");

    }
}