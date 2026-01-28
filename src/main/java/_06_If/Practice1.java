package _06_If;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // 철수(174cm,70kg)
        //bmi = 체중(kg) / (키(m)*키(m))
        //bmi 30 이상 -> 비만, 25이상 ~ 30 미만 -> 과체중
        //18.5 이상 25미만 -> 정상, 18.5 미만 -> 저체중
        //철수의 비만도를 출력해주세요

        Scanner scanner = new Scanner(System.in);

        System.out.println("몸무게(kg)>>");
        int kg = scanner.nextInt();
        System.out.println("키(cm)>>");
        int height = scanner.nextInt();
        double meterHeight = height / 100.0;
        double bmi = kg / (meterHeight * meterHeight);

        //아래의 조건문을 입력받은 height / weight

        //값이 음수가 아닐때 실행되게 만들어 주세요

        // -> 양수 일때만 실행되게 해주세요

        if (bmi > 0) {

            if (bmi >= 30) {
                System.out.println(("비만"));
            } else if (bmi >= 25) {
                System.out.println("과체중");
            } else if (bmi >= 18.5) {
                System.out.println("정상");
            } else {
                System.out.println(("저체중"));
            }

            }
        else{
            System.out.println("값이 정확하지 않습니다");

        }




    }
}
