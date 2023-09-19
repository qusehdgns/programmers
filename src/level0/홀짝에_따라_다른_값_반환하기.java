package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */
public class 홀짝에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        System.out.println(solution(7));    // 16
        System.out.println(solution(10));   // 220
    }

    public static int solution(int n) {
        int answer = 0;

        if ((n & 1) == 0) {
            for (int i = 2; i <= n; i += 2) {
                answer += (int) Math.pow(i, 2);
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        }

        return answer;
    }
}
