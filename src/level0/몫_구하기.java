package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120805
 */
public class 몫_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(10, 5));    // 2
        System.out.println(solution(7, 2));     // 3
    }

    public static int solution(int num1, int num2) {
        return num1 / num2;
    }
}
