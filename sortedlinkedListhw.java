

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 * @author Mohammed Uddin
 * CS6301
 * Reads integer numbers from the user, sorts them, and then prints the sorted list.
 */
public class sortedlinkedListhw {

    /**
     * Reads integer numbers from the user until a non-integer input is provided.
     *
     * @return A list of integer numbers entered by the user.
     */
    public static List<Integer> readInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> numbers = new LinkedList<>();

            System.out.println("Enter the integer numbers you wish to sort. (Enter a non-integer to show the sorted list. (EX: A, B)):");

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }

            return numbers;
        }
    }

    /**
     * Sorts a list of integer numbers in ascending order.
     *
     * @param numbers The list of integer numbers to be sorted.
     */
    public static void sortList(List<Integer> numbers) {
        Collections.sort(numbers);
    }

    /**
     * Prints the sorted list of integer numbers.
     *
     * @param sortedList The sorted list of integer numbers.
     */
    public static void printSortedNumbers(List<Integer> sortedList) {
        System.out.println("Sorted List:");
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Main method. Runs Program
     *
     * @param args Command-line argument.
     */
    public static void main(String[] args) {
        List<Integer> numbers = readInput();
        sortList(numbers);
        printSortedNumbers(numbers);
    }
}
