package io.codeforall.bootcamp.decorator.implementation;

public class SimpleNotifier implements Notifier{

    @Override
    public void send(String message) {
        System.out.println("Sending a simple notification: " + message);
    }
}
