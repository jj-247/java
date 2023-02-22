package study02_클래스와객체;

public class S02_생성자 {
    // 생성자
    // 객체가 생성될 때 객체의 초기화를 위해 실행되는 메소드
    // 객체가 생성되는 순간에 자동으로 호출
    // 생성자의 이름은 클래스 이름과 동일
    // 생성자는 여러개 작성(오버로딩)할 수 있다

    // this 레퍼런스
    // 매개변수의 이름을 멤버 변수와 같은 이름으로 붙이고자 하는 경우
    // public class Combat {
    //  String aircraft; String weapon;
    //  public Combat(String aircraft) {
    //   this(aircraft,"비무장"); }
    // }
    // this()는 반드시 생성자의 첫 번째 문장이 되어야 한다

    // 메소드 오버로딩
    // 메소드 이름이 동일하고 매개변수의 개수나 타입이 서로 달라야 한다

    // 가비지 컬렉션 강제 요청
    // System.gc();
}
