public class Ogrenci {

    String ogrenciAdi,ogrenciNo;
    int sinif;

    Kurs mat;
    Kurs fizik;
    Kurs kimya;
    //ODEV OLARAK İSTENEN KISIM -EKLENEN ARALIK BASLANGICI
    int sozluNotuMat;
    int sozluNotuFizik;
    int sozluNotuKimya;

    int sozluOrtalamaYuzdesi;
    int sinavOrtalamaYuzdesi;
    int ortalamaYuzdesi=100;

    //ODEV OLARAK İSTENEN KISIM -EKLENEN ARALIK

    double ortalama;
    boolean gectiMi;

    Ogrenci(String ogrenciAdi, String ogrenciNo, int sinif,Kurs mat,Kurs fizik,Kurs kimya,
            int sozluOrtalamaYuzdesi,int sinavOrtalamaYuzdesi) {
        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        //ODEV OLARAK İSTENEN KISIM -EKLENEN ARALIK

        if (sozluOrtalamaYuzdesi >= 0 && sozluOrtalamaYuzdesi <= 100 || sinavOrtalamaYuzdesi >= 0 && sinavOrtalamaYuzdesi <= 100) {
            if((ortalamaYuzdesi-sozluOrtalamaYuzdesi)==sinavOrtalamaYuzdesi || (ortalamaYuzdesi-sinavOrtalamaYuzdesi)==sozluOrtalamaYuzdesi) {
                this.sozluOrtalamaYuzdesi= sozluOrtalamaYuzdesi;
                this.sinavOrtalamaYuzdesi = sinavOrtalamaYuzdesi;
            }
        }
        //ODEV OLARAK İSTENEN KISIM -EKLENEN ARALIK

        ortalamaHesabi();
        this.gectiMi = false;

    }
    //ODEV OLARAK İSTENEN KISIM -EKLENEN ARALIK

    public void addSozluNotlari(int sozluNotuMat,int sozluNotuFizik,int sozluNotuKimya) {
        if (sozluNotuMat >= 0 && sozluNotuMat <= 100) {
            this.sozluNotuMat = sozluNotuMat;
        }

        if (sozluNotuFizik >= 0 && sozluNotuFizik <= 100) {
            this.sozluNotuFizik = sozluNotuFizik;
        }

        if (sozluNotuKimya >= 0 && sozluNotuKimya <= 100) {
            this.sozluNotuKimya = sozluNotuKimya;
        }

    }
    //ODEV OLARAK İSTENEN KISIM -EKLENEN ARALIK

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

        if (this.mat.not == 0 || this.fizik.not == 0 || this.kimya.not == 0 || this.sozluNotuMat == 0 || this.sozluNotuFizik == 0 || this.sozluNotuKimya == 0) {
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
    //ODEV OLARAK İSTENEN KISIM -EKLENEN ARALIK

    public void ortalamaHesabi() {

        this.ortalama = (double) (((this.fizik.not) * (sinavOrtalamaYuzdesi)) + ((this.sozluNotuFizik) * (sozluOrtalamaYuzdesi)) +
                (((this.kimya.not) * (sinavOrtalamaYuzdesi)) + ((this.sozluNotuKimya) * (sozluOrtalamaYuzdesi))) +
                (((this.mat.not) * (sinavOrtalamaYuzdesi)) + ((this.sozluNotuMat) * (sozluOrtalamaYuzdesi))))/ 300;

    }
    //ODEV OLARAK İSTENEN KISIM -EKLENEN ARALIK

    public boolean kontrol() {
        ortalamaHesabi();
        return this.ortalama > 55;
    }
    //ODEV OLARAK İSTENEN KISIM -EKLENEN ARALIK

    public void printNot(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.ogrenciAdi);
        System.out.println("Sozlü Ortalama Yuzdesi: " + this.sozluOrtalamaYuzdesi);
        System.out.println("Sınav Ortalama Yuzdesi: " + this.sinavOrtalamaYuzdesi);
        System.out.println("Matematik Notu : " + this.mat.not);
        System.out.println("Fizik Notu : " + this.fizik.not);
        System.out.println("Kimya Notu : " + this.kimya.not);
        System.out.println("Matematik Sözlü Notu : " + this.sozluNotuMat);
        System.out.println("Fizik Sözlü Notu : " + this.sozluNotuFizik);
        System.out.println("Kimya Sözlü Notu : " + this.sozluNotuKimya);
    }
    //ODEV OLARAK İSTENEN KISIM -EKLENEN ARALIK-SONU

}