package Lesson2;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int x = 1;
        while (x < 1000) {
            x++;
            sum += x;
        }
        int a = sum / 1234;
        int b = sum % 1234;
        boolean c = b > a;
        System.out.println(c);

    }
}
