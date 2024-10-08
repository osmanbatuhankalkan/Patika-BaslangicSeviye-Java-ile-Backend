import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci Serisine Hoş Geldiniz.\n"
                +"Lütfen Serinizin kaç elemandan oluşmasını istiyorsanız onu tuşlayınız.");
        int fiboEleman = input.nextInt();
        int basDeger=1,oncekiDeger=0,fibo;

        for (int i=1;i<fiboEleman;i++)
        {
            fibo=(basDeger+oncekiDeger);
            oncekiDeger=basDeger;
            basDeger=fibo;
            System.out.println(i+"."+"fibo :"+fibo);
        }
    }
}