import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,r,kombinasyon;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 'n' faktoriyel için değerinizi giriniz. ");
        n =input.nextInt();

        int faktoriyelN =1;
        for (int i=1;i<n;i++){
            faktoriyelN+=i*faktoriyelN;
        }
        System.out.println(n+"!"+"(Faktoriyel): "+faktoriyelN);


        System.out.println("Lütfen 'r' faktoriyel için değerinizi giriniz.");
        r=input.nextInt();

        int faktoriyelR=1;
        for (int i=1;i<r;i++){
            faktoriyelR += i*faktoriyelR;
        }
        System.out.println(r+"!"+"(Faktoriyel): "+faktoriyelR);

        System.out.println("Farklardan oluşan Faktoriyelimiz");
        int faktoriyelFark;

        faktoriyelFark = (n-r);
        if (faktoriyelFark>0){
            int faktoriyelF=1;
        for (int i=1;i<faktoriyelFark;i++){
            faktoriyelF +=i*faktoriyelF;
        }
        System.out.println(faktoriyelFark+"!"+"(Faktoriyel): "+faktoriyelF);

            kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelF);
            System.out.println("Kominasyon Formulümüze göre 'C(n,r) = n! / (r! * (n-r)!)': "+kombinasyon);

        }else System.out.println("Eksik yada hatalı değer girdiniz tekrar deneyin.");

    }
}