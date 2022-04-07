package sort.selection;

public class SelectionSort {
    static int[] list = {2, 40, 6, 8, 3, 10, 3, 89};

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        selectionSort(list);
        long endTime = System.nanoTime();
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println("");
        System.out.println(endTime - startTime);
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
