package codevita;

import java.util.Scanner;

public class DanceRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String currentPosition = "up";
        int moves = 0;

        for (int i = 0; i < N; i++) {
            String instruction = scanner.next();
            if (!instruction.equals(currentPosition)) {
                moves++;
                currentPosition = instruction;
            }
        }

        System.out.println(moves);
    }
}

