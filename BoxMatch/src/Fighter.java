public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;


    public Fighter(String name, int health, int weight, int dodge) {
        this.name = name;

        this.health = health;
        this.weight = weight;
        if (this.dodge >= 0 && this.dodge <= 0) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

    }

    int hit(Fighter foe) {
        this.damage = (int) (Math.random() * 100);
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı ! ");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }


    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
