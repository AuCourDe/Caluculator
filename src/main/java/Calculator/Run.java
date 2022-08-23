package Calculator;

import Calculator.Calculator;

public class Run {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(0,0,"",0);
        System.out.println("Kalkulator");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } //pausa
        System.out.println("Dodaje, odejmuje, mnozy i dzieli");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Calculator.scanFirstNumber(calculator);
        Calculator.scanSecondNumber(calculator);
        Calculator.choseOperation(calculator);
    }
}
