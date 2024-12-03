import java.util.Arrays;

public class Main {
    static boolean sinirla(int[]arr, int deger) {
        for(int i:arr){
            if(i==deger){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] karmaSayilar={1,2,3,4,5,5,6,7,7,8,9,32,32,33,45,86,97,66,66,66,3456,7543};//*5*7*32*66

        int[] ciftDegerRef= new int[karmaSayilar.length];
        //en baştan tek olanları eleyip çift olanları işleme alacağım şekilde atama yaptım
        for (int i = 0; i < karmaSayilar.length; i++) {
          if(karmaSayilar[i]%2==0){
              ciftDegerRef[i]=karmaSayilar[i];
          }
        }

        int[] refDeger= new int[karmaSayilar.length];
        int sayac=0;
        //Bu kısımda da önceki örneğimdeki gibi tekrar eden sayıları bulan yapı. Ama artık veriler ciftDegerRef' ten geldiği için sadece çift tekrar edenleri bulacak.
        for (int i=0;i<ciftDegerRef.length;i++){
            for(int j=0;j<ciftDegerRef.length;j++){
                if((i!=j)&&(ciftDegerRef[i]==ciftDegerRef[j])){//i döngüsü en başta olan '1' degerini alcak.i=1 'i, j döngüsü tüm seriyi tek tek deneyecek eşleşen değerler içeri alıncak, sonra sıradaki olan değeri i=2 için aynı böyle devam edecek.
                    if (!sinirla(refDeger,ciftDegerRef[i])){
                        refDeger[sayac++]=ciftDegerRef[i];
                    }
                    break;
                }
            }
        }
        for(int deger:refDeger){
            if(deger!=0){
                System.out.print(deger+" ");
            }
        }
    }
}