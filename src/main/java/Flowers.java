
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Flowers {
    int count = 0;
    int grow;

    Integer[] month = new Integer[12];
    Scanner scanner = new Scanner(System.in);

    public Flowers() {
        System.out.println("How much will grow your flowers?");
        grow = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < 12; i++) {
            System.out.println("How much grow your flower in " + i + " month");
            month[i] = scanner.nextInt();
            scanner.nextLine();
        }
        Arrays.sort(month, Collections.reverseOrder());
        for (int i = 0; i < 12; i++) {
            grow -= month[i];
            if (grow <= 0) break;
            count += 1;
        }
        if (grow <= 0) {
            System.out.println(count);
        } else System.out.println("-1");
    }
}

