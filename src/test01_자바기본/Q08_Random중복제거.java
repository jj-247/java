package test01_자바기본;

import java.util.Random;
import java.util.Scanner;

public class Q08_Random중복제거 {
    // 입력한 숫자의 난수를 한 행에 출력할 숫자의 개수에 따라 비정방형 배열으로 출력하기

    // 랜덤 중복 제거하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력>>");
        int num = sc.nextInt();
        System.out.print("한 행에 출력할 숫자의 개수 입력>>");
        int row = sc.nextInt();
        sc.close();
        int[] input = new int[num];
        int[][] array; // 비정방형 출력을 위한 배열
        Random rd = new Random();
        // 중복제거
        for (int i = 0; i < input.length; i++) {
            input[i] = rd.nextInt(num) + 1;
            for (int j = 0; j < i; j++) {
                if (input[i] == input[j]) {
                    i--;
                }
            }
        }
        // 비정방형 배열 출력
        // 출력할 숫자가 열의 크기보다 클 때
        if (num > row) {
            // 출력할 숫자를 열으로 나눈 나머지가 0이 아닐 때
            if (num % row != 0) {
                array = new int[(num / row) + 1][]; // (num / row) 에 나머지 숫자를 위한 1행 추가
                for (int i = 0; i < array.length; i++) {
                    // 출력할 행의 최대 크기에 도달했을 때
                    if (i == array.length - 1) {
                        // 나머지 숫자 크기만큼 비정방형 배열 생성
                        array[i] = new int[num % row];
                        for (int j = 0; j < array[i].length; j++) {
                            array[i][j] = input[j + (i * row)];
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.println();
                    } else {
                        // row 로 지정한 크기의 배열 생성
                        array[i] = new int[row];
                        for (int j = 0; j < array[i].length; j++) {
                            array[i][j] = input[j + (i * row)];
                            System.out.print(array[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
            // 출력할 숫자가 열으로 나누어 떨어질 때
            } else {
                array = new int[(num / row)][];
                for (int i = 0; i < array.length; i++) {
                    array[i] = new int[row];
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = input[j + (i * row)];
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        // 출력할 숫자가 열의 크기보다 작을 때
        } else {
            array = new int[1][num];
            for (int j = 0; j < array[0].length; j++) {
                array[0][j] = input[j];
                System.out.print(array[0][j] + " ");
            }
            System.out.println();
        }
    }

}
