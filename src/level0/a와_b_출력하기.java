package level0;

import java.util.Scanner;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181951
 */
public class a와_b_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        System.out.print("a = "+a +"\n" +"b = "+b);

        sc.close();
    }
}
