import java.util.Scanner;
public class Main {
    static int asalKontrolMekanizmasi(int deger){
        while(deger >=2) {
            if (deger == 2 || deger == 3 || deger == 5 || deger == 7) {
                System.out.printf("Girmiş olduğunuz değer: " + deger + "'dır/dir." + "ASALDIR.");
            } else if (deger % 2 == 0) {
                System.out.printf("Girmiş olduğunuz değer: " + deger + "'dır/dir." + "ASAL Değildir.");
            } else if (deger % 3 == 0) {
                System.out.printf("Girmiş olduğunuz değer: " + deger + "'dır/dir." + "ASAL Değildir.");
            } else if (deger % 5 == 0) {
                System.out.printf("Girmiş olduğunuz değer: " + deger + "'dır/dir." + "ASAL Değildir.");
            } else if (deger % 7 == 0) {
                System.out.printf("Girmiş olduğunuz değer: " + deger + "'dır/dir." + "ASAL Değildir.");
            } else
                System.out.printf("Girmiş olduğunuz değer: " + deger + "'dır/dir." + "ASALDIR.");

        break;
        }
        return deger;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen asal mı? değil mi? olduğunu öğrenmek istediğiniz değeri giriniz.");
        int deger  =input.nextInt();
        asalKontrolMekanizmasi(deger);

    }
}