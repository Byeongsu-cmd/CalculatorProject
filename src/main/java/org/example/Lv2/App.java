package org.example.Lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String cal = sc.next();

            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            try {
                Integer result = cal1.calculate(num1, num2, cal);
                if (result != null) {
                    System.out.println("결과: " + result);
                    System.out.println("지금까지 저장된 결과들: " + cal1.getResults());
                }
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료됩니다.)");
            if (sc.next().equals("exit")) {
                break;
            }
        }

    }
}
