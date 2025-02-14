package io.codeforall.bootcamp;

import io.codeforall.bootcamp.bqueue.BQueue;
import io.codeforall.bootcamp.bqueue.Pizza;

public class Main {

    public static void main(String[] args) {

        BQueue<Pizza> queue = new BQueue<>(5);

        Producer p1 = new Producer(queue, 16);
        Thread t1 = new Thread(p1);
        t1.setName("Mario");

        Producer p2 = new Producer(queue, 14);
        Thread t2 = new Thread(p2);
        t2.setName("Luigi");

        Consumer c1 = new Consumer(queue, 13);
        Thread t3 = new Thread(c1);
        t3.setName("Michaelangelo");

        Consumer c2 = new Consumer(queue, 17);
        Thread t4 = new Thread(c2);
        t4.setName("Donatello");

        t3.start();
        t4.start();

        t1.start();
        t2.start();


    }
}
