package level0;

//import java.util.Arrays;
//import java.util.stream.Collectors;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181941
 */
public class 문자_리스트를_문자열로_변환하기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"a", "b", "c"}));     // "abc"
    }

    public static String solution(String[] arr) {
//        return Arrays.stream(arr).collect(Collectors.joining());

        return String.join("", arr);
    }
}
