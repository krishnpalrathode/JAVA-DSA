package String;

public class reverseEachWord {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I am an educator");
        StringBuilder ans = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != ' ') {
                ans.append(sb.charAt(i)); // Collect characters in ans
            } else {
                sb2.append(ans.reverse()).append(" "); // Reverse and add space
                ans.setLength(0); // Clear ans for next word
            }
        }

        // Append last word after loop ends
        sb2.append(ans.reverse());

        System.out.println(sb2); // Trim extra space
    }
}
