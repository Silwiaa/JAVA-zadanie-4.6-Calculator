package com.calculator;

class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return this.a + this.b;
    }

    public int substract() {
        return this.a - this.b;
    }
}

class Application {
    public static void main (String[] args) {
        Calculator calculator = new Calculator(9, 4);
        System.out.println(calculator.add());
        System.out.println(calculator.substract());
    }
}
