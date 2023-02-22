package test05_제네릭과컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q02_학점평균 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var grade = new ArrayList<Character>();
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F>>");
        String input = sc.nextLine();
        String replaced = input.replace(" ", "");
        var score = new HashMap<Character, Double>();
        score.put('A', 4.0);
        score.put('B', 3.0);
        score.put('C', 2.0);
        score.put('D', 1.0);
        double sum = 0;
        for (int i = 0; i < replaced.length(); i++) {
            grade.add(replaced.charAt(i));
            if (score.containsKey(replaced.charAt(i)) == true) {
                sum += score.get(replaced.charAt(i));
            }
        }
        System.out.println(sum / grade.size());
    }

}
