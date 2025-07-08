package org.example.Lv1;

import java.util.Scanner;

public class CalculatorFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요:");
        int num1= sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요:");
        int num2= sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        String charAt = sc.next();
        int num3 = 0;

        if (charAt.equals("+")) {
            num3 = num1 + num2;
        } else if (charAt.equals("-")) {
            num3 = num1 - num2;
        } else if (charAt.equals("*")) {
            num3 = num1 * num2;
        }  else if (charAt.equals("/")) {
            num3 = num1 / num2;
        }  else {
            System.out.println("정확한 사칙연산 기호를 입력하세요.");
        }
        System.out.println("결과:"+ num3);

    }
}