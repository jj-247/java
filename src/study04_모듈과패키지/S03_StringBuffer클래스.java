package study04_모듈과패키지;

public class S03_StringBuffer클래스 {
    // StringBuffer 객체는 문자열을 저장하는 가변 버퍼를 가지고 있기 때문에 저장된 문자열의 수정이 가능하다
    // StringBuffer() : 초기 버퍼의 크기가 16인 스트링 버퍼 객체 생성
    // StringBuffer(charSequence seq) : seq 가 지정하는 일련의 문자들을 포함하는 스트링 버퍼 생성
    // StringBuffer(int capacity) : 지정된 초기 크기를 갖는 스트링 버퍼 객체 생성
    // StringBuffer(String str) : 지정된 스트링으로 초기화된 스트링 버퍼 객체 생성

    // StringBuffer append(String str) : str 스트링을 스트링 버퍼에 덧붙인다
    // StringBuffer append(StringBuffer sb) : sb 스트링 버퍼를 현재의 스트링 버퍼에 덧붙인다. 이 결과 현재 스트링 버퍼의 내용이 변한다
    // int capacity() : 스트링 버퍼의 현재 크기 리턴
    // StringBuffer delete(int start, int end) : start 위치에서 end 위치 앞까지 부분 문자열 삭제
    // StringBuffer insert(int offset, String str) : str 스트링을 스트링 버퍼의 offset 위치에 삽입
    // StringBuffer replace(int start, int end, String str) : 스트링 버퍼 내의 start 위치의 문자부터 end 가 지정하는 문자 앞의 서브 스트링을 str 로 대치
    // StringBuffer reverse() : 스트링 버퍼 내의 문자들을 반대 순서로 변경
    // void setLength(int newLength) : 스트링 버퍼 내 문자열 길이를 newLength 로 재설정, 현재 길이보다 큰 경우 널 문자('')로 채우며 작은 경우는 기존 문자열이 잘린다
}
