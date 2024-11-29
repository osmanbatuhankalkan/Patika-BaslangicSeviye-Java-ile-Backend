public class Main {
    public static void main(String[] args) {
        int[] list = {3,5,7,9};
        double sum = 0.0;

        for (int i : list) {
            sum += (i*(1.0/(i*i)));
        }
        double avg =  list.length /sum;
        System.out.println("Dizideki Sayılarınızın harmonik değeri: "+avg);
    }
}