package NestedClasses_Singleton;

public class NestedInnerClass {

    private int number = 9;


    class InnerClass {
        public void word(){
            System.out.println("GetWord");
        }
        public void showNumber(){
            System.out.println(number);
        }
    }



    public void getWord(){
        InnerClass innerClass = new InnerClass();
        innerClass.word();
    }


}
