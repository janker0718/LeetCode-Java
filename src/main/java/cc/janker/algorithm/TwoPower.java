package cc.janker.algorithm;

public class TwoPower {
    public static void main(String[] args) {
//        twoPower1();
        twoPower2();
    }

    private static void twoPower2() {
        for (int i = 0; i <100 ; i++) {
            twoPowerLoop(i,i);
        }
    }

    private static void twoPowerLoop(int n,int i) {
        if (i == 1){
            System.out.println(n);
        }else {
            if (i % 2 == 0){
                i = i / 2;
                if (i >= 1){
                    twoPowerLoop(n,i);
                }
            }else {
                return;
            }
        }


    }

    private static void twoPower1() {
        for (int i = 0; i <100 ; i++) {
            if ((i & (i-1)) == 0){
                System.out.println(i);
            }
        }
    }
}
