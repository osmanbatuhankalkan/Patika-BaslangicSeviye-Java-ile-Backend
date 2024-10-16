import java.util.Scanner;
public class Main {
    static int fibo(int n){
        if (n==1||n==2){
            //1 1 2 3 5 8 13 21
            //bu 1 1 nin mantığından dolayı ıf de n1 ve n2 yi 1 olarak döndürüyoruz.
            //f(n)=f(n-1)+f(n-2)
            //f(6)=f(5)+f(4)
            //f(5)=f(4)+f(3)
            //f(4)=f(3)+f(2)
            //f(3)=f(2)+f(1)
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bulmak istediğiniz fibonacci degerini giriniz.");
        int n =input.nextInt();
        System.out.println(fibo(n));
    }
}