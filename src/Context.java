public class Context {
        private State state;
        int total = 0;
        int currentNumber = 0;
        char operation;

        public Context(State state) {
            this.state = state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public void process(char input) {
            //System.out.println(this);
            state.handle(this, input);
        }

        @Override
        public String toString() {
            return "State: " + state + ", current number: " + currentNumber + ", operation: " + operation + ", total: " + total;
        }
}
