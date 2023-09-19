package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 */
public class flag에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));      // 3
        System.out.println(solution(-4, 7, false));     // -11
    }

    public static int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
