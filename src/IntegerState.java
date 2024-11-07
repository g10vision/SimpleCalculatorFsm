public class IntegerState implements State {
    @Override
    public void handle(Evaluator evaluator, char input) {
        if (Character.isDigit(input)) {
            evaluator.currentNumber = evaluator.currentNumber * 10 + (input - '0');
        } else if (input == '+' || input == '-') {
            // Only update total if operation is not default
            if (evaluator.operation != '\0') { // Ensure operation is defined
                if (evaluator.operation == '+') {
                    evaluator.total += evaluator.currentNumber;
                } else if (evaluator.operation == '-') {
                    evaluator.total -= evaluator.currentNumber;
                }
            } else {
                evaluator.total = evaluator.currentNumber;
            }
            evaluator.operation = input;
            evaluator.currentNumber = 0;
            evaluator.setState(new OperatorState());
        } else {
            evaluator.setState(new ErrorState(input));
        }
    }

}
