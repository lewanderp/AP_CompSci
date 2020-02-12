package chapter14;

public class BubbleSort {
    private static int[] a;

    public BubbleSort(int[] b) {
        initA(b);
    }

    private void initA(int[] b) {
        a = b.clone();
    }

    public int[] getASorted() {
        return bubbleSort();
    }

    public String printA() {
        String s = "";
        s += "[ ";
        for (int i = 0; i < a.length - 2; i++) {
            s += a[i] + ", ";
        }
        s += a[a.length - 1] + " ]";
        return s;
    }

    private int[] bubbleSort() {

        boolean isSorted = false;

        for (int i = 0; i < a.length; i++) {
            isSorted = true;
            for (int j = 1; j < a.length; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                return a;
            }
        }
        return a;
    }
}