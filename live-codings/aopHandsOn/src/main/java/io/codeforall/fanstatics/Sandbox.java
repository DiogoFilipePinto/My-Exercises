package io.codeforall.fanstatics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Sandbox {

    public static void main(String[] args) {

        ApplicationContext ctx = new GenericXmlApplicationContext("/META-INF/spring-config.xml");

        Fanstatics mafalda = ctx.getBean("proxy", Fanstatics.class);

       mafalda.present("cenoura");

      // mafalda.test();

    }
}
