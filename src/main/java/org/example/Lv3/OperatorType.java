package org.example.Lv3;

public enum OperatorType {
    add("+"){
        public int apply(int num1, int num2){
            return num1+num2;
        }
    },
    sub("-"){
        public int apply(int num1, int num2){
            return num1-num2;
        }
    },
    mul("*"){
        public int apply(int num1, int num2){
            return num1*num2;
        }
    },
    div("/"){
        public int apply(int num1, int num2){
            if(num2==0){
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            return num1/num2;
        }
    }
}
