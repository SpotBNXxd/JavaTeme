import java.util.Scanner;

public class PereteTema {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Spuneti lungimea patratului:");
        int latime=in.nextInt();
        System.out.print("Spuneti inaltimea patratului:");
        int inaltime=in.nextInt();
        int variabilaPtA=latime;
        int Latime=latime;
            while (0 < latime) {
                System.out.print("#");
                latime--;
            }
        System.out.println("");
            int a=variabilaPtA-=2;
            while(2<inaltime){
                System.out.print("#");
                while(0<a){
                    System.out.print("0");
                    a--;
                }
                System.out.println("#");
                inaltime--;
                a=variabilaPtA;
            }
            latime=Latime;
        while (0 < latime) {
            System.out.print("#");
            latime--;
        }
        }
    }