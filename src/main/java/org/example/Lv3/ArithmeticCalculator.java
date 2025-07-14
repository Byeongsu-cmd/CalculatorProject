package org.example.Lv3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ArithmeticCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요:");
                int num1 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                String cal = sc.next();

                System.out.print("두 번째 숫자를 입력하세요:");
                int num2 = sc.nextInt();

                Integer result = cal1.calculate(num1, num2, cal);
                if (result != null) {
                    System.out.println("결과: " + result);
                    System.out.println("지금까지 저장된 결과들: " + cal1.getResults());
                }
                System.out.println("저장된 값을 모두 초기화하고 싶다면 clear를 입력하세요.");
                System.out.println("1번째 저장된 값을 지우고 싶다면 yes를 입력하세요.");
                String clear = sc.next();
                if (clear.equalsIgnoreCase("clear")) {
                    cal1.setResult(new ArrayList<>());
                    System.out.println("초기화 완료 되었습니다.");
                } else if (clear.equalsIgnoreCase("yes")) {
                    cal1.removeFirst();
                    System.out.println("1번째 값을 지웠습니다.");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("숫자가 아닌 값을 입력하셨습니다. 다시 시도해주세요.");
                sc.nextLine();
                continue;
            } catch (Exception e) {
                System.out.println("오류 발생: " + e.getMessage());
            }
            System.out.println("계속하시겠습니까? (exit 입력 시 종료)");
            String next = sc.next();
            if (next.equalsIgnoreCase("exit")) break;
        }
    }
}
