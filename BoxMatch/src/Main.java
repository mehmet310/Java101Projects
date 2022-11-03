public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Mike Tyson", 100, 100,(int)(Math.random()*100));
        Fighter fighter2 = new Fighter("Muhammad Ali", 100, 85,(int)(Math.random()*100));

        Ring ring = new Ring(fighter1, fighter2, 85, 100);

        ring.run();
    }
}
