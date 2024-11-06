package io.codeforall.bootcamp.decorator.implementation;

public class FacebookDecorator extends BaseNotifier {

    public FacebookDecorator(Notifier notifierDecorator) {
        super(notifierDecorator);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending a notification through facebook with the message: " + message);
        super.send(message);
    }
}
