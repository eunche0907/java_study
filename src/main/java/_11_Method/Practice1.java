package _11_Method;

public class Practice1 {
    //1.숫자를 매개변수로 전달받음
    //2.전달받은 숫자가 짝수면 true,홀수면 false리턴
    // 이름 : isEven

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    // 2.int[] nums, int num을 매개변수로 전달받음
    // num이 nums에 존재하는 숫자인지?
    //존재하면 true, 안하면  false리턴
    public static boolean containsNum(int[] nums, int num) {
        //num이 nums에 있는건가?
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                return true; //찾으면 즉시 메서드 종료
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] myNums = {1,2,3,4};
        boolean result = containsNum(myNums,3);
        System.out.println("결과 : " + result);

    }

}

