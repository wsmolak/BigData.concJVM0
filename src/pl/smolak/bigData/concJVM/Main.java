package pl.smolak.bigData.concJVM;

public class Main {

    private int a;
    static int sb;

    public int getA(){
        return a;
    }

    void setA(int input){
        a = input;
    }

    public static void main(String[] args) {
        Main.sb = 123;
        int a = 3123;
        int liczba = 18;
        int liczba2 = 14;
        byte c;
        short d;
        float e = 1.8623f;
        double f = 3.12412;
        char znak = 'f';
        boolean b = liczba == liczba2;

        Main m = new Main();
        m.setA(liczba+liczba2);
        m.sb = m.sb + 1;
        System.out.println("Zmienna a obiektu m: "+m.getA());

        Main w = new Main();
        w.setA(m.getA()+21);
        w.sb = w.sb + 128;
        System.out.println("Zmienna a obiektu n: "+w.getA());
        System.out.println("Statyczna: "+w.sb);
    }
}
