package level0;

import java.util.Scanner;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181944
 */
public class 홀짝_구분하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.printf("%d is %s", n, (n & 1) == 0 ? "even" : "odd");

        sc.close();
    }
}
