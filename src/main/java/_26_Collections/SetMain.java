package _26_Collections;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        // Set - 구현체 : HashSet
        // 저장을 위한 자료구조라기 보단, 연산을 위한 자료구조
        // 순서가 보장되지 않는다, 중복을 허용하지 않는다.

        Set<String> fruits = new HashSet<>();
        //추가 - add()
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println(fruits.size()); //길이

        //포함하는지 확인 - 해쉬함수를 사용하기 때문에 매우 빠름
        System.out.println(fruits.contains("banana"));

        //제거도 빠르다
        System.out.println(fruits.remove("apple"));

        //집합연산을 지원한다
        Set<String> names1 = new HashSet<>();
        Set<String> names2 = new HashSet<>();

        names1.add("홍길동");
        names1.add("박길동");
        names1.add("고길동");

        names2.add("박길동");
        names2.add("최길동");
        names2.add("김길동");

        // 1.합집합 - addAll()
        Set<String> union = new HashSet<>(names1);
        union.addAll(names2);

        // 2. 교집합 - retainAll()
        Set<String> intersection = new HashSet<>(names1);
        intersection.retainAll(names2); //중복된 값만 남김

        // 3.차집합 - removeAll()
        Set<String> difference = new HashSet<>(names1);
        difference.removeAll(names2); //중복값만 제거

    }
}
