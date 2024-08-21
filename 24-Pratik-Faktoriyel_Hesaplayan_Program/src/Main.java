import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int hesapFaktoriyel,carpimFaktoriyel=1;

        System.out.println("Lütfen faktöriyel hesabı yapılmasını istediğiniz değeri giriniz:");
        Scanner input = new Scanner(System.in);
        hesapFaktoriyel = input.nextInt();
        

        for (int i =1;i<=hesapFaktoriyel;i++){
            carpimFaktoriyel=(carpimFaktoriyel*i);
            System.out.println("Faktoriyel Açılımınız: "+ carpimFaktoriyel);
        }
    }
}