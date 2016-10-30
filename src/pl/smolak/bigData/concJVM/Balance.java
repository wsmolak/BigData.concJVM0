package pl.smolak.bigData.concJVM;

/**
 * Created by xwsmolak on 10/30/16.
 */
public class Balance {
    private int number = 0;
    public int balance (){
        number++;
        number--;
        return number;
    }

    public static void main(String[] args) {
        Balance b = new Balance();
        for (int i=0;i<100;i++){
            Thread t = new Thread() {
                public void run() {
                    System.out.print(b.balance());
                }
            };
            t.start();
        }
    }
}
