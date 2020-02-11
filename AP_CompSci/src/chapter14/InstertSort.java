package chapter14;

public class InstertSort{
    
    private int[] a;

    public InstertSort(int[] b){
        AInit(b);
    }

    public int[] getASorted(){
        return insertSort(a);
    }

    public String printA(){
        String s = "";
        s+="[ ";
        for(int i =0; i< a.length-2; i++) {
            s+=a[i]+", ";
        }
        s+=a[a.length-1]+" ]";
        return s;
    }

    private void AInit(int [] b){
        a = b.clone();
    }

    private int[] insertSort(int [] b){
        int n = b.length; 
        for (int i = 1; i < n; ++i) { 
            int key = b[i]; 
            int j = i - 1; 
            while (j >= 0 && b[j] > key) { 
                b[j + 1] = b[j]; 
                j = j - 1; 
            } 
            b[j + 1] = key; 
        }
        a = b.clone();
        return b;
    }

}