import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String sistemAdi,sistemSifresi,kullaniciAdi,kullaniciSifresi;

        sistemAdi="pratikDeneme";
        sistemSifresi="321java";

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Kullanıcı Adınızı Giriniz....");
        kullaniciAdi = input.nextLine();

        System.out.println("Lütfen Şifrenizi Giriniz.....");
        kullaniciSifresi = input.nextLine();

        int tuslanacakSayi;

        if((kullaniciAdi.equals("pratikDeneme")) && (!sistemSifresi.equals(kullaniciSifresi))){
            System.out.println("Şifrenizi Hatalı Girmiş Bulunmaktasınız Şu İşlemleri Yapabilirsiniz." +
                    " 1- Şifreyi Sıfırlamak" +
                    " 2-Çıkış Yapmak" +
                    " Yapmak istediğiniz işlemi Lütfen tuşlayınız !!!!!");
            tuslanacakSayi = input.nextInt();

            input.nextLine();
            switch (tuslanacakSayi) {
                case 1:
                    System.out.println("Yeni Şifrenizi Giriniz.(önceki şifrenizden farklı olmalı....)");
                    String yeniSifre=input.nextLine();

                    if(yeniSifre.equals(sistemSifresi)){
                        System.out.println("Şifre Oluşturulamadı Şifreniz Öncekiyle Aynı, Lütfen Başka Bir Şifre Giriniz....");
                    }
                    else {
                        kullaniciSifresi = yeniSifre;
                        System.out.println("Şifre Oluşturuldu....");
                }
                    break;
                case 2:
                    System.out.println("Çıkış Yapılıyor.....");
                    break;
                default:
                    System.out.println("Hatalı Tuşlama yaptınız.");
            }
        }else if(kullaniciAdi.equals(sistemAdi) && kullaniciSifresi.equals(sistemSifresi)){
            System.out.println("Giriş Başarılı");
        }else
            System.out.println("Eksik yada Hatalı Tuşlama Yaptınız.");
    }
}