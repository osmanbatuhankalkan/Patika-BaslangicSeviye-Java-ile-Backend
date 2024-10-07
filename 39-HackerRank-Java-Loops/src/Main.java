import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hangi Sayının çarpım sonucu görmek istiyorsanız o değeri giriniz.");
        int girilenSayi =input.nextInt();
        int carpimSonuc;

        for (int i=1;i<=10;i++){
            carpimSonuc =(i*girilenSayi);
            System.out.println(i+")"+" "+girilenSayi+"x"+i+"= "+carpimSonuc);
        }
    }
}

/*
HakerRank'in kabul ettiği şekil :

* import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int girilenSayi =input.nextInt();
        int carpimSonuc;

        for (int i=1;i<=10;i++){
            carpimSonuc =(i*girilenSayi);
            System.out.println(girilenSayi+" x "+i+" = "+carpimSonuc);
        }
    }
}
* */