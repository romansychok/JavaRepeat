package nestedClassesSingleton.nestedClasses;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*NestedInnerClass nestedInnerClass = new NestedInnerClass();
        NestedInnerClass.InnerClass innerClass = new NestedInnerClass().new InnerClass();
        innerClass.number();
        innerClass.word();*/

        ///////////////

        /*NestedStaticInnerClass.InnerStaticClass staticInnerClass = new NestedStaticInnerClass.InnerStaticClass();
        staticInnerClass.word();*/

//    NestedAnonnymusClass anonnymusClass = new NestedAnonnymusClass();
//    anonnymusClass.a.word();


        NestedAnonnymusClass anonnymusClass = new NestedAnonnymusClass();
        anonnymusClass.call();



    }
}
