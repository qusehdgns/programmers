package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */
public class 문자열_섞기 {
    public static void main(String[] args) {
        System.out.println(solution("aaaaa", "bbbbb"));     // "ababababab"
    }

    public static String solution(String str1, String str2) {
//        char[] cArr = new char[str1.length() + str2.length()];
//
//        for (int i = 0; i < str1.length(); i++) {
//            cArr[i * 2] = str1.charAt(i);
//            cArr[(i * 2)+1] = str2.charAt(i);
//        }
//
//        return new String(cArr);

        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        return answer;
    }
}
