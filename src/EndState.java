public class EndState implements State {
    @Override
    public void handle(Evaluator evaluator, char input) {
        if (evaluator.operation != '\0') {
            if (evaluator.operation == '+') {
                evaluator.total += evaluator.currentNumber;
            } else if (evaluator.operation == '-') {
                evaluator.total -= evaluator.currentNumber;
            }
        } else {
            evaluator.total = evaluator.currentNumber; // Finalize total
        }
        //System.out.println("Final result: " + context.total);
    }
}
