package pav.matrosov;

public class Functions {

    private double a;
    private double b;

    public void setOperation(String operation) throws Exception {
        switch (operation) {
            case "+":
                System.out.println(sum(a, b));
                break;
            case "-":
                System.out.println(subtraction(a, b));
                break;
            case "*":
                System.out.println(multiplication(a, b));
                break;
            case "/":
                System.out.println(div(a, b));
                break;
            default:
                throw new IncorrectOperator();
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double sum (double a, double b) {
        return a + b;
    }

    public double subtraction (double a, double b) {
        return a - b;
    }

    public double multiplication (double a, double b) {
        return a * b;
    }

    public double div (double a, double b) throws Exception{
        if (b == 0) {
            throw new DivWithZero();
        } else
        return a / b;
    }

    public class DivWithZero extends Exception {
        public DivWithZero () {
            super();
        }
    }
    public class IncorrectOperator extends Exception {
        public IncorrectOperator () {
            super();
        }
    }

}
