package gen;

public class GenericMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean arrayEqual(T[] x, V[] y) {
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
  Integer nums[] = {1,2,3,4,5};
  Integer nums1[] = {1,2,3,4,5};
  Integer nums2[] = {1,2,7,4,5};
 Integer nums3[] = {1,2,7,4,5};
 if (arrayEqual(nums,nums)){
     System.out.println("yes");
 }
 if (arrayEqual(nums,nums1)){
     System.out.println("yes");
 }
        if (arrayEqual(nums,nums2)){
            System.out.println("yes");
        }
        if (arrayEqual(nums,nums2)){
            System.out.println("yes");
        }
//        Double nums4 [] = {1.1,5.5,1.2,8.2};  // kanpilacia sxal qani vor dably chi hamarvum intejeri jarang
//        if (arrayEqual(nums,nums4));

    }
}
