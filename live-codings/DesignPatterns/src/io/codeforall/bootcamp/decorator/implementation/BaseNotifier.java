package io.codeforall.bootcamp.decorator.implementation;

public abstract class BaseNotifier implements Notifier {

    private Notifier notifierDecorator;

    public BaseNotifier(Notifier notifierDecorator) {
        this.notifierDecorator = notifierDecorator;
    }

    @Override
    public void send(String message) {
        notifierDecorator.send(message);
    }

}
