package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120829
 */
public class 각도기 {
    public static void main(String[] args) {
        System.out.println(solution(70));   // 1
        System.out.println(solution(91));   // 3
        System.out.println(solution(180));  // 4
    }

    public static int solution(int angle) {
        return angle < 90 ? 1 : angle == 90 ? 2 : angle < 180 ? 3 : 4;
    }
}
