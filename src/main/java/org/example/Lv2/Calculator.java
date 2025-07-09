package org.example.Lv2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
        private List<Integer> result = new ArrayList<Integer>();

        public Integer calculate(int num1,int num2,String cal){
            int num3 = 0;
            boolean val = true;
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
                        System.out.println("️0으로 나눌 수 없습니다!");
                        val = false;
                    } else {
                        num3 = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("올바른 연산자를 입력하세요.");
                    val = false;
            }   if(val) {
                result.add(num3);
                return num3;
            }   else {
                return null;
            }
        }

        public List<Integer> getResults() {
            return result;
        }
    }
