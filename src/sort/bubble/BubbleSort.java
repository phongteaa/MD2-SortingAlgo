package sort.bubble;

public class BubbleSort {
    static int[] list = {2, 40, 6, 8, 3, 10, 3, 89};

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        bubbleSort(list);
        long endTime = System.nanoTime();
        for (int j : list) {
            System.out.print(j + " ");
        }
        System.out.println("");
        System.out.println(endTime - startTime);
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
