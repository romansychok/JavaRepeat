package inherAbstInterf;

public class Main {
    public static void main(String[] args) {


       /* Animal animal = new Animal("Felix",2);

        System.out.println(animal);*/

//        Fish fish = new Fish("Fishy",1,"shark");
//
//        System.out.println(fish);
//
////        fish.hungry();
        System.out.println();

        /*Mamal mamal = new Mamal("Fred",35,"white");
        System.out.println(mamal);
        mamal.hungry();
        mamal.voice();*/

//        Cat cat = new Cat("Felix",2,"black-white",100500);
//        System.out.println(cat);
//        cat.hungre();
//        cat.hungry();
//        cat.voice();

//        Cat cat = new Kitten();
//        cat.hungry();


        Kitten kitten = new Kitten("Felix",2,"black-white",100500,"Filka");
        System.out.println(kitten);
        kitten.hungry();
        kitten.hungre();
        kitten.voice();
        kitten.fuel();
        kitten.sound();
        kitten.spin();
        kitten.scream();
        kitten.turbo();
        System.out.println(kitten.NUMBER_OF_WHEELS);
        System.out.println(kitten.WINGS_SPEED);




    }
}
