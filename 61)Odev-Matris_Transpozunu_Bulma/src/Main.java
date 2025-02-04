import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int satir = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int sutun = scanner.nextInt();

        int[][] matris = new int[satir][sutun];

        System.out.println("Matrisin elemanlarını giriniz:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        int[][] transpoz = new int[sutun][satir];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("\nOrijinal Matris:");
        yazdirMatris(matris);

        System.out.println("\nTranspoz Matris:");
        yazdirMatris(transpoz);
    }

    private static void yazdirMatris(int[][] matris) {
        for (int[] satir : matris) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
    }
}
