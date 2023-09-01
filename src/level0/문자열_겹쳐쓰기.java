package level0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181943
 */
public class 문자열_겹쳐쓰기 {
    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d", "lloWorl", 2));       // "HelloWorld"
        System.out.println(solution("Program29b8UYP", "merS123", 7));   // "ProgrammerS123"
    }

    public static String solution(String my_string, String overwrite_string, int s) {
//        String result = "";
//
//        char[] myString = my_string.toCharArray();
//        char[] overwriteString = overwrite_string.toCharArray();
//
//        for (int i = 0; i < myString.length; i++) {
//            result += s <= i && i < s + overwrite_string.length() ? overwriteString[i - s] : myString[i];
//        }
//
//        return result;

        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }
}
