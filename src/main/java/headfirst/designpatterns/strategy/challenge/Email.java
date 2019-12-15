package headfirst.designpatterns.strategy.challenge;

public class Email implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("I'm emailing the photo");
    }
}
