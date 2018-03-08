package Lesson4;

public class Numbers {


    static int findDivCount(short a, short b, int n) {
       int res = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0)
                res ++;
        }
          return res;
        }
    }

