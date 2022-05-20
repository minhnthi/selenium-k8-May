package lesson_2;

public class BitWiseOperator {

    public static void main(String[] args) {

        if(method1() && method2()){
            System.out.println("\t Inside the function");
        }
    }
    private static boolean method1(){
        System.out.println("method1");
        return false;
    }
    private static boolean method2(){
        System.out.println("method2");
        return true;
    }

}
