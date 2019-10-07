package NestedClasses_Singleton;

public class NestedLocalInnerClass {

    public void methodClass(){

        class LocalInnerClass{

            public void word(){
                System.out.println("Hey");
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.word();

    }
}
