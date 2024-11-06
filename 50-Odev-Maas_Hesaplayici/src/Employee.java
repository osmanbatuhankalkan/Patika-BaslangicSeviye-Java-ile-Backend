public class Employee
{
    String nameAd,nameSoyad;
    double salary;
    int  workHours;
    int hireYear;
    double vergi = 0;
    double saatlikUcretFarki = 0;
    double maasArtisi = 0;

    public Employee(String name,String nameSoyad,double salary,int workHours,int hireYear){
        this.nameAd=name;
        this.nameSoyad=nameSoyad;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public void tax() {
        if (salary < 1000) {
            System.out.println("Sayın:" + this.nameAd + " Vergiden Muafsiniz.");
            vergi = 0;
        } else {
            vergi = salary * 0.03;
            System.out.println("Sayın:" + this.nameAd + " Adınıza vergi çıkmaktadır: " + vergi);
        }
    }
    public void bonus() {
        if(workHours>40){
            saatlikUcretFarki+=((workHours-40)*(30));
        }

    }
    public void raiseSalary() {
        if ((2021-hireYear)<10){
            maasArtisi+=(salary*0.05);
        } else if (((2021-hireYear)>9) && ((2021-hireYear)<20)) {
            maasArtisi+=(salary*0.1);
        } else  {
            maasArtisi+=(salary*0.15);
        }
    }

    public void sonucCikti(){
        tax();      // Güncel vergi hesaplaması
        bonus();    // Güncel bonus hesaplaması
        raiseSalary(); // Güncel maaş artış hesaplaması

        System.out.println("Adı: " + this.nameAd);
        System.out.println(" Soyadı: " + this.nameSoyad);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Baslangıc Yılı: " + this.hireYear);
        System.out.println("Vergi Tutar: " + vergi);
        System.out.println("Bonus: " + saatlikUcretFarki);
        System.out.println("Maas Artışı: " + maasArtisi);
        System.out.println("Vergi ve Bonuslarla Maaş: " + ((this.salary - vergi) + saatlikUcretFarki));
        System.out.println("Toplam Maaş: " + ((this.salary - vergi) + saatlikUcretFarki + maasArtisi));
    }
}
