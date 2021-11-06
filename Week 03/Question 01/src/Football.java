public class Football extends Ball {
    Football(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("Football has been tossed");
    }

    @Override
    public void bounce() {
        System.out.println("Football has been bounced");
    }
}
