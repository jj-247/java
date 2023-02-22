package study01_자바기본;

public class S06_배열 {

    public static void main(String[] args) {
        // 배열의 선언 및 생성, 초기화
        int[] x = new int[5];
        int y[] = {1, 2, 3, 4, 5};

        // 비정방형 배열
        int[][] z = new int[4][];
        z[0] = new int[1];
        z[1] = new int[2];
        z[2] = new int[3];
        z[3] = new int[4];

        // 10 11 12
        // 20 21
        // 30 31 32
        // 40 41
        int[][] array = new int[4][];
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[2];
        for (int i = 0; i < array.length; i++) {
            int num = 10 * (i + 1);
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num;
                System.out.print(array[i][j] + " ");
                num++;
            }
            System.out.println();
        }
    }

}
