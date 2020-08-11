package ProjOne;

public class ABCD {
    public static void main(String[] args) {
        int n = 2;
//        for (int a = 1; a <= n; a++) {
//            for (int b = 1; b <= n; b++) {
//                for (int c = 1; c <= n; c++) {
//                    for (int d = 1; d <= n; d++) {
//                        if (a + b == c + d){
//                            System.out.println(a+" "+b+" "+ c+" "+d);
//                        }
//                        break;
//                    }
//                }
//            }
//        }


        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    int d = (int) Math.pow(a + b - c, 1 / 3);
                    if (a + b == c + d) {
                        System.out.println(a + " " + b + " " + c + " " + d);
                    }

                }
            }
        }
    }
}
