package _06_If;

public class IfStudy {
    public static void main(String[] args) {
      /*
        if(boolean 데이터) {
            // true일때 실행되는 코드

        }
       */
        if(true) {
            System.out.println("저는 항상 실행");

        }
        if(false){
            System.out.println("저는 절대 실행 X");
        }
        int height = 160;
        int age = 23;
        if(height >= 120){
            System.out.println("탑승가능!");
        }

        if(height >= 120 && age < 13){
            System.out.println("탑승가능!");
        }
        String sample = "Study java";
        if(sample.contains("java")){
            System.out.println("자바공부중");
        }

        //if ~ else if ~ else
        //여러조건을 동시에 검사할 때
        //1.코드는 위에서 아래로 실행된다
        //2.하나의 코드구역만 실행되고 종료
        // -> 단계별로 조건을 작성해야 한다
        //오름차순, 내림차순으로
        age = 15;
        if(age<=7){
            System.out.println("미취학아동");
        } else if(age <= 13){// age > 7
            System.out.println("초등학생");
        }else if(age <= 16){//age > 13
            System.out.println("중학생");
        }else if(age <= 19){
            System.out.println("고등학생");
        }else{//위의 조건들이 모두 false일때
            System.out.println(("성인"));
        }
        //로그인 되었나요?
        boolean isLogin = false;
        //정지계정인가요?
        boolean isBanned = true;
        //로그아웃이라면
        if(!isLogin){
            System.out.println("로그인이 필요함니다");
        }else if(isBanned){
            System.out.println("정지된 계정이에요");
        }
        //얼리 리턴
        if(!isLogin){
            System.out.println("로그인 하세요");
            return; //메서드 종료 -> main 종료
        }
        if(isBanned){
            System.out.println(("정지된 계정"));
        }
    }
}
