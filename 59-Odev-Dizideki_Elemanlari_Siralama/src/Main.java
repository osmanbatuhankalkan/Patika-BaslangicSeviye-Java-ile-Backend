import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dizi için bir boyut giriniz.");
        int diziBoyutu  = input.nextInt();

        int[] dizi = new int[diziBoyutu];

        for (int i = 0; i < diziBoyutu; i++) {
            System.out.println("Dizinin elemanlarını giriniz.");

                int eleman = input.nextInt();
                dizi[i] = eleman;
            System.out.println(i+1+"."+"Elemanı: "+dizi[i]);
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
    }
}