public class Kurs {

    Ogretmen ogretmen;

    String kursAdi;
    int dersKodu;
    String bolum;
    int not;

   public Kurs(String kursAdi, int dersKodu, String bolum) {
        this.kursAdi = kursAdi;
        this.dersKodu = dersKodu;
        this.bolum = bolum;
        this.not = 0;
    }
   public void addOgretmen(Ogretmen h) {
       if (this.bolum.equals(h.alan)){//Burada ki bolum ile Ogretmen sınıfındaki alan ismi aynı mı ? equals ile kontrol ediyoruz. Eğer doğru ise ekleme başarılı
           this.ogretmen = h;
           System.out.println("İşlem Başarılı");
       }else {
           System.out.println(h.ogretmenAdi +"Akademisyen bu dersi veremez.");//Eğer Değil ise ders verilemez.
       }
    }
//    public void printOgretmen() {
//        if(ogretmen != null) {
//            System.out.println(this.kursAdi + "dersinin Akademisyeni: "+ogretmen.ogretmenAdi);
//        }else {
//            System.out.println(this.kursAdi + "dersinin Akademisyeni Atanmamıştır.");
//        }
//    }

}
