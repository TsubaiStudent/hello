import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        int targetNumber = 42; // プログラマが設定した数
        int maxGuesses = 5; // 最大の予想回数

        System.out.println("数当てゲームを始めます!2桁の正の整数を予想してください。");

        Scanner scanner = new Scanner(System.in);
        int guessesLeft = maxGuesses;

        while (guessesLeft > 0) {
            System.out.print("予想を入力してください（残りの予想回数: " + guessesLeft + "）: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("当たり！おめでとうございます！");
                return;
            } else {
                if (Math.abs(userGuess - targetNumber) >= 20) {
                    System.out.println("大きすぎるか小さすぎるか、差が20以上あります。");
                } else if (userGuess > targetNumber) {
                    System.out.println("入力した数は大きすぎます。");
                } else {
                    System.out.println("入力した数は小さすぎます。");
                }
            }

            guessesLeft--;
        }

        System.out.println("残念！予想回数を使い切りました。正解は " + targetNumber + " でした。");
    }
}
