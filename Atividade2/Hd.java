package Atividade2;

public class Hd extends Hadware2{
private double capacidadeArmazenamento;
private String tipoConexao;


public Hd(String marca, String modelo, double capacidadeArmazenamento, String tipoConexao) {
    super(marca, modelo);
    this.capacidadeArmazenamento = capacidadeArmazenamento;
    this.tipoConexao = tipoConexao;
}


public double getCapacidadeArmazenamento() {
    return capacidadeArmazenamento;
}


public void setCapacidadeArmazenamento(double capacidadeArmazenamento) {
    this.capacidadeArmazenamento = capacidadeArmazenamento;
}


public String getTipoConexao() {
    return tipoConexao;
}


public void setTipoConexao(String tipoConexao) {
    this.tipoConexao = tipoConexao;
}


@Override
public String toString() {
    return "\nHd [capacidadeArmazenamento=" + capacidadeArmazenamento + ", \nmarca=" + marca + ", \nmodelo=" + modelo
            + ", \n\ntipoConexao=" + tipoConexao + "]";
}








}
