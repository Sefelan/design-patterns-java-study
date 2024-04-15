public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Operation addition = new Addition();
        Operation subtraction = new Subtraction();
        Operation multiplication =  new Multiplication();

        calculator.setOperation(addition);
        calculator.calculate(12, 13);

        calculator.setOperation(subtraction);
        calculator.calculate(12, 13);

        calculator.setOperation(multiplication);
        calculator.calculate(12, 13);
    }
}
