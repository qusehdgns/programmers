package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120803
 */
public class 두_수의_차 {
    public static void main(String[] args) {
        System.out.println(solution(2, 3));     // 3
        System.out.println(solution(100, 2));   // 98
    }

    public static int solution(int num1, int num2) {
        return num1 - num2;
    }
}
