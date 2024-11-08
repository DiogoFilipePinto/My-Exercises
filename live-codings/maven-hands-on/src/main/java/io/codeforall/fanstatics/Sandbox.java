package io.codeforall.fanstatics;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class Sandbox {

    public static void main(String[] args) {

        System.out.println("Hello World");
        Prompt prompt = new Prompt(System.in, System.out);

        StringInputScanner scanner = new StringInputScanner();
        scanner.setMessage("What's your name?");

        String name = prompt.getUserInput(scanner);
        System.out.println("Hello " + name + ", how are you doing?");

    }

}
