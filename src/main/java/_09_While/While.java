package _09_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
    /*
        while(조건식){
            //조건식이 참인 동안 반복될 코드
          }//조건식 결과가 false가 되면 탈출

          for문 - "횟수"가 명확할 때
          while문 - "조건"이 명확할 때

     */


        int count = 0; //외부변수
        boolean flag = true; //외부 변수
        while(flag) { //탈출조건
            count += 1;
            System.out.println("현재 count : "+ count);
            if(count == 5){
                flag = false; //탈출조건을 조작하는 코드

            }
        }

        //실습) 1~100 누적합 하는데
        //누적합이 1000이 넘어가면 탈출하는 while문
        int sum = 0;
        int num = 0;
        while(num <= 100){
            num += 1;
            sum += num;
            System.out.println(sum);
            if(sum>=1000){
                break;

            }
       }

        Scanner scanner =new Scanner(System.in);

        boolean isLogin = true; //flag
        while(isLogin){
            System.out.println("로그인 상태입니다");

            System.out.println("로그아웃 하시겠습니까?(y/n)");
            String choice = scanner.nextLine();
            if(choice.equals("y")){
                isLogin = false;
            }
        }
        System.out.println("로그아웃");

        //do-while문 : (실행 -> 조건확인)xn -> 탈출
        //while문 : (조건확인 -> 실행)xn -> 탈출

        int x = 10;
        do{
            System.out.println("실행될걸요?");
        }while(x < 5);
    }
}
