package Calculator;

import java.util.Scanner;
public class Calculator {
    //pola
    private int firstNumber;
    private int secondNumber;
    private String operation;
    private int total;

    //kontruktory
    public Calculator(int firstNumber, int secondNumber, String operation, int total) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
        this.total = total;
    }

    public static void scanFirstNumber() {
    }


    //metody
    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int  firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static void choseOperation(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rodzaj dzialania (+ lub - lub * lub / : ");
        String operation = scanner.nextLine();
        calculator.setOperation(operation);

        switch (calculator.getOperation()) {
            case "+":
                calculator.setTotal(calculator.getFirstNumber()+calculator.getSecondNumber());
                System.out.println("Wynik: " + calculator.getTotal());
                break;
            case "-":
                calculator.setTotal(calculator.getFirstNumber()-calculator.getSecondNumber());
                System.out.println("Wynik: " + calculator.getTotal());
                break;
            case "*":
                calculator.setTotal(calculator.getFirstNumber()*calculator.getSecondNumber());
                System.out.println("Wynik: " + calculator.getTotal());
                break;
            case "/":
                if (calculator.getSecondNumber() == 0) {
                    System.out.println("Nope, nie dziele przez zero");
                } else {
                    calculator.setTotal(calculator.getFirstNumber()/calculator.getSecondNumber());
                    System.out.println("Wynik: " + calculator.getTotal());
                    break;
                }
                break;
            default:
                System.out.println("cos poszlo nie tak");
        }
        return;
    }

    public static void scanFirstNumber(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int firstNumber = scanner.nextInt();
        calculator.setFirstNumber(firstNumber);
    }

    public static void scanSecondNumber(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj druga liczbe: ");
        int secondNumber = scanner.nextInt();
        calculator.setSecondNumber(secondNumber);
    }
}

