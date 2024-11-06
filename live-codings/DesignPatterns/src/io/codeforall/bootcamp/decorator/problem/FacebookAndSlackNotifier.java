package io.codeforall.bootcamp.decorator.problem;

public class FacebookAndSlackNotifier extends Notifier{

    @Override
    public void send(String message) {
        System.out.println("Sending a notification through facebook and slack: " + message);
    }
}
