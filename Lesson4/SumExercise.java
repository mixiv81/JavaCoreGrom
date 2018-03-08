package Lesson4;

public class SumExercise {

    static boolean compareSums(int a, int b, int c, int d) {
        if (sum(a, b) > sum(c, d))
            return true;
        else
            return false;
    }

    static long sum(int from, int to) {
        long res = 0;
        for (long i = from; i <= to; i++) {
            res += i;
        }
        return res;
    }
}
