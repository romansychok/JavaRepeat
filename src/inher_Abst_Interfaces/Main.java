package inher_Abst_Interfaces;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal("Cat",2);
//        System.out.println(animal);

//        Fish nemo = new Fish("Nemo",30,"deep sea");

//        System.out.println(nemo);
//        nemo.hungry();
//        nemo.voice();
//        nemo.breathUnderWater();


//        Mamal mamal = new Mamal("Felix",2,"BlackAndWhite");
//        System.out.println(mamal);
//        mamal.hungry();
//        mamal.notHungry();



//        Cat cat = new Cat("Filka",2,"blackAndWhite",100500);
//        System.out.println(cat);
//        cat.hungry();
//        cat.eat();
//        cat.voice();
//        cat.notHungry();


//        Cat cat = new Kitten();
//        System.out.print("Big ");
//        cat.hungry();
//        System.out.print(" too");


        Kitten kitten = new Kitten("Felix",2,"BlackAndWhite",
                100500,"Filka");
        System.out.println(kitten);
        kitten.hungry();
        System.out.println();
        kitten.eat();
        kitten.voice();
        kitten.notHungry();
        kitten.fuel();
        kitten.sound();
        kitten.spin();
        kitten.scream();
        kitten.turboSpeed();
        System.out.println(kitten.NUMBER_OF_WHEELS);
        System.out.println(kitten.WINGS_SPEED);




    }
}
