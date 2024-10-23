public class Ogrenci {

String ogrenciAdi,ogrenciNo;
int sinif;
Kurs mat;
Kurs fizik;
Kurs kimya;
double ortalama;
boolean gectiMi;

Ogrenci(String ogrenciAdi, String ogrenciNo, int sinif,Kurs mat,Kurs fizik,Kurs kimya) {
    this.ogrenciAdi = ogrenciAdi;
    this.ogrenciNo = ogrenciNo;
    this.sinif = sinif;
    this.mat = mat;
    this.fizik = fizik;
    this.kimya = kimya;
    ortalamaHesabi();
    this.gectiMi = false;
}
public void addSinavNotlari(int mat, int fizik, int kimya) {
    if (mat >= 0 && mat <= 100) {
        this.mat.not = mat;
    }

    if (fizik >= 0 && fizik <= 100) {
        this.fizik.not = fizik;
    }

    if (kimya >= 0 && kimya <= 100) {
        this.kimya.not = kimya;
    }
}
    public void gectiMi() {

        if (this.mat.not == 0 || this.fizik.not == 0 || this.kimya.not == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.gectiMi = kontrol();
            printNot();
            System.out.println("Ortalama : " + this.ortalama);

            if (this.gectiMi) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void ortalamaHesabi() {
        this.ortalama = (this.fizik.not + this.kimya.not + this.mat.not) / 3;
    }

    public boolean kontrol() {
        ortalamaHesabi();
        return this.ortalama > 55;
    }

    public void printNot(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.ogrenciAdi);
        System.out.println("Matematik Notu : " + this.mat.not);
        System.out.println("Fizik Notu : " + this.fizik.not);
        System.out.println("Kimya Notu : " + this.kimya.not);
    }

}
