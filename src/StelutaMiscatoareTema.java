public class StelutaMiscatoareTema {
    public static void main(String[] args) throws InterruptedException {
        int ps=1;
        int a;
        int loop=2;
        while(loop==2) {
            while (ps <= 80) {
                a = 1;
                while (a <= ps) {
                    System.out.print(" ");
                    a++;
                }
                ps++;
                System.out.print("*");
                System.out.print("\r");
                Thread.sleep(100);
            }
            ps = 80;
            int f=80;
            while (1 < f) {
                a = 1;
                while (a <= ps) {
                    System.out.print(" ");
                    a++;
                }
                ps--;
                System.out.print("*");
                System.out.print("\r");
                Thread.sleep(100);
                f--;
            }
        }
    }
}