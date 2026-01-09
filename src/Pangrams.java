import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//import java.io;

public class Pangrams {

    static void isPangram(String s){
        s=s.toLowerCase();

        Set<Character> ans=new HashSet<>();

        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                ans.add(c);
            }
        }
        if(ans.size()==26){
            System.out.println("Pangram");
        }else{
            System.out.println("Not Pangram");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        isPangram(s);
    }
}
