package io.codeforall.fanstatics.advices;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class RandomizerAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("oooooooohhhhhhhhhh............ JORGE, THE SUMMARIZER IS YOURS!");
    }
}
