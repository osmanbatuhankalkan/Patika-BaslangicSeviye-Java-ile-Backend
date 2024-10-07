
public class Main {
    public static void main(String[] args) {


        int sayiAsal = 0,sayiTemelAsal=0;
        int i=2; //asal sayılar 2 den baslar;
        while (i<100){

            if(i==2 || i==3 || i==5||i==7) {
                    sayiTemelAsal = i;
                    System.out.println("Temel Asal Sayımız:*** " + sayiTemelAsal);
                }

            else if(!(i%2==0 || i%3==0 || i%5==0||i%7==0)){
               sayiAsal=i;

                System.out.println("Asal Sayımız: "+sayiAsal);
            }

            i++;

        }
    }
}