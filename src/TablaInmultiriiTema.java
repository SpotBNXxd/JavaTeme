public class TablaInmultiriiTema {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        while(a<=9){
            while(b<=9){
                System.out.print( a + "x" + b + "=" + a*b + "     ");
                b++;
            }
            b=1;
            a++;
            System.out.println("");
        }
    }
}