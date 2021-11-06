public class Ball implements Tossable {
    String brandName;

    Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void toss() {
        System.out.println("Ball has been tossed");
    }

    public void bounce() {
        System.out.println("Ball has been bounced");
    }
}
