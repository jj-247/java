package test01_자바기본;

import java.util.Scanner;

public class Q03_화폐변환 {
    // 입력 받은 금액에 맞춰 필요한 화폐 개수 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money = sc.nextInt();
        int[] cash = {50000, 10000, 5000, 1000, 500, 100};
        for (int i = 0; i < cash.length; i++) {
            if (money > 0) {
                System.out.println(cash[i] + "원권 " + money / cash[i] + "매");
                money %= cash[i];
            }
        }
//		System.out.println("오만원권 "+money/50000+"매");
//		System.out.println("만원권 "+money%50000/10000+"매");
//		System.out.println("오천원권 "+money%10000/5000+"매");
//		System.out.println("천원권 "+money%5000/1000+"매");
//		System.out.println("오백원 "+money%1000/500+"개");
//		System.out.println("백원 "+money%500/100+"개");
        sc.close();
    }

}
