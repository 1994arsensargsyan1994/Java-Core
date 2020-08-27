package egs.less7;

public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.add(23,0);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) + " ");

        }
        System.out.println();
        System.out.println();
        arrayList.remove(0);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) + " ");

        }
        arrayList.removeByElement(9);
        System.out.println();
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) + " ");

        }
        System.out.println("size "+arrayList.size());
        arrayList.clear();
        System.out.println();
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) + " ");

        }

    }
    }
