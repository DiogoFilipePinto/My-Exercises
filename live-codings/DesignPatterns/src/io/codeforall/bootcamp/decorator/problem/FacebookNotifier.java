package io.codeforall.bootcamp.decorator.problem;

public class FacebookNotifier extends Notifier{

    @Override
    public void send(String message) {
        System.out.println("Sending a notification through facebook: " + message);
    }
}
