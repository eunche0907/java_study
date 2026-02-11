package _17_abstract.a;

public class Main {
    public static void paying(Payment payment, int price){
        System.out.println("결제 시스템을 초기화합니다");
        System.out.println("선택하신 결제 : " + payment.getName());
        double finalPrice = payment.pay(price);
        System.out.println("최종 금액 : " + finalPrice);
    }

    public static void main(String[] args) {
        Payment kakao = new KaKao();
        paying(kakao,20000);


        //SOLID 원칙 - 객체지향 설계원칙
        //개방폐쇄원칙 OCP
        Payment Toss = new Toss();
        paying(Toss,20000);
    }
}
