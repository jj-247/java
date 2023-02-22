package test02_클래스와객체;

public class Hall {

    private String[][] seat = new String[3][10];

    public Hall() {
        // Hall 객체가 생성될 때 3 x 10 크기의 좌석 배열 생성
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                seat[i][j]="---";
            }
        }
        System.out.println("콘서트 홀 예약 시스템입니다.");
    }

    public void rankSelect(int rank) {
        // 좌석 등급 선택
        if(rank == 1) {
            System.out.print("S>> ");
        }else if(rank == 2) {
            System.out.print("A>> ");
        }else {
            System.out.print("B>> ");
        }
        for(int i=0; i<seat[rank-1].length; i++) {
            System.out.print(seat[rank-1][i]+" ");
        }
        System.out.println();
    }

    public void res(int rank, String name, int seatNum) {
        // 좌석 예약하기
        if(seat[rank-1][seatNum-1].equals("---")) { // 빈 자리일 때
            seat[rank-1][seatNum-1] = name;
        }else { // 이미 예약된 자리일 때
            System.out.println("이미 예약된 자리입니다");
        }
    }

    public void resStatus() {
        // 예약 상태 확인하기
        for (int i = 0; i < seat.length; i++) {
            if(i == 0) {
                System.out.print("S>> ");
            }else if(i == 1) {
                System.out.print("A>> ");
            }else {
                System.out.print("B>> ");
            }
            for(int j = 0; j < seat[i].length; j++) {
                System.out.print(seat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("<<<조회를 완료하였습니다>>>");
    }

    public void resCancel(int rank, String name, int seatNum) {
        // 예약 취소하기
        if(seat[rank-1][seatNum-1].equals(name)) { // 예약된 이름이 입력된 이름과 같을 때 예약 취소 성공
            seat[rank-1][seatNum-1] = "---";
        }else if(seat[rank-1][seatNum-1].equals("---")) { // 선택한 좌석이 공석일 때
            System.out.println("미예약된 자리입니다.");
        }else { // 예약된 이름과 입력된 이름이 일치하지 않을 때
            System.out.println("이름 잘못입력");
        }
    }

}
