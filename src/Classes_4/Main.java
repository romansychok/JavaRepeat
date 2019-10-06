package Classes_4;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.name ="Roman";
        person.age = 25;

        System.out.println(person);

        Person cat = new Person("Filka",2);
        System.out.println(cat);

        Person cat1 = new Person("Filka",2);

        System.out.println(cat == cat1);
        System.out.println(cat.equals(cat1));

        cat.sayHello();


        Car car = new Car("Skoda",240);

        System.out.println(car);

        car.setSpeed(250);
        System.out.println(car);

        System.out.println(car.getModel());


    }
}
