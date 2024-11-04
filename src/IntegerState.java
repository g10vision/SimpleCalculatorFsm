public class IntegerState implements State {
    @Override
    public void handle(Context context, char input) {
        if (Character.isDigit(input)) {
            context.currentNumber = context.currentNumber * 10 + (input - '0');
        } else if (input == '+' || input == '-') {
            // Only update total if operation is not default
            if (context.operation != '\0') { // Ensure operation is defined
                if (context.operation == '+') {
                    context.total += context.currentNumber;
                } else if (context.operation == '-') {
                    context.total -= context.currentNumber;
                }
            } else {
                context.total = context.currentNumber;
            }
            context.operation = input;
            context.currentNumber = 0;
            context.setState(new OperatorState());
        } else {
            context.setState(new ErrorState(input));
        }
    }

}
