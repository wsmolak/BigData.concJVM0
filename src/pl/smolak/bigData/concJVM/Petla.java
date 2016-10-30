package pl.smolak.bigData.concJVM;

/**
 * Created by xwsmolak on 10/30/16.
 */
public class Petla {
    public static void main(String[] args) {
        for (int i = 1;i<=100;i++){
            if (i%3==0) {
                System.out.print(i+"fizz");
            }
            if (i%5==0) {
                System.out.print(i+ "buzz");
            }
            System.out.println();
        }
    }
}
