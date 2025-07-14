package org.example.Lv3;

public enum OperatorType {
    add("+"){
        public int apply(int num1, int num2) {
            return num1 + num2;
        }
    },
    sub("-"){
        public int apply(int num1, int num2) {
            return num1 - num2;
        }
    },
    mul("*"){
        public int apply(int num1, int num2) {
            return num1 * num2;
        }
    },
    div("/"){
        public int apply(int num1, int num2) {
            if (num2 == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다!");
            } return num1 / num2;
        }
    };

    private final String symbol;
    OperatorType(String symbol) {
        this.symbol = symbol;
    }
    public abstract int apply(int num1, int num2);

    public static OperatorType newSymbol(String symbol) {
        for (OperatorType op : OperatorType.values()) {
            if (op.symbol.equals(symbol)) {
                return op;
            }
        }
            throw new IllegalArgumentException("연산자를 다시 입력해주세요.");
    }
}
