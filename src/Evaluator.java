public class Evaluator {
    //private Context context;
    private State state;
    int total = 0;
    int currentNumber = 0;
    char operation;

    public Evaluator() {
        this.state = new InitialState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public int evaluate(String expression) {
        for (char ch : expression.toCharArray()) {
            this.process(ch);
        }
        this.setState(new EndState());
        this.process('\0'); // Dummy input to trigger the end state

        return this.total;
    }

    public void process(char input) {
        //System.out.println(this);
        state.handle(this, input);
    }

    public String toString() {
        return "State: " + state + ", current number: " + currentNumber + ", operation: " + operation + ", total: " + total;
    }
}
