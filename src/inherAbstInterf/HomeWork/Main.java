package inherAbstInterf.HomeWork;

public class Main {
    public static void main(String[] args) {

        Boy boy = new Boy("Roman",24,true,80);
        System.out.println(boy);
        boy.drinkBear();
        boy.smoke();
        boy.goToGym();
        boy.eat();
        boy.specialization();
        System.out.println(boy.HOBBIE);
        System.out.println(boy.Univer);
        System.out.println();

        Girl girl = new Girl("Vika",23,false,true);
        System.out.println(girl);
        System.out.println(girl.doGirlLikeDance);
        girl.doSheHaveInst();
        girl.drinkVine();
        girl.eat();
        girl.favoriteLesson();
        girl.specialization();
        System.out.println(girl.Univer);
        System.out.println(girl.HOBBIE);


    }
}
