package study01_자바기본;

public class S01_기본타입 {

    public static void main(String[] args) {
        // 기본 데이터 타입 8개 : call by value (실제 값이 메모리에 저장)
        // 레퍼런스 데이터 타입 : call by reference (주소값이 메모리에 저장)

        // 논리타입
        // boolean

        // 문자타입
        // char

        // 정수타입 (int 타입으로 자동 컴파일)
        // byte
        // short
        // int
        // long

        // 실수타입 (double 타입으로 자동 컴파일)
        // float
        // double

        long l = 9999999999L;
        float f = 1234E-4F; // 0.1234
        char c = '\u0041'; // 'A'
        char escapeSequence = '\n';
        var v = "변수 선언시 초기값 필요";
        System.out.print("Hello" + escapeSequence + "World");
    }

}