package io.codeforall.bootcamp.decorator.implementation;

public class SlackDecorator extends BaseNotifier {

    public SlackDecorator(Notifier notifierDecorator) {
        super(notifierDecorator);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending a notification through Slack with the message: " + message);
        super.send(message);
    }
}
