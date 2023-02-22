package study01_자바기본;

public class S05_반복문 {

    public static void main(String[] args) {
        // do-while 문
        char c = 'a';
        do {
            System.out.print(c);
            c = (char) (c + 1);
        } while (c <= 'z');
        System.out.println();

        // 2중 중첩 for 문
        for (int i = 2, a = 65; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d + %d = %d", i, j, i * j);
                System.out.print('\t');
            }
            System.out.println((char) a);
        }

        // continue 문 : 다음 반복으로 넘어간다
    }

}
