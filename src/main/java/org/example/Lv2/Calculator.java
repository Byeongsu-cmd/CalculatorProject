package org.example.Lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
        private List<Integer> result = new ArrayList<Integer>();

    public void setResult(List<Integer> result) {
        this.result = result;
    }
    public List<Integer> getResults() {
        return result;
    }
    public void removeFirst(){
        if(!result.isEmpty()){
            result.remove(0);
        } else{
            System.out.println("저장된 값이 없습니다.");
        }
    }

    public Integer calculate(int num1, int num2, String cal) throws Exception {
        int num3 = 0;

            switch (cal) {
                case "+":
                    num3 = num1 + num2;
                    break;
                case "-":
                    num3 = num1 - num2;
                    break;
                case "*":
                    num3 = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("0으로 나눌 수 없습니다!");
                    }
                    num3 = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("올바른 연산자를 입력하세요.");
            }
            result.add(num3);
            return num3;
        }
    }
