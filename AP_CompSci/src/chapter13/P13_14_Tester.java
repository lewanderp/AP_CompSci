package chapter13;

public class P13_14_Tester {
    public static void main(String[] args) {
        P13_14_Class m = new P13_14_Class();
        int count = 0;
        System.out.println(m);
        while (true) {
            if (count >= 5 || m.traverse(0,1)) {
                break;
            }
            m.traverse(0, 1);
            System.out.println(m);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }
}