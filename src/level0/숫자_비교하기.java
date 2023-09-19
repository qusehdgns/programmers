package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120807
 */
public class 숫자_비교하기 {
    public static void main(String[] args) {
        System.out.println(solution(2, 3));     // -1
        System.out.println(solution(11, 11));   // 1
        System.out.println(solution(7, 99));    // -1
    }

    public static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
