package Lesson4;

public class ConcatExample {
    public static void main(String[] args) {
        System.out.println(concat("The method", " consists", "three parameters"));
    }

    public static String concat(String firstParameter, String secondParameter, String thirdParameter) {
        String result = firstParameter + secondParameter + thirdParameter;
        return result;
    }
}
