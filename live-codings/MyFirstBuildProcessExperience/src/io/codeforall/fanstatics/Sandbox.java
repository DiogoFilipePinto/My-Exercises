package io.codeforall.fanstatics;

public class Sandbox {

    public static void main(String[] args) {

        String cadet = "Toy";

        if (args.length > 1) {
            cadet = args[0];
        }
        System.out.println("Hello " + cadet + "! How are you doing today?");
    }
}
