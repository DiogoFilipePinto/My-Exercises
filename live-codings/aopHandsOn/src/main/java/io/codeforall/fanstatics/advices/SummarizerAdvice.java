package io.codeforall.fanstatics.advices;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SummarizerAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        if(args.length > 0) {
            System.out.println("The method argument was " + args[0]);
            if(args[0] instanceof String ref) {
                if(!ref.equals("gustavo")) {
                    System.out.println("We only accept gustavo");
                    return;
                }
            } else {
                return;
            }
        }
        System.out.println(method.getReturnType());
        System.out.println("Cmon Mafalda, present it with good english and poor slides!");
    }
}
