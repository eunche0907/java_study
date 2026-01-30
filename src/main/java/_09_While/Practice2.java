package _09_While;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Practice2 {
    public static void main(String[] args) {
        //문자열 ""
        String ex = "";
        // isEmpty -> 빈문자열("")  검사
        //isBlank -> 빈문자열 및 스페이스바,엔터 공백 검사

        Scanner scanner = new Scanner(System.in);
        String password = "1q2w3e4r";
        //비밀번호를 입력받아주세요
        //입력이 비어있으면, "다시입력하세요" (시도횟수 증가 X)
        //비밀번호가 틀리면 다시 입력 받게(맞추면 탈출)(시도 횟수 ++)
        //최대 5회 시도가능, 5회에 도달하면 "계정락" 탈출


        int count = 0;
        while (true) {

            System.out.println("비밀번호를 입력하세요 >> ");
            String ypassword = scanner.nextLine();

            if (ypassword.isEmpty()) {
                System.out.println("다시 입력하세요 >>");
                continue;
            }

            if (ypassword.equals(password)) {
                System.out.println("정답");
                break;
            } else {
                System.out.println("다시 입력하세요 >>");
                count += 1;
            }
            if (count == 5) {
                System.out.println("계정락");
                break;

            }


        }
    }

}