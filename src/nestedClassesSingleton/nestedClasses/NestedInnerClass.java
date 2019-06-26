package nestedClassesSingleton.nestedClasses;

public class NestedInnerClass {

    private int num = 9;

    class InnerClass {

        public void word(){
            System.out.println("Hello");
        }

        public void number(){
            System.out.println(num);
        }

    }

    public void getWord(){
        InnerClass innerClass = new InnerClass();
        innerClass.word();
    }


}
