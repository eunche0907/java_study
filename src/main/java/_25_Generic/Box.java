package _25_Generic;

// 제너릭타입
// <T>, <K,V>, <K,V,E>
public class Box<T> {
    private T item; //런타임에 Object 타입이 됨

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Box(T item){
        this.item = item;

    }
    public void printBox(){
        System.out.println("저는 제너릭 수업용 객체입니다");
    }

}
