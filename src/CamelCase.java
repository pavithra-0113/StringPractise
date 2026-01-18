import java.util.Scanner;

public class CamelCase {

    private static void solution(String str) {
        StringBuilder ans=new StringBuilder();

        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch) && !ans.isEmpty()){
                System.out.println(ans.toString());
                ans.setLength(0);

            }
            ans.append(ch);
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }


}
