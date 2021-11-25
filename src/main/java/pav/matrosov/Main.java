package pav.matrosov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Functions calc = new Functions();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите два числа");
        try {
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println("Введите арифметиское действие (‘+’, ‘-’, ‘*’ или ‘/’)");
            switch (s.next().charAt(0)) {
                case '+':
                    System.out.println(calc.sum(a, b));
                    break;
                case '-':
                    System.out.println(calc.subtraction(a, b));
                    break;
                case '*':
                    System.out.println(calc.multiplication(a, b));
                    break;
                case '/':
                    try {
                        System.out.println(calc.div(a, b));
                    } catch (ArithmeticException e) {
                        System.out.println("На ноль делить нельзя");
                    }
                    break;
                default:
                    System.out.println("Вы ввели некорректный оператор");
                    break;
            }
            s.close();

        } catch (InputMismatchException e) {
            System.out.println("Необходимо ввести целое число");
        }
    }
}