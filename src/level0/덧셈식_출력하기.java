package level0;

import java.util.Scanner;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181947
 */
public class 덧셈식_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

//        System.out.print(a + " + " + b + " = " + (a + b));

        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}
