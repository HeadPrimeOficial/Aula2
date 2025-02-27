package Atividade2;

public class Memoria2 extends Hadware2{
    private double capacidadeArmazenamento;
    private double frequencia;

    public Memoria2(String marca, String modelo, double capacidadeArmazenamento, double frequencia) {
    super(marca, modelo);
    this.capacidadeArmazenamento = capacidadeArmazenamento;
    this.frequencia = frequencia;
}

    public double getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(double capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "\nMemoria2 [marca=" + marca + ", \ncapacidadeArmazenamento=" + capacidadeArmazenamento + ", \nmodelo="
                + modelo + ", \n\nfrequencia=" + frequencia + "]";
    }

  
 

  
    

}
