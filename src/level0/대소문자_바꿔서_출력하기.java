package level0;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181949
 */
public class 대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Arrays.asList(new Scanner(System.in).next().split("")).forEach(str -> {
            System.out.print(Character.isUpperCase(str.charAt(0)) ? str.toLowerCase() : str.toUpperCase());
        });
    }
}
