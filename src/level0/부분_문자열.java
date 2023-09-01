package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181842
 */
public class 부분_문자열 {
    public static void main(String[] args) {
        System.out.println(solution("abc", "aabcc"));   // 1
        System.out.println(solution("tbt", "tbbttb"));  // 0
    }

    public static int solution(String str1, String str2) {
        return str2.indexOf(str1) != -1 ? 1 : 0;
    }
}
