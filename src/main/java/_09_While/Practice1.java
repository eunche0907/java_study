package _09_While;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //1 이상 101미만 정수중에 하나를 랜덤하게 뽑기
        int randomNum = random.
                nextInt(1,101);
        System.out.println(randomNum);

        //입력값보다 랜덤값이 크면   "Up" 출력
        //입력값보다 랜덤값이 작으며 "Down" 출력
        //같으면 "정답입니다!" 출력하고 탈출
        int myPick = 0;
        int randomNum2 = random.nextInt(1,101);
        //시행횟수 5를 넘어가면 탈출
        int count = 0; // 시행횟수
        //탈출 조건이 많으면 가독성 X
        while(true) {
            System.out.println("1~100사이 입력 >");
            myPick = scanner.nextInt();
            //입력값이 1~100 사이가 아니라면
            if(myPick < 0 || myPick > 100){
                System.out.println("1~100을 입력하세요");
                continue; //다음반복으로 스킵
            }
            count += 1;
            if(count > 6){
                //카운트가 6일때
                System.out.println("시행횟수 초과!");
                break;
            }
            if(myPick < randomNum2) {
                System.out.println("Up");
            }

            if(myPick > randomNum2){
                System.out.println("Down");
            }

            if(myPick == randomNum2) {
                System.out.println("정답입니다!");
                break; //break -> 가장 가까운 반복문 중괄호 탈출
            }
        }
        //탈출



    }
}

