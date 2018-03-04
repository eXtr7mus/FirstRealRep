public class PrintChar implements Runnable {

    private char letter;
    private int times;

    PrintChar(char c, int t){
        letter = c;
        times = t;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++){
            System.out.print(letter);
        }
    }
}
