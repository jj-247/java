package test01_자바기본;

import java.util.Random;

public class Q07_배열평균 {
    // 랜덤한 정수를 배열에 삽입하고 총합의 평균 구하기

    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        double sum = 0;
        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(10) + 1; // (1~10)
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();
        System.out.println("평균은 " + sum / array.length);
    }

}
