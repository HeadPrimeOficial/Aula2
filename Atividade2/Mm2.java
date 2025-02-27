package Atividade2;

public class Mm2 extends Hadware2 {
private double capacidadeTotal;

public Mm2(String marca, String modelo, double capacidadeTotal) {
    super(marca, modelo);
    this.capacidadeTotal = capacidadeTotal;
}

public double getCapacidadeTotal() {
    return capacidadeTotal;
}

public void setCapacidadeTotal(double capacidadeTotal) {
    this.capacidadeTotal = capacidadeTotal;
}

@Override
public String toString() {
    return "\nMm2 [capacidadeTotal=" + capacidadeTotal + ", \nmarca=" + marca + ", \n\nmodelo=" + modelo + "]";
}








}
