package Java_W2_Day_02_modifier_static.baitap;

public class Circle {
    private  double radius=1;
    private String color="red";
public Circle(){

}
public Circle(double radius){
    this.radius=radius;
}
      double getRadius() {
        return radius;
    }

    double getArea() {
        return radius*radius*Math.PI;
    }

}
