package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */
public class 더_크게_합치기 {
    public static void main(String[] args) {
        System.out.println(solution(9, 91));    // 991
        System.out.println(solution(89, 8));    // 898
    }

    public static int solution(int a, int b) {
        return Math.max((a * (int) Math.pow(10, (int)Math.log10(b) + 1)) + b, (b * (int) Math.pow(10, (int)Math.log10(a) + 1)) + a);
//        return Math.max(Integer.parseInt("" + a + b), Integer.parseInt("" + b + a));
    }
}
