package study03_상속;

public class S04_추상클래스와인터페이스 {
    // abstract
    // 추상 메소드를 가지고 있으면 반드시 추상 클래스로 선언되어야 한다
    // 추상 클래스는 객체를 생성할 수 없다
    // 상속받는 클래스에서는 반드시 추상 클래스의 추상 메소드를 오버라이딩 해야만 한다

    // interface
    // 인터페이스끼리 상속된다
    // 인터페이스를 상속받아 클래스를 작성하면 인터페이스의 모든 추상 메소드를 구현하여야 한다
    // implements

    // 추상 클래스와 인터페이스의 차이
    // 추상 클래스는 서브 클래스에서 필요로 하는 대부분의 기능을 구현하여 두고 서브 클래스가 상속받아 활용할 수 있도록 하되,
    // 서브 클래스에서 구현할 수밖에 없는 기능만들 추상 메소드로 선언하여 서브클래스에서 구현하도록 하는 목적
    // 추상 메소드와 일반 메소드 모두 포함, 상수 및 변수 필드 모두 포함

    // 인터페이스는 객체의 기능을 모두 공개한 표준화 문서와 같은 것으로 개발자에게 인터페이스를 상속받은 클래스의 목적에 따라
    // 인터페이스의 모든 추상 메소드를 만들도록 하는 목적
    // 변수 필드(멤버 변수)는 포함하지 않음, 상수 추상 메소드 일반 메소드 default 메소드 static 메소드 모두 포함
    // protected 접근 지정 선언 불가, 다중 상속 지원
}
