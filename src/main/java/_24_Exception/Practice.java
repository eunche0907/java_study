package _24_Exception;

import java.util.Scanner;

public class Practice {
    public static void email() throws email{
        Scanner scanner = new Scanner(System.in);
        System.out.print("이메일을 입력하세요 > ");
        String email = scanner.nextLine();
        if(email == null || email.trim().isBlank()){
            throw new email("이메일이 비었습니다 : " + email);
        } else if (!email.contains("@")) {
            throw new email("유효한 형식이 아닙니다 : " + email);
        }else{
            System.out.println("유효한 이메일 입니다");
        }

        // 1. 커스텀예외를 만들어주세요(InvalidEmailException)
        // 2. email이 빈문자열이면 예외생성 : "이메일 비었습니다 : {입력값}"
        // 3. email에 "@"가 없으면 예외생성 : "유효한 형식이 아닙니다 : {입력값}"
        // 정상이면 "유효한 이메일입니다" 출력
    }

    public static void main(String[] args) {
        // try-catch만 작성
        try {
            email();
        } catch (email e){
            System.out.println(e.getMessage());
        }

    }
}
