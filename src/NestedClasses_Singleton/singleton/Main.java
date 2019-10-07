package NestedClasses_Singleton.singleton;

public class Main {
    public static void main(String[] args) {

        Person person = Person.getSingleton();
        person.setName("Ahur");
        person.setAge(25);
        System.out.println(person);

        Person person1 = Person.getSingleton();
        System.out.println(person1);


    }
}
