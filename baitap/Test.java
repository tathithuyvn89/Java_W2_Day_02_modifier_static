package Java_W2_Day_02_modifier_static.baitap;

import Java_W2_Day_02_modifier_static.thuchanhaccepmodifier.pack.Car;

public class Test {
    public static void main(String[] args) {
        Circle circle1= new Circle();
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());

    }
}
// Trong trường hợp này cả 2 lớp Test và Circle cùng 1 package, nên riêng kiểu Access modifier :Private là không thực hiện được