package _17_abstract.a;

//Payment를 상속받아서 구현
//pay - 20000이상시 1000원 할인
public class Toss extends Payment {
    public Toss() {
        super("토스");
    }

    @Override
    public double pay(int price) {
        if (price >= 20000) {
            return price-1000;
        } else {
            return price;
        }
    }
}
