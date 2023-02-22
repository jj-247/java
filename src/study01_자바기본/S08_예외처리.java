package study01_자바기본;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S08_예외처리 {

    public static void main(String[] args) {
        // try {
        //		예외가 발생할 가능성이 있는 실행문(try 블록)
        // }

        // catch (처리할 예외 타입 선언) {
        //		예외 처리문(catch 블록)
        // }

        // finally {
        //		예외 발생 여부와 상관없이 무조건 실행되는 문장(finally 블록)
        // }

        // ArithmeticException : 정수를 0으로 나눌 때 발생
        // NullPointerException : null 레퍼런스를 참조할 때 발생
        // ClassCastException : 변환할 수 없는 타입으로 객체를 변환할 때 발생
        // OutOfMemoryError : 메모리가 부족한 경우 발생
        // ArrayIndexOutOfBoundsException : 배열의 범위를 벗어난 접근 시 발생
        // IllegalArgumentException : 잘못된 인자 전달시 발생
        // IOException : 입출력 동작 실패 또는 인터럽트 시 발생
        // NumberFormatException : 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환 시 발생
        // InputMismatchException : Scanner 클래스의 nextInt()를 호출하여 정수로 입력받고자 하였지만, 사용자가 문자를 입력한 경우 발생
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");
        int sum = 0, n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(i + ">>");
            try {
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요");
                sc.nextLine();
                i--;
                continue;
            }
            sum += n;
        }
        System.out.println("합은 " + sum);
        sc.close();
    }

}
