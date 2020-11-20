package com;

public class Test {

    public static void main(String[] args) {
        System.out.println(args[0] + ", " + args[1]);
    }
}
/* mvn clean compile exec:exec -Darg1=Hello -Darg2=world! */