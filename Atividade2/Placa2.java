package Atividade2;

public class Placa2 extends Hadware2 {
private String soquet;

public Placa2(String marca, String modelo, String soquet) {
    super(marca, modelo);
    this.soquet = soquet;
}

public String getSoquet() {
    return soquet;
}

public void setSoquet(String soquet) {
    this.soquet = soquet;
}

@Override
public String toString() {
    return "\nPlaca2 [marca=" + marca + ", \nsoquet=" + soquet + ", \n\nmodelo=" + modelo + "]";
}





}
