package multithreading;

public class BuildingH2O1117 {
    public static void main(String[] args) {

    }


    class H2O {

        public H2O() {

        }

        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

            // releaseHydrogen.run() outputs "H". Do not change or remove this line.
            releaseHydrogen.run();
        }

        public void oxygen(Runnable releaseOxygen) throws InterruptedException {

            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
        }
    }

}
