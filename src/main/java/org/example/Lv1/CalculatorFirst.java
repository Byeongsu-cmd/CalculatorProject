package org.example.Lv1;

import java.util.Scanner;

public class CalculatorFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요:");
            int num1= sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String cal = sc.next();

            System.out.println("두 번째 숫자를 입력하세요:");
            int num2= sc.nextInt();

            int num3 = 0;
            boolean val=true;

            if (cal.equals("+")) {
                num3 = num1 + num2;
            } else if (cal.equals("-")) {
                num3 = num1 - num2;
            } else if (cal.equals("*")) {
                num3 = num1 * num2;
            }  else if (cal.equals("/")) {
                if(num2==0) {
                    System.out.println("나눗셈 연산에서 분모의 값이 0으로 입력될 수 없습니다.");
                    val=false;
                } else {
                    num3 = num1 / num2;
                }
            }
            else {
                System.out.println("정확한 사칙연산 기호를 입력하세요.");
                val=false;
            }
            if (val) {
                System.out.println("결과:"+ num3);
            }


            System.out.println("더 계산하시겠습니까? (exit 입력시 종료됩니다.)");
            if (sc.next().equals("exit")) {
                break;
            } else{};
        }
    }
}
