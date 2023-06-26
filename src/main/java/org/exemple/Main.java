package org.exemple;

public class Main {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        int val = calculator.sum(32);
        System.out.println("Сума чисел, числа 32, дорівнює " + val);
    }

}