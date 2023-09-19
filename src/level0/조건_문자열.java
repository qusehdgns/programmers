package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */
public class 조건_문자열 {
    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50));     // 1
        System.out.println(solution(">", "!", 41, 78));     // 0
    }

    public static int solution(String ineq, String eq, int n, int m) {
        boolean bResult = false;

        switch (ineq + eq) {
            case "<=":
                bResult = n <= m;
                break;
            case "<!":
                bResult = n < m;
                break;
            case ">=":
                bResult = n >= m;
                break;
            case ">!":
                bResult = n > m;
                break;
        }

        return bResult ? 1 : 0;
    }
}
