package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181936
 */
public class 공배수 {
    public static void main(String[] args) {
        System.out.println(solution(60, 2, 3));     // 1
        System.out.println(solution(55, 10, 5));    // 0
    }

    public static int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
