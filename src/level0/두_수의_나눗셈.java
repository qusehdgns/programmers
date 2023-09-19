package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120806
 */
public class 두_수의_나눗셈 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));     // 1500
        System.out.println(solution(7, 3));     // 2333
        System.out.println(solution(1, 16));    // 62
    }

    public static int solution(int num1, int num2) {
        return (num1 * 1000) / num2;
    }
}
