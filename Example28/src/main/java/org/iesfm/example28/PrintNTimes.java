package org.iesfm.example28;

public class PrintNTimes implements Runnable {

    private String word;

    private int n;

    private long timeToSleep;

    public PrintNTimes(String word, int n, long timeToSleep) {
        this.word = word;
        this.n = n;
        this.timeToSleep = timeToSleep;
    }

    @Override
    public void run() {
        PrintNTimes.printWordHola(n, word);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printWordHola(int n, String word) {
        for(int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }
}
