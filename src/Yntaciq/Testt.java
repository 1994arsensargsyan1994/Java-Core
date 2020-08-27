package Yntaciq;

public
class Testt {

    public static void main(String[] args) throws InterruptedException {
        int [][] x[];
        char c;
        int i;
        c = 'A';		// 1
        i = c;		//2
       // c = i + 1;	//3// conpilacia error
        c++;		//4
        System.out.println(i);
        System.out.println(c);
       int a = 006;
        System.out.println(a);
        int b = 0x18;// 6 ec gumarac
        System.out.println(b);
        String str;
        int fname;
        str = "Foolish boy.";
        fname = str.indexOf("fool");
        System.out.println(fname);//-1
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j <10 ; j++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(j);
                }
            }
        };
        for (int j = 10; j <20 ; j++) {
            Thread.sleep(1500);
            System.out.println(j);
        }
        runnable.run();
        Runnable runnable1 = ()->{
            for (int j =20; j < 30; j++) {
                System.out.println(j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable1);
        thread.start();
        thread.hashCode();

    }
}
