package ThisIsJava.ch17.sec04.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx_Collection {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        for (int i = 1; i<=5; i++) {
            // 객체 생성 반복 후 배열(리스트)에 삽입
            Product product = new Product(i, "상품"+i, "멋진 회사 ", (int) (10000*Math.random()));
            list.add(product);
        }
        Stream<Product> stream = list.stream();
        // 실행될 함수는 toString
        // 엄밀히 말하면 toString이 override되어
        // println에 Person 타입 객체 p를 넣기를 반복하면
        // 재정의된 toString이 실행
        stream.forEach( p -> System.out.println(p));
    }
}
