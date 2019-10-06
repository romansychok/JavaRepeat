package inher_Abst_Interfaces.hm_inhe_abst_interf;

public class Main {
    public static void main(String[] args) {


        Boy boy = new Boy("Roman",25,80,180,"cat");
        System.out.println(boy);
        boy.benchPress();
        boy.champion();
        boy.eat();
        boy.job();
        boy.sport();
        System.out.println(boy.MAX_SQUAT);

        System.out.println();

        Girl girl = new Girl("Tania",25,"Brown","Brown",false);
        System.out.println(girl);
        girl.happy();
        girl.favoriteCity();
        girl.eat();
        girl.job();
        girl.sport();
        System.out.println(girl.TYPE_OF_DANCE);


    }
}
