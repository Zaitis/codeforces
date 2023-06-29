import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
     //   StoneGame stoneGame= new StoneGame();
        Flowers flowers = new Flowers();
        AlternatingSubsequence alternatingSubsequence = new AlternatingSubsequence();

    }

//
//        String table;
//        String word;
//        Scanner scanner = new Scanner(System.in);
//
//        int count = scanner.nextInt();
//        scanner.nextLine();
//
//        for (int i = 1; i <= count; i++) {
//            System.out.println("podaj tablice znaków: ");
//            table = scanner.nextLine();
//            System.out.println("podaj slowo do sprawdzenia: ");
//            word = scanner.nextLine();
//            System.out.println(checkWord(word, table));
//        }
//    }
//
//    private static Integer checkWord(String word, String table) {
//        int count = 0;
//        int length = word.length();
//        int firstChar;
//        int secondChar;
//
//        for (int i = 0; i < length - 1; i++) {
//            firstChar = table.indexOf(word.charAt(i + 1));
//            secondChar = table.indexOf(word.charAt(i));
//
//            int result = Math.abs(firstChar - secondChar);
//            count += result;
//
//        }
//
//        return count;
//    }
}
