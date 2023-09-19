package level0;

import java.util.stream.IntStream;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120831
 */
public class 짝수의_합 {
    public static void main(String[] args) {
        System.out.println(solution(10));   // 30
        System.out.println(solution(4));    // 6
    }

    public static int solution(int n) {
//        int answer = 0;
//
//        for (int i = 2; i <= n; i += 2) {
//            answer += i;
//        }
//
//        return answer;

        return IntStream.rangeClosed(1, n / 2).sum() * 2;
    }
}
