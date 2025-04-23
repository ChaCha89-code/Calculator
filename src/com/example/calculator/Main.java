package com.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // : A
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            scanner.nextLine(); // 버퍼에 남아있는 줄바꿈 문자를 제거


            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            String fourOperations = scanner.nextLine();
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

            if (fourOperations.equals("+")) {
                int sum = num1 + num2;
                System.out.println("결과: " + sum);
            } else if (fourOperations.equals("-")) {
                int sub = num1 - num2;
                System.out.println("결과: " + sub);
            } else if (fourOperations.equals("*")) {
                int mul = num1 * num2;
                System.out.println("결과: " + mul);
            } else if (fourOperations.equals("/")) {
                switch (num2) {
                    case 0:
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        return;
                }

                int div = num1 / num2;
                System.out.println("결과: " + div);

            }
            // : B
            // A - B 반복
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.print("입력: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            }

        }
    }
}
