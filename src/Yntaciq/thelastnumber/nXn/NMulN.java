package Yntaciq.thelastnumber.nXn;

public class NMulN {
   private int[] size = new int[10];

  private   void inicilizacia() {
        for (int i = 0; i < size.length; i++) {
            size[i] = 0;
        }
    }

  private   void method(int val) {
        if (val == 0) {
            size[0] = size[0] + 1;
        }
        while (val != 0) {
            size[val % 10] = size[val % 10] + 1;
            val = val / 10;
        }
    }

    void number(int oan, int tow) {
        for (int i = oan; i < tow; i++) {
            for (int j = oan; j < tow; j++) {
                method(j * i);
            }
        }
    }
    void print(){
        for (int i = 0; i <size.length ; i++) {
            System.out.print(size[i] + " ");
        }
    }

}
