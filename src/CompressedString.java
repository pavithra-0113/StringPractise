import java.util.*;
import java.io.*;

public class CompressedString {
    static void compressedString(String s) {

        StringBuilder sb=new StringBuilder();

        int i=0;

        while(i<s.length()){
            int j=i;

            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                j++;
            }
            int count=j-i;

            sb.append(s.charAt(i));
            if(count>1){
                sb.append(count);
            }
            i=j;
        }

        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            compressedString(s);
            System.out.println();
        }
    }
}


