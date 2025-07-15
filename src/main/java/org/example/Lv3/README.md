Lv3 사칙연산 계산기
자바의 enum, abstract method, 그리고 제네릭 클래스를 활용하여 만든 객체지향 콘솔 계산기다.  
사칙연산 수행뿐만 아니라, 연산 결과를 리스트에 저장하고 전체 결과를 출력하는 기능도 포함되어 있습니다

주요 기능
- 두 수와 연산자를 입력받아 사칙연산
- 0으로 나누기 예외 처리 (ArithmeticException)
- 문자열 기호를 enum 타입으로 매핑
- 연산 결과 저장 (제네릭 리스트 활용)
- 잘못된 숫자 입력 시 예외 처리 (InputMismatchException)
- exit 입력 시 반복 종료

구조
- ArithmeticCalculator 메인 실행 클래스 (사용자 입력 및 실행 흐름 제어)
- OperatorType 각 연산을 enum으로 정의 (추상 메서드 오버라이딩)
- Calculate<T> 제네릭으로 구현된 결과 저장용 클래스

예외 처리
- InputMismatchException 숫자가 아닌 값을 입력한 경우
- ArithmeticException 0으로 나누기를 시도한 경우
- IllegalArgumentException 잘못된 연산자 기호 입력 시

느낀점(배운점)
- enum 내부에서 추상 메서드를 오버라이딩하는 방식, 외부 문자열을 enum으로 매핑하여 전략적으로 처리, 제네릭 클래스 설계 및 리스트 자료구조 활용
- static을 잘 이해하지 못한 채 사용해서 아직 왜 이렇게 코딩을 해야했는지 이해를 못하고 있다. 앞으로 더 공부해서 이것에 대해 알아보고 해결봐야겠다.