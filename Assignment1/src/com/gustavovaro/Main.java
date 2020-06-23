package com.gustavovaro;

public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }

        System.out.print(String.format("Hello, %s!", args[0]));
    }
}