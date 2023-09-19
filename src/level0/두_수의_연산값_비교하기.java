package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181938
 */
public class 두_수의_연산값_비교하기 {
    public static void main(String[] args) {
        System.out.println(solution(2, 91));    // 364
        System.out.println(solution(91, 2));    // 912
    }

    public static int solution(int a, int b) {
        return Math.max((a * (int) Math.pow(10, (int)Math.log10(b) + 1)) + b, 2 * a * b);
//        return Math.max(Integer.parseInt("" + a + b), 2 * a * b);
    }
}
