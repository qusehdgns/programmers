package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */
public class 문자열_곱하기 {
    public static void main(String[] args) {
        System.out.println(solution("string", 3));      // "stringstringstring"
        System.out.println(solution("love", 10));       // "lovelovelovelovelovelovelovelovelovelove"
    }

    public static String solution(String my_string, int k) {
//        String answer = "";
//
//        for (int i = 0; i < k ; i++) {
//            answer += my_string;
//        }
//
//        return answer;

        return my_string.repeat(k);
    }
}
