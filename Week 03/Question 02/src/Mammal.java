public class Mammal implements Animal {
    private final int numberOfLegs;
    private String favFood;

    /*
     *
     * Constructors
     *
     */

    Mammal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    Mammal(int numberOfLegs, String favFood) {
        this(numberOfLegs);
        this.favFood = favFood;
    }

    /*
     *
     * Animal interface methods
     *
     */

    public void eat() {
        System.out.println(this.getClass().getName() + " is eating.");
    }

    public void travel() {
        System.out.println(this.getClass().getName() + " is traveling.");
    }

    /*
     *
     * Accessor methods
     *
     */

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getFavFood() {
        return favFood;
    }

    /*
     *
     * Mutator methods
     *
     */

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
}
