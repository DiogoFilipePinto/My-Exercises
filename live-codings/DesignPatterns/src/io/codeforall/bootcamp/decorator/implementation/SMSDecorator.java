package io.codeforall.bootcamp.decorator.implementation;

public class SMSDecorator extends BaseNotifier {

    public SMSDecorator(Notifier notifierDecorator) {
        super(notifierDecorator);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending a notification through SMS with the message" + message);
        super.send(message);
    }
}
