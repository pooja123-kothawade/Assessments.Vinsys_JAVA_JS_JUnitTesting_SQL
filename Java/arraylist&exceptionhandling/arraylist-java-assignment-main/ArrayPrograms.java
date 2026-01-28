
import java.util.Scanner;

public class ArrayPrograms {

    public static void main(String[] args) {
        int[] intArray = {5, 2, 8, 1, 9};
        double[] doubleArray = {5.5, 7.3, 2.1, 9.6};

        reverseArray(intArray);
        copyArray(intArray);
        sumArray(intArray);
        averageArray(doubleArray);
        maxInArray(intArray);
        searchElement(intArray, 8); // change 8 to any number to search
    }

    static void reverseArray(int[] arr) {
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.print("Copied Array: ");
        for (int num : copy) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }

    static void averageArray(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        double avg = sum / arr.length;
        System.out.println("Average of values: " + avg);
    }

    static void maxInArray(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);
    }

    static void searchElement(int[] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + target + " not found.");
        }
    }
}
