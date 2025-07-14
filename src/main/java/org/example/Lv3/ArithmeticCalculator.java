package org.example.Lv3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("첫번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();

                System.out.print("연산 기호를 입력하세요(+,-,*,/): ");
                String symbol = sc.next();

                System.out.print("두번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                OperatorType op = OperatorType.newSymbol(symbol);

                int result = op.apply(num1,num2);
                System.out.println(result);
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                sc.nextLine();
                continue;
            } catch (Exception e) {
                System.out.println("오류 발생: " + e.getMessage());
            }   System.out.println("계속하시겠습니까?(exit 입력 시 종료)");
                String answer = sc.next();
                if (answer.equalsIgnoreCase("exit")) break;
        }
    }
}
