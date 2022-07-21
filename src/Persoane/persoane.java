package Persoane;
public class persoane {
    int varsta;
    int inaltime;
    String nume;
    int stamina;
    public void alearga(){
        stamina--;
    }
    public void doarme(){
        stamina+=5;
    }
    public boolean eMajor(){
        if(varsta>=18){
            return true;
        }
        else{
            return false;
        }
    }
    public String CareEnumele(){
        return nume;
    }
}