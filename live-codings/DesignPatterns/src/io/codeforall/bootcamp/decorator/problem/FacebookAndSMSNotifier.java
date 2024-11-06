package io.codeforall.bootcamp.decorator.problem;

public class FacebookAndSMSNotifier extends Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending a notification thorugh facebook and SMS: " + message);
    }
}
