package test06_입출력스트림과파일입출력;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Q11_행맨 {

    public static void main(String[] args) throws IOException {
        File file = new File("src\\test06_입출력스트림과파일입출력\\words.txt");
        Vector<String> words = new Vector<>();
        FileReader fr = new FileReader(file);
        Scanner fs = new Scanner(fr);
        while (fs.hasNext()) {
            words.add(fs.nextLine());
        }
        fs.close();
        System.out.println("지금부터 행맨 게임을 시작합니다.");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] hidden = new int[2];
        while (true) {
            // 문제 생성
            int index = rd.nextInt(words.size());
            StringBuffer question = new StringBuffer(words.get(index));
            for (int i = 0; i < hidden.length; i++) {
                hidden[i] = rd.nextInt(question.length());
                question.replace(hidden[i], hidden[i] + 1, "-");
                for (int j = 0; j < i; j++) {
                    if (hidden[i] == hidden[j]) {
                        i--;
                    }
                }
            }
            System.out.println(words.get(index)); // 테스트
            int failCount = 0;
            while (true) {
                // 문제 출력
                if (question.indexOf("-") == -1) {
                    System.out.println(question);
                    break;
                } else if (failCount == 5) {
                    System.out.println("5번 실패하였습니다.");
                    System.out.println(words.get(index));
                    break;
                } else {
                    System.out.println(question);
                }
                // 정답 입력
                System.out.print(">>");
                char answer = sc.next().charAt(0);
                if (question.charAt(hidden[0]) == '-' && answer == words.get(index).charAt(hidden[0])) {
                    question = question.replace(hidden[0], hidden[0] + 1, Character.toString(answer));
                }
                else if (question.charAt(hidden[1]) == '-' && answer == words.get(index).charAt(hidden[1])) {
                    question = question.replace(hidden[1], hidden[1] + 1, Character.toString(answer));
                }else {
                    failCount++;
                }
            }
            System.out.println("Next(y/n)?");
            String game = sc.next();
            if (game.equals("n")) break;
        }
    }

}
