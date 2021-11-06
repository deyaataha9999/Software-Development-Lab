public class Baseball extends Ball {
    Baseball(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("Baseball has been tossed");
    }

    @Override
    public void bounce() {
        System.out.println("Baseball has been bounced");
    }
}
