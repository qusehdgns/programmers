package level0;

public class n의_배수 {
    public static void main(String[] args) {
        System.out.println(solution(98, 2));    // 1
        System.out.println(solution(34, 3));    // 0
    }

    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}
