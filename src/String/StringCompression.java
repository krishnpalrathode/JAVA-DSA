package String;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbbcccddee";
        StringBuilder sb = new StringBuilder(str);
        String ans= sb.charAt(0)+"";
        int count = 1;

        for(int i=1;i<sb.length();i++){
           if(sb.charAt(i-1)==sb.charAt(i)){
               count++;

           }
           else{
               ans+=count;
               count=1;
                ans+=sb.charAt(i)+"";
           }

        }
        System.out.println(ans);
    }

}
