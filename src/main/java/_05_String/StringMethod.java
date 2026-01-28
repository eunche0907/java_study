package _05_String;

public class StringMethod {
    public static void main(String[] args) {
        /*
        첫글자 소문자 : 기본자료형
        첫글자 대문자 : 참조자료형

        .java -> 컴파일 -> .class
        JVM은 .class 파일을 읽고 실행시키는 녀석
        -JVM의 메모리 (stack + heap)
        -메모리 관리(참조주소...) 알아서 실행
        1.stack
            -원시자료형들의 실제 값이 저장된다
            -참조자료형의 메모리 주소(heap)가 저장된다.

        2.heap
            -참조자료형의 실제 값이 저장된다.

        ----------------------

        참조 자료형은 참조를 통해서 여러 기능(메서드)을 사용할 수 있음


         */

        String str = "Hello, My name is Son";
        //문자열의 길이 - 문자의 갯수
        int lengthOfStr = str.length();
        //특정 문자열의 포함여부
        boolean isSon = str.contains("Son");


        //문자열은 문자들이 이어져있는 구조
        //순서(index)가 존재
        //특정 문자열이 어디서(index) 시작하는지?
        int indexOfSon = str.indexOf("Son");

        //문자열의 일부분을 추출
        //substring(index) - index부터 끝까지 잘라옴
        //substring(index1,index2)
        //index1 이상 index2 미만 잘라오겠다
        String son = str.substring(11);
        String son2 = str.substring(indexOfSon);
        System.out.println(son);
        System.out.println(son2);

        //아래 email에서 아이디만 추출
        //조건) 아이디가 바뀌더라도 아이디가 추출되게
        String email = "javavava@java.net";
        int indexOfEmail = email.indexOf("@");
        String emailIndex = email.substring(0,indexOfEmail);
        System.out.println(emailIndex);




    }
}
