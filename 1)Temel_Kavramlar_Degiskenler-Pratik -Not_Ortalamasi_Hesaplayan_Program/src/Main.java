import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
      int matematik_notu,fizik_notu,kimya_notu,turkce_notu,tarih_notu,muzik_notu;
      double toplamDeger_Ortalamasi;

      String g="GEÇTİ",k="KALDI";

        Scanner toplamDeger = new Scanner(System.in);
        System.out.println("Lütfen Matematik Notunu Giriniz!");
        matematik_notu = toplamDeger.nextInt();
        System.out.println("Lütfen Kimya Notunu Giriniz!");
        kimya_notu = toplamDeger.nextInt();
        System.out.println("Lütfen Fizk Notunu Giriniz!");
        fizik_notu = toplamDeger.nextInt();
        System.out.println("Lütfen Türkçe Notunu Giriniz!");
        turkce_notu = toplamDeger.nextInt();
        System.out.println("Lütfen Tarih Notunu Giriniz!");
        tarih_notu = toplamDeger.nextInt();
        System.out.println("Lütfen Müzik Notunu Giriniz!");
        muzik_notu = toplamDeger.nextInt();

        toplamDeger_Ortalamasi = (matematik_notu+fizik_notu+kimya_notu+tarih_notu+turkce_notu+muzik_notu)/6;
      System.out.println(toplamDeger_Ortalamasi>60?g:k);
    }
}