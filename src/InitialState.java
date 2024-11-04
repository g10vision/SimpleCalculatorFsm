public class InitialState implements State {
    @Override
    public void handle(Context context, char input) {
        if (Character.isDigit(input)) {
            context.currentNumber = input - '0';
            context.setState(new IntegerState());
        } else {
            context.setState(new ErrorState(input));
        }
    }
}
