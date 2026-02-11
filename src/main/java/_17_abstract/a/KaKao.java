package _17_abstract.a;

public class KaKao extends Payment{
    public KaKao() {
        super("카카오페이");
    }

    @Override
    public double pay(int price) {
        //15000원 이상이면 5퍼 할인 리턴
        if (price >= 15000) {
            return price * 0.95;
        } else {
            return price;
        }
    }
}
