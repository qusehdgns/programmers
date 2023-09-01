package level0;

import java.util.Scanner;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181950
 */
public class 문자열_반복해서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

//        for (int i = 0; i < n; i++) {
//            System.out.printf(str);
//        }

        System.out.println(str.repeat(n));
    }
}
