package lab_06;

public class Lab06_01_Calculator {
    public static void main(String[] args) {
        String myStr= "2hrs and 5 minutes";

        int hrs = Integer.parseInt(myStr.substring(0,1));
        int minutes = Integer.parseInt(myStr.substring(9,10));

        int total = hrs *60 + minutes;
        System.out.println(total);
    }
}
