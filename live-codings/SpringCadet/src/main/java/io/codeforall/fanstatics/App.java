package io.codeforall.fanstatics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring-config.xml");

        Cadet mafalda = context.getBean("Mafalda", Cadet.class);
        Cadet jorge = context.getBean("Jorge",Cadet.class);
        Cadet gustavo = context.getBean("Gustavo", Cadet.class);

        mafalda.sayHello();
        jorge.sayHello();
        gustavo.sayHello();

        mafalda.getContacts().forEach((k,v) -> System.out.println(k + ": " + v));

        System.out.println(jorge.getFriend() == gustavo.getFriend());
    }
}
