public class App {
    public static void main(String[] args) {
        Mammal m1 = new Mammal(4);
        Mammal m2 = new Mammal(2, "Leaves");

        m1.setFavFood("Roots");
        System.out.println(m1.getFavFood());
        System.out.println(m2.getNumberOfLegs());

        m1.eat();
        m2.travel();
    }
}
