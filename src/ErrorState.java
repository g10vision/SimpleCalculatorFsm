public class ErrorState implements State {
    private char invalidChar;

    public ErrorState(char invalidChar) {
        this.invalidChar = invalidChar;
    }

    @Override
    public void handle(Evaluator evaluator, char input) {
        System.out.println("Error: Invalid input encountered - '" + invalidChar + "'");
        //evaluator.setState(new EndState());
        //throw new RuntimeException("Error: Invalid input encountered - '" + invalidChar + "'");
    }
}
