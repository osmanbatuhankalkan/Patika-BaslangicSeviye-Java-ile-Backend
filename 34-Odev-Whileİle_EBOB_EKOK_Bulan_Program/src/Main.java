import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen ilk değerinizi giriniz.");
        int n1=input.nextInt();
        System.out.println("Girmiş olduğunuz değer: "+n1);

        System.out.println("Lütfen ikinci değerinizi giriniz.");
        int n2=input.nextInt();
        System.out.println("Girmiş olduğunuz değer: "+n2);
        int ebob=1;
        if(n1>n2){
            System.out.println("n1>n2 işlemi için bu blok çalısmıstır.");
            int i=1;
            while (i<=(n1*n2)){
                if(n1%i==0 && n2%i==0){
                    System.out.println(i);
                     ebob =i;
                }
                i++;
            }
            System.out.println("EBOB İŞLEMİNİN SONUCU: "+ebob);
            System.out.println("EKOK İŞLEMİNİN SONUCU: "+(n1*n2)/ebob);

        } else if (n2>n1) {
            System.out.println("n2>n1 işlemi için bu kod Bloğu Calısmıstır.");
            int i=1;
            while (i<=(n2*n1)){
                if(n1%i==0 && n2%i==0){
                    System.out.println(i);
                    ebob =i;
                }
                i++;
            }
            System.out.println("EBOB İŞLEMİNİN SONUCU: "+ebob);
            System.out.println("EKOK İŞLEMİNİN SONUCU: "+(n1*n2)/ebob);
       }
    }
}