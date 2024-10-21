import java.util.Scanner;

public class Main {
    static void deseneGoreMetot(int n, int ref, boolean azaliyor) {
        // Önce azalma işlemini yapıyoruz
        System.out.print(n + " ");

        // Eğer azalma devam ediyorsa
        if (n > 0 && azaliyor) {
            deseneGoreMetot(n - 5, ref, true);  // 5 azaltmaya devam
        }
        // Azalma bitince artışa başlıyoruz
        else if (n <= 0) {
            deseneGoreMetot(n + 5, ref, false); // 5 artırmaya başla
        }
        // Artış kısmı ref değerine ulaşana kadar devam ediyor
        else if (!azaliyor && n < ref) {
            deseneGoreMetot(n + 5, ref, false); // 5 artırmaya devam
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Girilmesini istediğiniz 'n' değerini yazınız.");
        int n = input.nextInt();
        deseneGoreMetot(n, n, true);  // Başlangıç değeri olarak n veriliyor
    }
}
