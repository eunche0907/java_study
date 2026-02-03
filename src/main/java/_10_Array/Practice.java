package _10_Array;

public class Practice {
    public static void main(String[] args) {
        String[] employees = {"김철수","이영희","박민수","최지우"};

        //근무기록
        //{근무시간, 시급}
        int[][] workRecords = {
                {40,11000}, //김철수 기록
                {35,12000}, //이영희 기록
                {20,13000}, //박민수 기록
                {45,14000} //최지우 기록

        };

        //1.전체 인건비 계산하여 출력해주세요
        int totalPay = 0;
        for(int i = 0; i < workRecords.length; i++){
            int[] workRecord = workRecords[i];
            int hour = workRecord[0];
            int money = workRecord[1];
            int wage = hour * money;
            totalPay += wage;
        }
        System.out.println(totalPay + "원");
        //2.근무시간이 30시간 미만인 사람의 이름 출력
        //workRecords를 순회,hour가 30미만인 데이터의 idx 추출
        //찾은 idx로  employees[idx]이름을 가져올 수 있음
        for(int i = 0; i < workRecords.length; i++){
            int[] record = workRecords[i];
            int hour = record[0]; // 근무시간
            if(hour<30){
                int tergerIdx = i;
                String name = employees[i];
                System.out.println("30 미만 근무 : "+ name);
            }
        }

    }

}
