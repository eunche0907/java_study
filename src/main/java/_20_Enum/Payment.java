package _20_Enum;

//객체수단별로 객체상수들을 정의해주세요
//필드 : int feeRate,String korName
// CASH - 현금 - 0
// CARD - 카드 - 2
// MOBILE - 핸드폰결제 - 5
// int price를 매개변수로 받아서 수수료를 리턴하는 메서드
public enum Payment {
    CASH("현금",0),
    CARD("카드",2),
    MOBILE("핸드폰결제",5);

    private String korName;
    private int feeRate;

    Payment(String korName, int feeRate) {
        this.korName = korName;
        this.feeRate = feeRate;
    }

    public double calcFee(int price){
        double fee = this.feeRate * price / 100.0;
        return fee;
    }

}
