public class Veiculo {
private String placa;
private String cor;
private int numeroPassageiros;
private int capacidadeTanque;
private int velocidade;
private int consumo;


public Veiculo(String placa, String cor, int numeroPassageiros, int capacidadeTanque, int velocidade, int consumo) {
    this.placa = placa;
    this.cor = cor;
    this.numeroPassageiros = numeroPassageiros;
    this.capacidadeTanque = capacidadeTanque;
    this.velocidade = velocidade;
    this.consumo = consumo;
}





public String getCor() {
    return cor;
}


public void setCor(String cor) {
    this.cor = cor;
}


public int getNumeroPassageiros() {
    return numeroPassageiros;
}


public void setNumeroPassageiros(int numeroPassageiros) {
    this.numeroPassageiros = numeroPassageiros;
}


public int getCapacidadeTanque() {
    return capacidadeTanque;
}


public void setCapacidadeTanque(int capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
}


public int getVelocidade() {
    return velocidade;
}


public void setVelocidade(int velocidade) {
    this.velocidade = velocidade;
}


public int getConsumo() {
    return consumo;
}


public void setConsumo(int consumo) {
    this.consumo = consumo;
}





public String getPlaca() {
    return placa;
}





public void setPlaca(String placa) {
    this.placa = placa;
}



}
