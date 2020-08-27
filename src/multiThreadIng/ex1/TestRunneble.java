package multiThreadIng.ex1;

class TestRunnable implements Runnable {
    MyCallBack myCallBack;

    public TestRunnable(MyCallBack myCallBack) {
        this.myCallBack = myCallBack;
    }

    @Override
    public void run() {
        myCallBack.onStart();
        for (int i = 0; i < 1000000; i++) {
            if (i == 500000) {
                myCallBack.onMiddle(i);
            }
        }
        myCallBack.ofFinish();
    }
}

interface MyCallBack {
    void onStart();

    void onMiddle(int i);

    void ofFinish();
}

class Main {
    public static void main(String[] args) {
        TestRunnable testRunnable = new TestRunnable(new MyCallBack() {
            @Override
            public void onStart() {
                System.out.println("Thread on Start ");
            }

            @Override
            public void onMiddle(int i) {
                System.out.println("Thread on 500000 ");
            }

            @Override
            public void ofFinish() {
                System.out.println(" Thread on Finish");
            }
        });
        Thread thread = new Thread(testRunnable);
        thread.start();
    }

}
