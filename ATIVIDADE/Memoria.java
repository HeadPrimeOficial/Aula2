package ATIVIDADE;

public class Memoria extends Hadware{
private double  capacidadeDeArmazenamento;


public Memoria(String marca, String modelo, double capacidadeDeArmazenamento) {
    super(marca, modelo);
    this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
}


public double getCapacidadeDeArmazenamento() {
    return capacidadeDeArmazenamento;
}


public void setCapacidadeDeArmazenamento(double capacidadeDeArmazenamento) {
    this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
}


@Override
public String toString() {
    return "Memoria [capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + ", marca=" + marca + ", modelo=" + modelo
            + "]";
}





}
