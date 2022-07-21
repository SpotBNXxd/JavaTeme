package Persoane;
public class Alex {
    public static void main(String[] args) {
        persoane Alex=new persoane();
        Alex.inaltime=180;
        Alex.nume="Alexandru";
        Alex.varsta=17;
        Alex.stamina=20;
        Alex.alearga();
        Alex.doarme();
        Alex.alearga();
        System.out.println(Alex.stamina);
        if(Alex.eMajor()) {
            System.out.println("bem bere");
        }
        else{
            System.out.println("bem suculet");
        }
    }
}
