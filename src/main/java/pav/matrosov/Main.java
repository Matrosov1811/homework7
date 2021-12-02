package pav.matrosov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Functions calc = new Functions();
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Введите два числа");
            calc.setA(s.nextDouble());
            calc.setB(s.nextDouble());
            System.out.println("Введите арифметиское действие (‘+’, ‘-’, ‘*’ или ‘/’)");
            calc.setOperation((s.next()));
        } catch (Functions.IncorrectOperator incorrectOperator) {
            System.out.println("Вы ввели некоректный оператор");
        } catch (Functions.DivWithZero divWithZero) {
            System.out.println("На ноль делить нельзя");
        }
    }
}
