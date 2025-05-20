package codevita;

    import java.util.Scanner;

    public class wordlength {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int K = scanner.nextInt();
            String[] words = new String[K];
            for (int i = 0; i < K; i++) {
                words[i] = scanner.next();
            }

            int N = scanner.nextInt();
            int M = scanner.nextInt();

            int maxWords = 0;
            int currentLineLength = 0;
            int currentLineWords = 0;

            for (String word : words) {
                int wordLength = word.length() + 1; // Account for space
                if (currentLineLength + wordLength <= M) {
                    currentLineLength += wordLength;
                    currentLineWords++;
                } else {
                    maxWords += currentLineWords;
                    currentLineLength = wordLength;
                    currentLineWords = 1;
                    N--;
                }
            }


            maxWords += currentLineWords;

            System.out.println(Math.min(maxWords, N));
        }
    }
