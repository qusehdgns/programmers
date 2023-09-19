package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120820
 */
public class 나이_출력 {
    public static void main(String[] args) {
        System.out.println(solution(40));   // 1983
        System.out.println(solution(23));   // 2000
    }

    public static int solution(int age) {
        return 2023 - age;
    }
}
