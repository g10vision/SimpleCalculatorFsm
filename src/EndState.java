public class EndState implements State {
    @Override
    public void handle(Context context, char input) {
        if (context.operation != '\0') {
            if (context.operation == '+') {
                context.total += context.currentNumber;
            } else if (context.operation == '-') {
                context.total -= context.currentNumber;
            }
        } else {
            context.total = context.currentNumber; // Finalize total
        }
        //System.out.println("Final result: " + context.total);
    }
}
