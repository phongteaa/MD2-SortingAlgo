package sort.selection;

import java.util.Scanner;

public class SelectionSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the list size: ");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.print("LIST --------> ");
        for (int j : list) {
            System.out.print(j + " ");
        }
        System.out.println("\nBegin selection sorting process...");

        selectionSortByStep(list);
    }

    public static void selectionSortByStep(int[] list) {
        for (int k = 0; k < list.length - 1; k++) {
            int currentMin = list[k];
            int currentMinIndex = k;
            for (int j = k + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                    System.out.println("Current min = " + currentMin + " at index " + currentMinIndex);
                }
            }
            if (currentMinIndex != k) {
                list[currentMinIndex] = list[k];
                list[k] = currentMin;
                System.out.println("Swap " + list[k] + " with " + list[currentMinIndex]);
                System.out.print("List after sort =========== ");
                for (int i : list) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
