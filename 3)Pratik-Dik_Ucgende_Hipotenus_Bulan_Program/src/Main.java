import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      int a,b,c,u,ucgeninCevresi,ucgeninAlani;
        Scanner input = new Scanner(System.in);
        System.out.println("a Değerini Giriniz.");
        a= input.nextInt();

        System.out.println("b Değerini Giriniz.");
        b= input.nextInt();

        c = (int) Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüsümüz: "+c);

        //ucgenin çevre uzunluğunun yarısı
        u=(a+b+c)/2;

        ucgeninCevresi=2*u;

        //Alan*Alan=u*(u-a)*(u-b)*(u-c)
        ucgeninAlani=(int)Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Çevresi: "+ ucgeninCevresi +"/"+ "Üçgenin Alanı: "+ ucgeninAlani);
    }
}