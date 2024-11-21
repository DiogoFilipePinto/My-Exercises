package io.codeforall.fanstatics;

import org.springframework.beans.factory.InitializingBean;

import java.util.Map;

public class Cadet implements InitializingBean {

    private String name;

    private Cadet friend;

    private Map<String,Integer> contacts;

    public Cadet(String name) {
        this.name = name;
    }

    public Cadet getFriend() {
        return friend;
    }

    public void setFriend(Cadet friend) {
        this.friend = friend;
    }

    public String getName (){
        return name;
    }

    public void setContacts(Map<String, Integer> contacts) {
        this.contacts = contacts;
    }

    public Map<String, Integer> getContacts() {
        return contacts;
    }

    public void sayHello(){
        System.out.println("Hello there! My name is " + name + " and my friend is "
        + (friend == null ? " Fulano de Tal" : friend.getName() + "!"));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I've bean created!");
    }
}
