package calculator;

class CalculatorWrapper {

    public static void main(String[] args) {
        Calculator anonymousCalculator = new Calculator() {
            @Override
            public long sum(long val1, long val2) {
                return val1 + val2;
            }

            @Override
            public long subtraction(long val1, long val2) {
                return val1 - val2;
            }
        };
        System.out.println(anonymousCalculator.sum(2l, 3l));
        System.out.println(anonymousCalculator.subtraction(3l,2l));
    }
}
