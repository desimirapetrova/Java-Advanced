import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stackNumbers = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            stackNumbers.offer(Integer.parseInt(numbers[i]));
        }
        for (int j = 0; j < s; j++) {
            stackNumbers.poll();
        }
        if (!stackNumbers.isEmpty()) {
            if (stackNumbers.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(getMinElement(stackNumbers));
            }
        } else {
            System.out.println("0");
        }
    }

    private static int getMinElement(ArrayDeque<Integer>queue) {
        int min = Integer.MAX_VALUE;
        for (int number : queue) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
