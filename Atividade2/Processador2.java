package Atividade2;

public class Processador2 extends Hadware2 {
private double frequencia;

public Processador2(String marca, String modelo, double capacidadeArmazenamento, double frequencia) {
    super(marca, modelo);
    this.frequencia = frequencia;
}

public double getFrequencia() {
    return frequencia;
}

public void setFrequencia(double frequencia) {
    this.frequencia = frequencia;
}

@Override
public String toString() {
    return "Processador2 [marca=" + marca + ", frequencia=" + frequencia + ", modelo=" + modelo + "]";
}




}
