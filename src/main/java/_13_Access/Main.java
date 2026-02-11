package _13_Access;

public class Main {
    public static void main(String[] args) {
        Access a1 = new Access("데이타");
        // a1.data = "0000"; data가 private이기 때문
        a1.setData(""); //검증된값만 들어가도록
        a1.setData("0000"); //ok

        WaterBottle w1 = new WaterBottle(); // current? 100
        w1.drink(120);
        w1.drink(80);
        w1.fill(1200);

        WaterBottle w2 = new WaterBottle();
        w2.drink(40);
        w2.drink(50);
        //->각 객체가 가진 값마다 서로 다르게 동작
        //객체지향 프로그래밍

        //private라서 호출 불가
        //w1.isPoisitive(100);





    }
}
