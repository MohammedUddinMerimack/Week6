package Sorted_Stack;
import java.util.Collections;
import java.util.Stack;  // Changed from LinkedList
import java.util.Scanner;

/**
 * @author Mohammed Uddin
 * CS6301
 * Reads integer numbers from the user, saves them into a Stack sorted from the smallest to the largest,
 * and then prints the sorted stack.
 */
public class SortedStack {

    /**
     * Reads integer numbers from the user until a non-integer input is provided.
     *
     * @return A stack of integer numbers entered by the user.
     */
    public static Stack<Integer> readInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            Stack<Integer> numbers = new Stack<>();  // Changed from LinkedList

            System.out.println("Enter the integer numbers you wish to sort. (Enter a non-integer to show the sorted list. (EX: A, B)):");

            while (scanner.hasNextInt()) {
                numbers.push(scanner.nextInt());  // Changed from add() to push()
            }

            return numbers;
        }
    }

    /**
     * Sorts a stack of integer numbers in ascending order.
     *
     * @param numbers The stack of integer numbers to be sorted.
     */
    public static void sortStack(Stack<Integer> numbers) {
        Collections.sort(numbers);
    }

    /**
     * Prints the sorted stack of integer numbers.
     *
     * @param sortedStack The sorted stack of integer numbers.
     */
    public static void printSortedNumbers(Stack<Integer> sortedStack) {
        System.out.println("Sorted Stack:");
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + " ");
        }
        System.out.println();
    }

    /**
     * Main method. Runs Program.
     *
     * @param args Command-line argument.
     */
    public static void main(String[] args) {
        Stack<Integer> numbers = readInput();
        sortStack(numbers);
        printSortedNumbers(numbers);
    }
}
