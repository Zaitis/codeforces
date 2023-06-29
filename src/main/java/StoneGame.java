

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoneGame {
    int repeat;
    int tableLength;
    int r,l,i;
    int moves;
    List<Integer> stones = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public StoneGame(){
        System.out.println("How much repeat you want?");
        repeat= scanner.nextInt();
        scanner.nextLine();

        do {
            stones.clear();
            System.out.println("Please set how much stones you have: ");
            tableLength = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Please set list of your stones: ");
            for(int i=1; i<=tableLength; i++){
                System.out.println("set " + i + " stone");
                stones.add(scanner.nextInt());
            }
            int minPosition = stones.indexOf(1);
            int maxPosition = stones.indexOf(tableLength);

            r =rightStrategy(minPosition, maxPosition);
            l =leftStrategy(minPosition, maxPosition);
            i =innerStrategy(minPosition, maxPosition);
            moves =Math.min(Math.min(r,l),i);
            System.out.println("minimal moves is "+ moves);

            repeat-=1;
        } while (repeat > 0);

    }

    private int rightStrategy(int minPosition, int maxPosition) {

        return Math.max(tableLength-minPosition,tableLength-maxPosition);
    }

    private int leftStrategy(int minPosition, int maxPosition) {

        return  Math.max(minPosition,maxPosition)+1;
    }

    private int innerStrategy(int minPosition, int maxPosition) {
       return Math.min(minPosition, tableLength-minPosition) + Math.min(maxPosition, tableLength-maxPosition)+1;
    }

}
