package study01_자바기본;

public class S03_연산 {

    public static void main(String[] args) {
        // 산술연산 : +, -, *, /, %
        // 논리연산 : !a a||b a&&b a^b
        // a^b는 a와 b의 XOR 연산, a와 b가 서로 다를 때 true
        // 조건연산(삼항연산자)
        int x = 10;
        int y = 20;
        int ternary = (x < y) ? 1 : 0;
        System.out.println(ternary);
        // 비트논리연산
        // 비트시프트연산 : 1비트 시프트시 >>는 나누기 2의 효과, <<는 곱하기 2의 효과
    }

}
