public class TestCalculator {
    public static void main(String[] args) {
        CalculateTest("10.3-1+1");
        CalculateTest("1*-9");
        //CalculateTest("10+1+1");
        //CalculateTest("10+1+10");
        //CalculateTest("10A+1-10");
    }
    public static void CalculateTest(String expression) {
        var evaluator = new Evaluator();
        var result = evaluator.evaluate(expression);
        System.out.println("The result of the expression " + expression + " is: " + result);
    }
}
