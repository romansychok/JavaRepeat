package singleton;

public class Main {
    public static void main(String[] args) {

        Person person = Person.getSingleton();

        person.setName("Roman");
        person.setAge(24);
        System.out.println(person);

    }
}
