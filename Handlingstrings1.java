public class Handlingstrings1 {

    public static void main(String[] args) {
        String s = "Pyy";
        /* true 나와야함
        Pyy 는 false
         */
        System.out.println(solution(s));
        char p = 'p';
        char y = 'y';

        System.out.print((int) p);
        System.out.print((int) y);
    }

    static boolean solution(String s) {
        boolean answer = true;

        int nump = 0;
        int numy = 0;

        for (char c : s.toCharArray()) {

            if (c == 112) {
                nump++;
            }
            if (c == 121) {
                numy++;
            }
        }
        if (nump == numy) {
            return answer;
        } else {
            return answer = false;
        }

    }
}
