public class OperatorState implements State {
    @Override
    public void handle(Evaluator evaluator, char input) {
        if (Character.isDigit(input)) {
            evaluator.currentNumber = input - '0';
            evaluator.setState(new IntegerState());
        }
        else
            evaluator.setState(new ErrorState(input));
    }
}
