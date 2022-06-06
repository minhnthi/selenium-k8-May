package lab_06;

public class Lab06_01_Calculator {
    public int sum(int hrs, int min) {
        return hrs * 60 + min;
    }
    public static void main(String[] args) {
        Lab06_01_Calculator lab61Calculator = new Lab06_01_Calculator();
        System.out.println(lab61Calculator.sum(2, 5));
    }
}
