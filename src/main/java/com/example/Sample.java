package com.example;

/**
 * A simple Sample class for Jenkins pipeline testing
 */
public class Sample {

    /**
     * Add two numbers
     */
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println("Sample app started!");
        System.out.println("Result: " + sample.add(5, 3));
    }
}
