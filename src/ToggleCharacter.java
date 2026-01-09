import java.util.Scanner;

public class ToggleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        String str=input.nextLine();
        toggleCase(str,n);
    }

    static void toggleCase(String str,int n){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){

            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                sb.append(Character.toLowerCase(str.charAt(i)));
            }else{
                sb.append( Character.toUpperCase(str.charAt(i)));
            }
        }

        System.out.println(sb);
    }
}
