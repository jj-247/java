package study01_자바기본;

import java.util.Random;

public class S09_Random {

    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt(10) + 1; // 1~10
    }

}
