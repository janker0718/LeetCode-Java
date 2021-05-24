package cc.janker.algorithm;

public class SortListTest {
    public static void main(String[] args) {
        int[] a = new int[]{1,3,5,0,0,0};
        int[] b = new int[]{2,4,6};
        int length = 3;
        merge(a,b,length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static int[] merge(int[] a, int[] b, int aLength) {
        if(a == null) {
            return b;
        }
        else if(b == null) {
            return a;
        }
        int aL = aLength -1;
        int bL = b.length -1 ;
        int offset = a.length - 1 ;
        while(aL >= 0 && bL >= 0 ){
            if (a[aL] > b[bL]){
                a[offset] = a[aL];
                aL--;
            }else {
                a[offset] = b[bL];
                bL--;
            }
            offset --;
        }
        while (bL >= 0){
            a[offset] = b[bL];
            offset --;
            bL--;
        }
        return a;
    }


}
