public class App {
    public static void main(String[] args) {
        Rock r = new Rock();
        Baseball b = new Baseball("Adidas");
        Football f = new Football("Nike");

        r.toss();
        b.bounce();
        System.out.println(f.getClass().getName() + " brand: " + f.getBrandName());
    }
}
