package io.codeforall.bootcamp.decorator.problem;

public class SlackAndSMSNotifier extends Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending a notification through Slack And SMS " + message);
    }
}
