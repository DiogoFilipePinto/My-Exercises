package io.codeforall.bootcamp.strategy.implementation;

import io.codeforall.bootcamp.strategy.implementation.transports.*;

import java.util.HashMap;
import java.util.Map;

public class Person {

    private final String name;
    private final Map<String, Transport> transportMap;

    public Person(String name) {
        this.name = name;
        this.transportMap = buildTransportsMap();
    }

    private Map<String, Transport> buildTransportsMap() {
        Map<String, Transport> transports = new HashMap<>();

        transports.put("walk", new Walk());
        transports.put("bus", new Bus());
        transports.put("bicycle", new Bicycle());
        transports.put("car", new Car());

        return transports;
    }

    public void goToTheBootcamp(String transport) {
        if (!transportMap.containsKey(transport)) {
            System.out.println("That transport is not available!");
            return;
        }

        transportMap.get(transport).goToBootcamp();
    }


    public String getName() {
        return name;
    }
}
