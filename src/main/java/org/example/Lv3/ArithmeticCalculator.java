package org.example.Lv3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate<Double> resultList = new Calculate<>();

        while (true) {
            try {
                System.out.print("첫번째 숫자를 입력하세요: ");
                double num1 = sc.nextDouble();

                System.out.print("연산 기호를 입력하세요(+,-,*,/): ");
                String symbol = sc.next();

                System.out.print("두번째 숫자를 입력하세요: ");
                double num2 = sc.nextDouble();

                OperatorType op = OperatorType.newSymbol(symbol);
                double result = op.apply(num1,num2);

                resultList.addResult(result);
                System.out.println("결과:"+result);

                System.out.println("저장된 값"+resultList.getResultList());

            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                sc.nextLine();
                continue;
            } catch (Exception e) {
                System.out.println("오류 발생: " + e.getMessage());
            }
            System.out.println("계속하시겠습니까?(exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("exit")) break;
        }
    }
}