import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yıldızlardan(*) oluşacak üçgen yapımının boyutu için lütfen bir sayi giriniz.");

        int n = input.nextInt();
        System.out.println("Girmiş olduğunuz Sayı: "+n);

        for(int i=0;i<n;i++){// girilen "n" kadar döndürür
            for (int j=0;j<(i);j++){ // satır basından mesafe "i" kadar düzenli olarak artar.(bu sefer boşluk sayımız min' den max'a gidecek)
                System.out.print(" ");
            }
            for (int k=0;k<(2*n-1)-(2*i);k++){ // "olusan bu mesafenin bası hangi satıra geldiyse oradan baslar "(2*n-1)-(2*i)" kadar yıldız koyar.(bu sefer yıldız sayımız max' dan min' e gidecek)
                System.out.print("*"); //n sabit değerimiz , i ise düzenli +1 olarak artan değerimiz. bizim de istediğimiz sabit yıldız değerimizden düzenli olarak -2 azaltarak gitmesi.
                // O yüzden (2n-1)-(2i) formulunu kullandık
            }
            System.out.println();
        }
    }
}