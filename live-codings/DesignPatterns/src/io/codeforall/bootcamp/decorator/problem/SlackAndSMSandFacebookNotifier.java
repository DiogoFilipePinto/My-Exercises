package io.codeforall.bootcamp.decorator.problem;

public class SlackAndSMSandFacebookNotifier extends Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending a notification through Slack, SMS and facebook: " + message);
    }
}
