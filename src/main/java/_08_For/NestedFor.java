package _08_For;

public class NestedFor {
    public static void main(String[] args) {
        //2중 for문

        System.out.println(1 + "일 살았습니다");

        //일주일
        for (int day = 1; day <= 7; day += 1) {
            System.out.println(day + "일 살았습니다");

        }
        //한달
        //바깥반복이 한번 돌때 안쪽 반복이 전체반복
        for (int week = 1; week <= 4; week++) {
            System.out.println(week + "주 시작!");
            for (int day = 1; day <= 7; day += 1) {
                System.out.println("    " + day + "일 살았습니다");
            }
                System.out.println(week + "주 끝!");
            }

        //구구단
        /*
            2단 시작!
                2x1 = 2
                2x2 = 4
                ...
                2x9 = 18
            2단 끝!
            3단 시작!
                3x1 = 3
                3x2 = 6
                ...
            9단 끝!

         */
        for(int i = 2; i <= 9; i++){
            System.out.println(i + "단 시작!");
            for (int j = 1; j <=9; j ++) {
                System.out.println("    " + i + "x" + j + "=" + i*j );
            }
            System.out.println(i + "단 끝!");
        }
        }
    }
