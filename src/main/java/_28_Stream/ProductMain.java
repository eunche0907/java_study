package _28_Stream;

import java.util.Arrays;
import java.util.List;

public class ProductMain {
    List<Product> products = Arrays.asList(
            new Product("삼성 갤럭시북",3,true,2000000),
            new Product("애플 m1",5,true,190000),
            new Product("삼성 키보드",1,false,159),
            new Product("애플 매직펜슬",10,true,40000),
            new Product("로지텍 마우스",0,false,60000)
    );
    // 1. 이름에 삼성이 들어간 상품중 10만원 이하 상품리스트 추출
    List<Product> SamsungButNotSale = products.stream()
            .filter(product -> product.getName().contains("삼성"))
            .filter(product -> !product.isOnSale())
            .toList();

    // 2. 이름에 애플이 들어가지 않은 상품중 세일 중인 상품리스트 추출
    // 세일은 정가 *0,9 해서 추출
    List<Product> NotAppleButSale = products.stream()
            .filter(p -> !p.getName().contains("애플"))
            .filter(p -> p.isOnSale())
            .map(product -> {
                product.setPrice(product.getPrice() * 0.9);
                return product;
            })
            .toList();


    // 3. 세일중인 상품들(정가기준)의 총 전체 가격(재고량 * 가격)을 구해주세요
    double totalPrice = products.stream()
            .filter(p -> p.isOnSale())
            .map(p -> p.getStock() * p.getPrice()) //[5000000,0........]
            .reduce(0.0, (priceSum,price) -> priceSum + price);


}
