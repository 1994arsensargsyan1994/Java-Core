package quicksort;

public class QuicShort {
    public  static  void qShort(int[] items){
qsi(items,0,items.length-1);

    }
    private static  void  qsi(int[] items, int left, int right){
        int i = left;
        int j = right;
        int x,y;
        x = items[(left + right)/2];
        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left )) j--;
            if (i <= j){
                y = items[i];
                items[i]= items[j];
                items[j] = y;
                i++;j--;
            }
        }while (i <= j);
        if (left < j) {
            qsi(items, left, j);
        }if (i < right){
            qsi(items,i,right);
        }

    }

    public static void main(String[] args) {
        //char[] array ={'d','x','a','r','p','j','i'};
        int [] array = {5,1,58,2,11,9,7};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
       qShort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
