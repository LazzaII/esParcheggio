package Semaphore;

public class Test {
    public static void main(String[] args) {
        Parcheggio p = new Parcheggio();
        for(int i = 1; i < 12; i++)
        {
            Auto a = new Auto ("Auto " + i, p);
        }
    }
}
