package level0;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181889
 */
public class n_번째_원소까지 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 1)));           // [2]
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5}, 3)));     // [5, 2, 1]
    }

    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}
