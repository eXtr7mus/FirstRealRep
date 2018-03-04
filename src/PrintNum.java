public class PrintNum implements Runnable {
    private int numberToStop;
    PrintNum(int n){
        numberToStop = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < numberToStop; i++){
            System.out.print(i);
        }
    }
}
