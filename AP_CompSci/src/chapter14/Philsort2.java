package chapter14;

public class Philsort2{

    private int [] a;

    public Philsort2(int [] A){
        a = A.clone();
    }

    public int[] getASorted(){
        return sort(a);
    }

    private int[] sort(int [] b){
        int [] c = new int [a.length/2];
        int [] d = new int [a.length/2];
        for(int i =0; i< b.length/2; i++){
            c[i] = b[i];
            d[i] = b[i+(a.length-1)/2];
        }
        c = bubbleSort(c);
        d = insertSort(d);
        for(int i =0; i< b.length/2; i++){
            b[i] = c[i];
            b[i+(a.length-1)/2] = d[i];
        }
        return bubbleSort(b);
    }

    private int[] bubbleSort(int [] b){
        return new BubbleSort(b).getASorted();
    }

    private int[] insertSort(int [] b){
        return new InstertSort(b).getASorted();

    }
}