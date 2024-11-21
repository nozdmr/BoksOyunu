public class Match {

    Fighter f1, f2;
    Fighter first, second;
    double randomNumber = Math.random() * 100;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        if (randomNumber <= 50) {
            System.out.println("İlk sporcu ilk vuruşu yapıcak");
            this.first = f1;
            this.second = f2;
        }
        else {
            System.out.println("İkinci sporcu ilk vuruşu yapıcak");
            this.first = f2;
            this.second = f1;
        }
    }
    public void run () {
        if (isCheck()) {
            while (this.first.health >0 && this.second.health >0) {
                System.out.println("------------ Yeni Raund------");

                this.second.health = this.first.hit(this.second);
                if ( isWin()) {
                    break;
                }

                this.first.health = this.second.hit(this.first);

                if (isWin()) {
                    break;
                }
                System.out.println(this.first.name + " sağlık: " + this.first.health);
                System.out.println(this.second.name + " sağlık: " + this.second.health);
            }

        }
        else {
            System.out.println("Sporcuların sikletleri uygun değil");
        }


    }
    public boolean isCheck() {
        return ( (this.f1.weight >= minWeight && this.f1.weight <=maxWeight)  &&
                (this.f2.weight >= minWeight && this.f2.weight <=maxWeight )  );
    }
    boolean isWin() {
        if (this.first.health ==0) {
            System.out.println(this.second.name + " kazandı!");
            return true;
        }
        if (this.second.health == 0) {
            System.out.println(this.first.name + " kazandı!");
            return  true;

        }
        return false;

    }
}