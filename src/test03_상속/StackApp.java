package test03_상속;

import java.util.Scanner;

public class StackApp {
    // Stack, StringStack

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int capacity = sc.nextInt();
        StringStack ss = new StringStack(capacity);
        while (true) {
            System.out.print("문자열 입력 >> ");
            String stack = sc.next();
            if (stack.equals("그만")) {
                break;
            }
            boolean push = ss.push(stack);
            if (push == false) {
                System.out.println("스택이 꽉 차서 푸시 불가");
            }
        }
        System.out.print("스택에 저장된 모든 문자열 팝: ");
        int len = ss.length();
        for (int i = 0; i < len; i++) {
            System.out.print(ss.pop() + " ");
        }
        sc.close();
    }

}
