package study04_모듈과패키지;

public class S02_String클래스 {
    // new String()으로 생성된 스트링은 힙 메모리에 생성

    // String 클래스 주요 메소드
    // char charAt(int index) : index 에 있는 문자 값 리턴
    // int codePointAt(int index) : index 에 있는 유니코드 값 리턴
    // int compareTo(String anotherString) : 두 스트링을 사전 순으로 비교하여 두 스트링이 같으면 0, 현 스트링이 another 보다 먼저 나오면 음수, 아니면 양수 리턴
    // String concat(String str) : 현재 스트링 뒤에 str 스트링을 덧붙인 새로운 스트링 리턴
    // boolean contains(CharSequence s) : s에 지정된 문자들을 포함하고 있으면 true 리턴
    // int length() : 스트링의 길이 리턴
    // String replace(CharSequence target, CharSequence replacement) : target 이 지정하는 일련의 문자들을 replacement 가 지정하는 문자들로 변경한 스트링 리턴
    // String[] split(String regex) : 정규식 regex 에 일치하는 부분을 중심으로 스트링을 분리하고, 분리된 스트링들을 배열로 저장하여 리턴
    // String subString(int beginIndex) : beginIndex 부터 시작하는 서브 스트링 리턴
    // String toLowerCase() : 소문자로 변경한 스트링 리턴
    // String toUpperCase() : 대문자로 변경한 스트링 리턴
    // String trim() : 스트링 앞뒤의 공백 문자들을 제거한 스트링 리턴
}
