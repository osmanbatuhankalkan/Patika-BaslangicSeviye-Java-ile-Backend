public class Main {
    public static void main(String[] args) {

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        // Başlangıçta min ve max değerlerini dizinin ilk elemanına atanır
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            // Eğer mevcut eleman minimum değerden küçükse, min değeri yerine geçer
            if (i < min) {
                min = i;
            }
            // Eğer mevcut eleman maksimum değerden büyükse, max değeri yerine geçer
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }
}
