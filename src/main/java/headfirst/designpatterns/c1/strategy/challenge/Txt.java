package headfirst.designpatterns.c1.strategy.challenge;

public class Txt implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("I'm txting the photo");
    }
}
