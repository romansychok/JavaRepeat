package classez;

public class Main {
    public static void main(String[] args) {




       Person person = new Person("Victor", 59);

       person.setAge(35);
        System.out.println(person);
        System.out.println(person.getName());


        Person person1 = new Person("Felix",2);
        Person person2 = new Person("Felix",2);

        System.out.println(person1);

        System.out.println(person1.equals(person2));


    }
}
