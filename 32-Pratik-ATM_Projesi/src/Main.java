import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi, kullaniciSifre, girilenkullaniciAdi, girilenkullaniciSifresi;
        kullaniciAdi = "osmanbatuhankalkan";
        kullaniciSifre = "123sifre";
        int bakiye = 7500, girisHakki = 3, menuTuslamasi, bakiyeCekilen, bakiyeEklenen;

        while (girisHakki > 0) {
            System.out.println("YazBank'a HoşGeldiniz!! Devam Edebilmek İçin Lütfen kullanıcı adı ve şifresini giriniz.");
            System.out.println("Kullanıcı Adınızı giriniz: ");
            girilenkullaniciAdi = input.nextLine();
            System.out.println("Kullanıcı Şifresini giriniz.");
            girilenkullaniciSifresi = input.nextLine();

            if ((kullaniciAdi.equals(girilenkullaniciAdi)) && (kullaniciSifre.equals(girilenkullaniciSifresi))) {
                System.out.println("Giriş işlemi başarılı! Lütfen yapmak istediğiniz işlemi tuşlayınız.");

                //Çıkış yapana kadar menuyu döndürecek
                boolean cikisYapildi = false;
                while (!cikisYapildi) {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yapma");
                    menuTuslamasi = input.nextInt();

                    switch (menuTuslamasi) {
                        case 1:
                            System.out.println("Lütfen Yatırmak İstediğiniz Miktarı Giriniz.");
                            bakiyeEklenen = input.nextInt();
                            bakiye += bakiyeEklenen;
                            System.out.println("Para yatırma sonrası güncel bakiyeniz: " + bakiye);
                            break;

                        case 2:
                            System.out.println("Çekilecek Miktarı Giriniz.");
                            bakiyeCekilen = input.nextInt();
                            if (bakiye >= bakiyeCekilen) {
                                bakiye -= bakiyeCekilen;
                                System.out.println("Para çekme işlemi başarıyla gerçekleşti. Güncel bakiyeniz: " + bakiye + " TL");
                            } else {
                                System.out.println("Yetersiz bakiye.");
                            }
                            break;

                        case 3:
                            System.out.println("Hesabınızda bulunan bakiyeniz: " + bakiye);
                            break;

                        case 4:
                            System.out.println("Çıkış işlemi yapılıyor.");
                            cikisYapildi = true;
                            break;

                        default:
                            System.out.println("Geçersiz tuşlama, lütfen tekrar deneyiniz.");
                            break;
                    }
                }
                break; // Giriş başarılı olduğunda, while(girisHakki > 0) döngüsünden çık
            } else {
                girisHakki--;
                System.out.println("Kullanıcı adı veya şifre hatalı. Kalan giriş hakkı: " + girisHakki);
            }
        }
        if (girisHakki == 0) {
            System.out.println("Giriş hakkınız kalmamıştır. Kartınız bloke olmuştur. Lütfen en yakın şubeye gidiniz.");
        }
    }
}
