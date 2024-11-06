package io.codeforall.bootcamp.decorator.problem;

public class SMSNotifier extends Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending a notification through SMS: " + message);
    }
}
