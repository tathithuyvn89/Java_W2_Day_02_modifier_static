package Java_W2_Day_02_modifier_static.thuchanhaccepmodifier.pack;

public class TeststasticProperty {
    public static void main(String[] args) {
        Car car1= new Car("Mazda 3","Skyactiv 3");
        System.out.println(car1.getNumberOfCars());
        //System.out.println(Car.numberOfCars);
        Car car2= new Car("Mazda 6","Skyactiv 6");
        Car car3= new Car("Mazda 8","Skyactiv 9");
        System.out.println(Car.numberOfCars);
        System.out.println(car2.getNumberOfCars());

    }
}
