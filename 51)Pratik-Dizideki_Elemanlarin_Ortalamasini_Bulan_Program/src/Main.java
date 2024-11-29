public class Main {
    public static void main(String[] args) {
        int[] numbers = {88,89,90,87,86};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum / numbers.length);
    }
}