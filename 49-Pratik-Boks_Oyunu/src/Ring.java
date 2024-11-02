import java.util.Random;
public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            //eklenen kısım-b
            //Kimin başladığını Kontrol eden kısım
            if (decideFirstAttacker()) {
                System.out.println(f1.name + " dövüşe başlıyor!");
                fightSequence(f1, f2);//ilk dövüsü kimin yapacağı belirlendikten sonra çalışan metodumuz
            } else {
                System.out.println(f2.name + " dövüşe başlıyor!");
                fightSequence(f2, f1);//ilk dövüsü kimin yapacağı belirlendikten sonra çalışan metodumuz
            }
            //eklenen kısım-s
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    //eklenen kısım-b
    //ilk Saldırıyı belirlemek için
    private boolean decideFirstAttacker() {
        Random rand = new Random();//random sınıfı kullandık
        return rand.nextBoolean();  // %50 olasılıkla true veya false döner
    }

    //ilk dövüsü kimin yapacağı belirlendikten sonra çalışan metodumuz
    private void fightSequence(Fighter attacker, Fighter defender) {
        while (f1.health > 0 && f2.health > 0) {
            System.out.println("======== YENİ ROUND ===========");
            defender.health = attacker.hit(defender);
            if (isWin()) {
                break;
            }
            attacker.health = defender.hit(attacker);
            if (isWin()) {
                break;
            }
            printScore();
        }
    }

    //eklenen kısım-s
    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}