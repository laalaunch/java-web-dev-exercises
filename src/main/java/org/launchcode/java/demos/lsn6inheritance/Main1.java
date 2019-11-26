package org.launchcode.java.demos.lsn6inheritance;

public class Main1 {

    public static void main(String[] args) {

        Greeting greeting = new Greeting(true, "English");

        System.out.println(greeting.getMorningMessage());
    }
}
