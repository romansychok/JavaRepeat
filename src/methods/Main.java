package methods;

public class Main {
    public static void main(String[] args) {

        sum(4,2);
        System.out.println(division(10, 2));
        System.out.println(multiplaysum(2,2,4));

    }

    public static void word(){
        System.out.println("Hello");
    }

    public static void sum(){
        System.out.println(5+5);
        word();
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
        word();
    }

    public static int division(int a, int b){
        int sum = a / b;
        return sum;
    }

    public static int multiplay(int a ,int b){
        return a*b;
    }

    public static int multiplaysum(int a , int b, int c){
        int sum = multiplay(a,b) + c;
        return sum;
    }

}
