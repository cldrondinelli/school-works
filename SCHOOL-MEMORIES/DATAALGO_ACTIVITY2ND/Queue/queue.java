package Queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.next();
                if (input.equals("OUT")) {
                    if (!queue.isEmpty()) {
                        System.out.println(queue.poll() + " is received.");
                    } else {
                        System.out.println("Queue is empty.");
                    }
                } else {
                    try {
                        int queueNumber = Integer.parseInt(input);
                        queue.offer(queueNumber);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                    }
                }
            }
        }
    }
}