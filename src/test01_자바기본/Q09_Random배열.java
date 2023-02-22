package test01_자바기본;

import java.util.Random;

public class Q09_Random배열 {
    // 4 x 4 의 2차원 배열에 10개의 정수를 임의의 위치에 삽입하기
    // 나머지 6개의 숫자는 모두 0
    
    public static void main(String[] args) {
        Random rd = new Random();
        int[][] array = new int[4][4];
        for (int i = 0; i < 10; i++) {
            int num = rd.nextInt(10) + 1;
            int index = rd.nextInt(4);
            int column = rd.nextInt(4);
            // 0이 기본 값으로 설정되어 있는 배열의 각각 다른 위치에 숫자 삽입하기
            if (array[index][column] == 0) {
                array[index][column] = num;
            } else {
                i--;
            }
        }
        // 배열 출력하기
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
