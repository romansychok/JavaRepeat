package inher_Abst_Interfaces.inhr;

public class Main {
    public static void main(String[] args) {

        Father father = new Father("Peter",45,"Director");
        System.out.println(father);
        father.eat();
        System.out.println();

        Son son = new Son("James",20,"coach",80);
        System.out.println(son);
        son.eat();
        System.out.println();

        Daugther daugther = new Daugther("Veronika",18,"manager","blonde");
        System.out.println(daugther);
        daugther.eat();


    }
}
