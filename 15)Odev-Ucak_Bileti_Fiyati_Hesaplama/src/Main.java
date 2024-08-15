import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas,yolculukTipi;
        double mesafe,biletFiyat,indirimTutari,indirimliToplamFiyat;//(KM)(0,10TL/KM)
        double indirimKucukYas=(0.5),
                indirimGencYas=(0.1),
                indirimIleriYas=(0.3),
                indirimGidisDonus=(0.2);

        System.out.println("Ucus Bileti Hesaplama Programına Hosgeldiniz.");
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Yolculuk Tipinizi seçiniz....(Tek Yön, Gidiş-Dönüş)\n"+
                "1-Tek Yön\n"+
                "2-Gidiş-Dönüş");
        yolculukTipi = input.nextInt();

        switch (yolculukTipi){
            case 1:
                System.out.println("Tek Yön Tarifesini seçmiş bulunmaktasınız, işlemleriniz bu tarife üzerinden hesaplanacaktır.\n"+
                        "Lütfen Gideceğiniz Mesafeyi(KM) Giriniz.");
                mesafe = input.nextDouble();
                biletFiyat=(0.10)*(mesafe);

                System.out.println("İnidirim Tutarınızı ve Toplam ücretinizi öğrenebilmek için lütfen yaşınızı giriniz.");
                yas = input.nextInt();
                System.out.println("Girmiş olduğunuz YAŞ:"+yas);

                if(yas>=0 && yas<=12){
                    indirimTutari=(biletFiyat*indirimKucukYas);
                    indirimliToplamFiyat=(biletFiyat)-(indirimTutari);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:"+biletFiyat+"TL"+"\nİndirim Tutarınız:-"+indirimTutari+"TL"+
                            "\nİndirimli Toplam Fiyatınız:"+indirimliToplamFiyat+"TL");

                }else if(yas>12 && yas<=24){
                    indirimTutari=(biletFiyat*indirimGencYas);
                    indirimliToplamFiyat=(biletFiyat)-(indirimTutari);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:"+biletFiyat+"TL"+"\nİndirim Tutarınız:-"+indirimTutari+"TL"+
                            "\nİndirimli Toplam Fiyatınız:"+indirimliToplamFiyat+"TL");

                }else if(yas>24 && yas<65){
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:"+biletFiyat+"TL");

            }else if(yas>=65){
                    indirimTutari=(biletFiyat*indirimIleriYas);
                    indirimliToplamFiyat=(biletFiyat)-(indirimTutari);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:"+biletFiyat+"TL"+"\nİndirim Tutarınız:-"+indirimTutari+"TL"+
                            "\nİndirimli Toplam Fiyatınız:"+indirimliToplamFiyat+"TL");
                }else
                    System.out.println("Hatalı Veri Girdiniz!!...");
                break;

            case 2:
                System.out.println("Gidiş - Dönüş Tarifesini seçmiş bulunmaktasınız, işlemleriniz bu tarife üzerinden ekstra %10 indirimli hesaplanacaktır.\n"+
                    "Lütfen Gideceğiniz Mesafeyi(KM) Giriniz.");
                mesafe = input.nextDouble();
                biletFiyat=(0.10)*(mesafe);

                System.out.println("İnidirim Tutarınızı ve Toplam ücretinizi öğrenebilmek için lütfen yaşınızı giriniz.");
                yas = input.nextInt();
                System.out.println("Girmiş olduğunuz YAŞ:"+yas);

                if(yas>=0 && yas<=12){
                    indirimTutari=(biletFiyat*indirimKucukYas)+(biletFiyat*indirimGidisDonus);
                    indirimliToplamFiyat=(biletFiyat)-(indirimTutari);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:"+biletFiyat+"TL"+"\nİndirim Tutarınız:-"+indirimTutari+"TL"+
                            "\nİndirimli Toplam Fiyatınız:"+indirimliToplamFiyat+"TL");

                }else if(yas>12 && yas<=24){
                    indirimTutari=(biletFiyat*indirimGencYas)+(biletFiyat*indirimGidisDonus);
                    indirimliToplamFiyat=(biletFiyat)-(indirimTutari);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:"+biletFiyat+"TL"+"\nİndirim Tutarınız:-"+indirimTutari+"TL"+
                            "\nİndirimli Toplam Fiyatınız:"+indirimliToplamFiyat+"TL");

                }else if(yas>24 && yas<65){
                    indirimTutari=(biletFiyat*indirimGidisDonus);
                    indirimliToplamFiyat=(biletFiyat)-(indirimTutari);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:"+biletFiyat+"TL"+"\nİndirim Tutarınız:-"+indirimTutari+"TL"+
                            "\nİndirimli Toplam Fiyatınız:"+indirimliToplamFiyat+"TL");

                }else if(yas>=65){
                    indirimTutari=(biletFiyat*indirimIleriYas);
                    indirimliToplamFiyat=(biletFiyat)-(indirimTutari)+(biletFiyat*indirimGidisDonus);
                    System.out.println("Bilet Fiyatınız mesafenize(KM) göre:"+biletFiyat+"TL"+"\nİndirim Tutarınız:-"+indirimTutari+"TL"+
                            "\nİndirimli Toplam Fiyatınız:"+indirimliToplamFiyat+"TL");
                }else
                    System.out.println("Hatalı Veri Girdiniz!!...");
                break;

            default:
                System.out.println("Eksik yada Hatalı Tuşlama yaptınız Tekrar Deneyiniz....\n"+"Girmiş Olduğunuz değer:"+yolculukTipi);
                break;
        }
    }
}