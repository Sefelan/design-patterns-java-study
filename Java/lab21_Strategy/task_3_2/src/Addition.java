public class Addition implements Operation {
    @Override
    public int calculate(int a, int b) {
        int res = a + b;
        System.out.printf("%s + %s = %s%n", a, b, res);
        return res;
    }
}
