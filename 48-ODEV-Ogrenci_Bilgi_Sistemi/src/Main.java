public class Main {
    public static void main(String[] args) {

        Kurs mat = new Kurs("Matematik", 101, "MAT");
        Kurs fizik = new Kurs("Fizik", 202, "FZK");
        Kurs kimya = new Kurs("Kimya", 404, "KMY");

        Ogretmen t1 = new Ogretmen("Fırat Hoca", "555111222333", "MAT");
        Ogretmen t2 = new Ogretmen("Osman Hoca", "555111222444", "FZK");
        Ogretmen t3 = new Ogretmen("Batuhan Hoca", "55511122555", "KMY");

        mat.addOgretmen(t1);
        fizik.addOgretmen(t2);
        kimya.addOgretmen(t3);


        Ogrenci s1 = new Ogrenci("Batuhan Batuhanoğlu", "112", 141, mat, fizik, kimya,20,80);
        s1.addSinavNotlari(70,55,80);
        s1.addSozluNotlari(100,100,100);
        s1.gectiMi();

        Ogrenci s2 = new Ogrenci("Ayse AyseKızı", "1453", 333, mat, fizik, kimya,20,80);
        s2.addSinavNotlari(95,90,100);
        s2.addSozluNotlari(50,60,70);
        s2.gectiMi();

        Ogrenci s3 = new Ogrenci("Osman Osmanoğlu", "1190", 213, mat, fizik, kimya,20,80);
        s3.addSinavNotlari(15,40,65);
        s3.addSozluNotlari(100,100,100);
        s3.gectiMi();

    }
}