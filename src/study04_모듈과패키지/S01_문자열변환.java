package study04_모듈과패키지;

public class S01_문자열변환 {

    public static void main(String[] args) {
        // Wrapper 클래스의 객체 생성
        Integer ten = Integer.valueOf(10);

        // 문자열을 기본 타입으로 변환
        int i = Integer.parseInt("123");
        boolean b = Boolean.parseBoolean("true");
        double d = Double.parseDouble("3.14");

        // toString()
        // Object 의 toString()을 오버라이딩하여 자신만의 문자열 리턴 가능
    }

}
