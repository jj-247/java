package study04_모듈과패키지;

import java.util.StringTokenizer;

public class S04_StringTokenizer클래스 {

    public static void main(String[] args) {

        // 하나의 문자열을 여러 개의 문자열로 분리, 구분 문자로 분리된 문자열을 토큰이라고 한다
        // StringTokenizer(String str) : str 스트링의 각 문자를 구분 문자로 문자열을 분리하는 스트링 토크나이저 생성
        // StringTokenizer(String str, String delim) : str 스트링과 delim 구분 문자로 문자열을 분리하는 스트링 토크나이저 생성
        // StringTokenizer(String str, String delim, boolean returnDelim) : str 스트링과 delim 구분 문자로 문자열을 분리하는 스트링 토크나이저 생성
        // returnDelim 이 true 이면 delim 이 포함된 무자도 토큰에 포함된다

        // int countTokens() : 스트링 토크나이저가 분리한 토큰의 개수 리턴
        // boolean hasMoreTokens() : 스트링 토크나이저에 다음 토큰이 있으면 true 리턴
        // String nextToken() : 스트링 토크나이저에 들어있는 다음 토큰 리턴

        String num = "2+3+5+66+88+323";
        StringTokenizer st = new StringTokenizer(num, "+");
        int sum = 0;
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }

}
