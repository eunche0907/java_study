package _11_Method;

public class Practice2 {
    public static int calcTotal(int kor,int eng,int math){
        int totalScore = kor + eng + math;
        return totalScore;
    }

    public static double calcAvg(double totalScore){
        double average = totalScore/3;
        return average;
    }

    public static String getGrade(double average){
        String getGrade;
        if(average >= 90){
            getGrade = "A";
        }
        else if(average >= 80){
            getGrade = "B";
        }
        else if(average >= 70) {
            getGrade = "C";
        }
        else{
            getGrade = "D";
        }
        return getGrade;

    }


    public static void printStudentInFo(String name,int kor, int eng, int math){
        //메서드 3개를 완성해서 에러를 없애주세요
        //getGrade : 90 이상 A, 80이상 90미만 B, 70이상 80 미만 C
        //이외에는 D
        int totalScore = calcTotal(kor,eng,math);
        double average = calcAvg(totalScore);
        String grade = getGrade(average);

        System.out.println("이름 : " + name);
        System.out.println("총점 : " + totalScore);
        System.out.println("평균 : " + average);
        System.out.println("학점 : " + grade);

    }



    public static void main(String[] args) {
        //학생 성적관리
        printStudentInFo("김철수",85,90,70);
        //main()
        // -> printStudentInfo()
        // -> calcTotal(),calcAverage(),getGrade()

    }
}
