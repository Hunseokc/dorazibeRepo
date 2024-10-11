package ThisIsJava.ch15.sec05.ex4;

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        // Comparable 안쓸거면 TreeSet에 객체로 Comparator 구현 객체인 비교자 넣어야함
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());;

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + "-" + fruit.price);
        }
    }
}
