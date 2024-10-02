import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yıldızlardan(*) oluşacak üçgen yapımının boyutu için lütfen bir sayi giriniz.");

        int n = input.nextInt();
        System.out.println("Girmiş olduğunuz Sayı: "+n);

        for(int i=0;i<=n;i++){// girilen "n" kadar döndürür
            for (int j=0;j<(n-i);j++){ // "n-i" kadar satır basından bosluk verir.
                System.out.print(" ");
            }
            for (int k=1;k<(2*i+1)-1;k++){ // "2i+1" kadar yıldız koyar.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}