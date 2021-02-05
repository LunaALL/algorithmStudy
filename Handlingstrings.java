import java.util.Random;

public class Handlingstrings {

    public static void main(String[] args) {
        String s1="12345";
        boolean fi=solution(s1);
        System.out.println(fi);

    }

    public static boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4 && s.length()!=6){
            return answer=false;
        }
        for(char a: s.toCharArray()){
            if(a >= 48 && a<=57) {
                continue;
            } else{
                answer=false;
                break;
            }
        }
        return answer;
    }
}
