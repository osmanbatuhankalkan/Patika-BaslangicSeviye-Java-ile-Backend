import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double girilenKullaniciDegeri,hesaplanmisDeger;
        double oranOnsekiz=0.18;//0-1000tl %18 kdv 0.18
        double oranSekiz=0.08;//1000 üstü %8 kdv 0.08

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Hesaplanmasını istediğiniz değeri giriniz.");
        girilenKullaniciDegeri = input.nextDouble();
        hesaplanmisDeger=girilenKullaniciDegeri<1000?girilenKullaniciDegeri*oranOnsekiz:girilenKullaniciDegeri*oranSekiz;
        System.out.println("KDV'siz Fiyat:"+girilenKullaniciDegeri+" / "+"KDV Tutarı:"+ hesaplanmisDeger +" / "+"KDV'li Fiyat:"+(girilenKullaniciDegeri+hesaplanmisDeger));
    }
}