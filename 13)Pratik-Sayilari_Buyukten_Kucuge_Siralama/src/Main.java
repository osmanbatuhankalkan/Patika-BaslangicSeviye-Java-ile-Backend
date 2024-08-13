import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz.");
         sayi1 = input.nextInt();

        System.out.println("Lütfen sayı giriniz.");
        sayi2 = input.nextInt();

        System.out.println("Lütfen sayı giriniz.");
        sayi3 = input.nextInt();

        if (sayi1>sayi2 && sayi1>sayi3)
        {
            if (sayi2>sayi3)
            {System.out.println("Sayi1:"+ sayi1+"\n"+"Sayi2:"+ sayi2+"\n"+"Sayi3:"+ sayi3+"\n"
                +sayi1+">"+sayi2+">"+sayi3);

            }else{System.out.println("Sayi1:"+ sayi1+"\n"+"Sayi2:"+ sayi2+"\n"+"Sayi3:"+ sayi3+"\n"
                    +sayi1+">"+sayi3+">"+sayi2);}

        } else if(sayi2>sayi1 && sayi2>sayi3){
            if(sayi1>sayi3){System.out.println("Sayi1:"+ sayi1+"\n"+"Sayi2:"+ sayi2+"\n"+"Sayi3 :"+ sayi3+"\n"
                    +sayi2+">"+sayi1+">"+sayi3);
            }else System.out.println("Sayi1:"+ sayi1+"\n"+"Sayi2:"+ sayi2+"\n"+"Sayi3:"+ sayi3+"\n"
                    +sayi2+">"+sayi3+">"+sayi1);

        }else if(sayi3>sayi1 && sayi3>sayi2){
            if(sayi1>sayi2){System.out.println("Sayi1:"+ sayi1+"\n"+"Sayi2:"+ sayi2+"\n"+"Sayi3:"+ sayi3+"\n"
                    +sayi3+">"+sayi1+">"+sayi2);
            }else System.out.println("Sayi1:"+ sayi1+"\n"+"Sayi2:"+ sayi2+"\n"+"Sayi3:"+ sayi3+"\n"
                    +sayi3+">"+sayi2+">"+sayi1);
        }
    }
}
