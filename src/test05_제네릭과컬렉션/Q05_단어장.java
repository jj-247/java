package test05_제네릭과컬렉션;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Q05_단어장 {

    Vector<Word> words; // 단어를 저장하기 위한 컬렉션
    Vector<Word> choices; // 정답을 포함한 선택지를 입력하기 위한 컬렉션
    int[] questions; // 중복 문제 출제 방지를 위한 배열
    int questionNum; // 문제 번호
    int answerNum = 4; // 선택지 수
    boolean testContinue = true; // -1 단어테스트 종료 기능
    boolean check = true; // 단어 입력 중복 체크
    Scanner sc = new Scanner(System.in);

    public void start() {
        words = new Vector<>();
        words.add(new Word("Aristides", "아리스티데스"));
        words.add(new Word("Gibson", "깁슨"));
        words.add(new Word("Fender", "펜더"));
        words.add(new Word("PRS", "피알에스"));
        words.add(new Word("Tyler", "타일러"));
        words.add(new Word("Suhr", "써"));
        words.add(new Word("Strandberg", "스트랜드버그"));
        words.add(new Word("Ibanez", "아이바네즈"));
        words.add(new Word("MusicMan", "뮤직맨"));
        words.add(new Word("Jackson", "잭슨"));
        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다 ****");
        while (true) {
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3 >>");
            int select = sc.nextInt();
            if (select == 1) {
                sc.nextLine();
                test();
            } else if (select == 2) {
                sc.nextLine();
                insert();
            } else if (select == 3) {
                System.out.println("\"명품영어\"를 종료합니다.");
                sc.close();
                break;
            } else {
                System.out.println("잘못 입력");
            }
        }
    }

    public void test() {
        System.out.printf("현재 %d 개의 단어가 들어있습니다. -1을 입력하면 테스트를 종료합니다. %n", words.size());
        Random rd = new Random();
        choices = new Vector<>();
        questions = new int[words.size()];
        questionNum = 0;
        // 중복 문제 제거
        for (int i = 0; i < words.size(); i++) {
            questions[i] = rd.nextInt(words.size());
            for (int j = 0; j < i; j++) {
                if (questions[i] == questions[j]) {
                    i--;
                }
            }
        }
        while (testContinue) {
            // 문제 선택
            int question = questions[questionNum];
            // 정답을 제외한 중복제거 선택지 입력
            for (int i = 0; i < answerNum; i++) {
                int index = rd.nextInt(words.size());
                if (index != question) {
                    choices.add(words.get(index));
                    for (int j = 0; j < i; j++) {
                        if (choices.get(i) == choices.get(j)) {
                            choices.remove(j);
                            i--;
                        }
                    }
                } else {
                    i--;
                }
            }
            // 랜덤한 위치에 정답을 입력하고 선택지 수를 벗어난 항목 제거하여 선택지 완성
            choices.add(rd.nextInt(answerNum - 1), words.get(question));
            choices.remove(answerNum);

//			Iterator를 활용하는 방법도 가능
//			Iterator<Word> it = choices.iterator();
//			while (it.hasNext()) {
//				Word kor = it.next();
//				System.out.print(kor.getKor() + " ");
//			}
            while (true) {
                // 문제 출력
                System.out.printf("문제(%d) 다음중 %s의 뜻은 무엇인지 고르시오. %n", questionNum + 1, words.get(question).getEng());
                // 선택지 출력
                for (int i = 0; i < answerNum; i++) {
                    System.out.printf("(%d) %s ", i + 1, choices.get(i).getKor());
                }
                System.out.print(":> ");

                try {
                    int answer = sc.nextInt();
                    if (answer > 0 && answer <= answerNum) {
                        if (words.get(question).getKor().equals(choices.get(answer - 1).getKor())) {
                            System.out.println("Excellent !!");
                            break;
                        } else {
                            System.out.println("Wrong Answer !!");
                            break;
                        }
                    } else if (answer == -1) {
                        System.out.println();
                        // 단어 테스트 종료
                        testContinue = false;
                        break;
                    } else {
                        System.out.println("잘못 입력");

                    }

                } catch (Exception e) {
                    System.out.println("숫자를 입력하세요");
                    sc.nextLine();
                }
            }
            // 다음 문제로 넘어가기
            if(questionNum == words.size()-1) {
                System.out.println("모든 문제를 다 풀었습니다.");
                System.out.println();
                break;
            }else {
                questionNum++;
            }
            choices.clear();
        }

    }

    public void insert() {
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        while (true) {
            System.out.print("영어 한글 입력 >> ");
            String insert = sc.nextLine();
            if (insert.equals("그만")) {
                System.out.println("총 단어 개수 : " + words.size());
                System.out.println();
                break;
            }
            Word newWord = new Word(insert.split(" ")[0], insert.split(" ")[1]);
            for(Word item : words) {
                // new를 통해 생성된 다른 객체이기 때문에 문자열이 같아도 주소값이 다르다( == 사용시 false)
                if(item.toString().equals(newWord.toString())) {
                    System.out.println("중복된 단어입니다.");
                    check = false;
                }
            }
            if(check==true) {
                words.add(newWord);
            }
        }

    }

    public static void main(String[] args) {
        Q05_단어장 wordTest = new Q05_단어장();
        wordTest.start();
    }

}
