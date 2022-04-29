package day02;

public class test {

	public static void main(String[] args) {

		// 소스코드 안에 개발자의 필요에 따라서 작성하는 설명문
		// 활용
		// 1. 설명 작성 (이해하기 쉽게)
		// 2. 특정 명령문이 실행되지 않게 하는 역할

		// 주석종류
		// 1. //
		// 2. /* */

		// 주석 단축키
		// Ctrl+/

		// ==================================

		// 변수 variable

		// f(x) = x+1;
		// x -> 변수

		// 데이터 처리하기 위해 변수가 필요하다

		// 자료형
		// 변수를 담는 공간의 키워드
		// 변수의 종류를 구별하기 위해 사용되는 키워드
		// 기본 자료형: 8가지

		// 1. 정수형 (integer)
		// 정수표현 (-3 -2 -1 0 1 2 3)

		// int 4byte 메모리에 4byte 공간을 할당해줌
		int a; // 변수의 선언
		a = 10; // 변수의 할당

		// 대입연산자
		// 선언된 변수에 원하는 값을 대입하는 과정
		// 우변->좌변 대입 ***************
		// 변수이름 = 값;

		int a1 = 10; // 변수의 선언+할당

		// System.out.println(a);

		// 2. 실수형 (10.xx) 8byte
		double b;

		// 과제 팁 1
		// average 평균 낼때 주로 사용
		int a2 = 10;
		int b2 = 20;
		int c2 = 23;
		double aa;
		aa = ((a2 + b2 + c2) / 3.0);

		// a2, b2, c2 -> int 3 -> int
		// 53/3

		// 3.0 -> double
		// java는 int와 double 계산은 double로 바꿈
		// int로 바뀌면? 데이터 손실!
		// 더 크기가 큰 자료형으로 자동으로 바뀐다

		System.out.println("average값은: " + aa);
		// 뭔가 이상한데..? double과 int 이해하기

		// ==================================

		// 3. 문자열
		// String의 기본 자료형은 char
		// String은 기본자료형이 아닙니다
		String s;
		s = "str";
		String blank = "";
		String age = "20";
		String message = "Java      노잼!";

		System.out.println("message: " + message);

		String language = "Ja" + "va";
		System.out.println("language: " + language);

		int StudentAge = 20;
		String Student = "세 자바학생";
		String result = StudentAge + Student;

		System.out.println("result: " + result);

		// 과제 1
		String s1 = "10";
		int i2 = 10;
		// String과 int를 어떻게 비교하나 

		// 변수 이름 명명 규칙

		/*
		 * 1. 변수 이름은 영문, 숫자, _, $ 만 가능 2. 변수의 첫글자는 숫자로 시작할 수 없다 3. 대/소문자를 구별한다. 4. 자바에서
		 * 사용되는 예약어/키워드 를 사용할 수 없다.
		 */

		// 변수명 짓는 방법 (강력추천)
		int myAge;
		int my_age;

		// 변수 사용의 제약
		// 1. 중복선언 불가
		int reset = 100;
		reset = 200;

		// int reset;

		// 2. 선언되지 않은 변수 사용불가
		int vv;

		// 3. 대입되지 않은 변수는 다른 변수에 대입하거나 출력할 수 없다
		int integer1 = 0;
		int integer2 = integer1;

		// 상수 <-> 변수
		final int year = 2022;
		final double time = 357.30;

		int year1 = 2022;
		year1 = 2023;

		// 상수의 값은 변경 불가
		//	year = 2023;

	}

}
