package study05_제네릭과컬렉션;

public class S01_컬렉션 {
    // 컬렉션은 배열이 가진 고정 크기의 단점을 극복하기 위해 객체들을 쉽게 삽입, 삭제, 검색할 수 있는 가변 크기의 컨테이너이다

    // Vector<E>
    // Vector<Integer> v = new Vector<>();

    // Java 10은 var 키워드 도입

    // ArrayList 는 스레드 간에 동기화를 지원하지 않기 때문에 다수의 스레드가 동시에 요소를 삽입하거나 삭제할 때 데이터가 훼손될 우려가 있다
    // ArrayList 가 단일 스레드 응용에는 더 효과적

    // 컬렉션의 순차 검색을 위한 Iterator
    // boolean hasNext() : 방문할 요소가 남아 있으면 true 리턴
    // E next() : 다음 요소 리턴
    // void remove() 마지막으로 리턴된 요소 제거

    // HashMap<K, V>
    // put(), get() 메소드를 이용하여 요소를 삽입하거나 검색한다
    // 인덱스를 이용한 요소 접근 불가

    // LinkedList<E>
    // 요소들을 양방향으로 연결하여 관리

    // Collections 클래스
    // static 타입
    // sort(), reverse(), max(), min(), binarySearch()
}
