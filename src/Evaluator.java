public class Evaluator {
        private Context context;

        public Evaluator() {
            this.context = new Context(new InitialState());
        }

        public int evaluate(String expression) {
            for (char ch : expression.toCharArray()) {
                context.process(ch);
            }
            context.setState(new EndState());
            context.process('\0'); // Dummy input to trigger the end state

            return context.total;
        }
}
