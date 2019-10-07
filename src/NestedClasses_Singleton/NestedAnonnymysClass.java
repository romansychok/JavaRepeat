package NestedClasses_Singleton;


interface Message{

    String message();

}

//abstract class Annon{
//    public abstract void word();
//}

public class NestedAnonnymysClass {

//    Annon annon = new Annon() {
//        @Override
//        public void word() {
//            System.out.println("Hi");
//        }
//    };

    public void showMessage(Message m){
        System.out.println(m.message() + " and a bottle of rum");
    }

    public void call(){
        NestedAnonnymysClass nestedAnonnymysClass = new NestedAnonnymysClass();
        nestedAnonnymysClass.showMessage(new Message() {
            @Override
            public String message() {
                return "Yohoho ";
            }
        });
    }



}



