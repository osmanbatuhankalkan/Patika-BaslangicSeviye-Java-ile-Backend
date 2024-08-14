import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ay,gun;
        Scanner input = new Scanner(System.in);
        System.out.println("Burç Bulma Programına Hoşgeldiniz. Lütfen sizden istenen bilgileri eksiksiz ve doğru giriniz.");

        System.out.println("Lütfen doğduğunuz ayı giriniz.");
        ay =input.nextInt();
        System.out.println("Lütfen doğduğunuz günü giriniz.");
        gun =input.nextInt();

        if (ay<=12 && gun<=31){

            if((ay==12 && gun>=22)||(ay==1 && gun<=21)){
                System.out.println("Oğlak Burcu");

            }else if((ay==1 && gun>=22)||(ay==2 && gun<=19)){
                System.out.println("Kova Burcu");

            }else if((ay==2 && gun>=20)||(ay==3 && gun<=20)){
                System.out.println("Balık Burcu");

            }else if((ay==3 && gun>=21)||(ay==4 && gun<=20)){
                System.out.println("Koç Burcu");

            }else if((ay==4 && gun>=21)||(ay==5 && gun<=21)){
                System.out.println("Boğa Burcu");

            }else if((ay==5 && gun>=22)||(ay==6 && gun<=22)){
                System.out.println("İkizler Burcu");

            }else if((ay==6 && gun>=23)||(ay==7 && gun<=22)){
                System.out.println("Yengeç Burcu");

            }else if((ay==7 && gun>=23)||(ay==8 && gun<=22)){
                System.out.println("Aslan Burcu");

            }else if((ay==8 && gun>=23)||(ay==9 && gun<=22)){
                System.out.println("Başak Burcu");

            }else if((ay==9 && gun>=23)||(ay==10 && gun<=22)){
                System.out.println("Terazi Burcu");

            }else if((ay==10 && gun>=23)||(ay==11 && gun<=21)){
                System.out.println("Akrep Burcu");

            }else if((ay==11 && gun>=22)||(ay==12 && gun<=21)){
                System.out.println("Yay Burcu");
            }else{
                System.out.println("Eksik yada hatalı tuşlama yaptınız");
            }
        }else {System.out.println("Hatalı Ay yada Gün girdiniz.");
        }
    }
}