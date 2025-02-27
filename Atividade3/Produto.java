public abstract class Produto {
protected String marca;
protected String modelo;
protected Double frequencia;
protected Double capacidadeArmazenamento;



public Produto(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
}



public Produto(String marca, String modelo, Double frequencia) {
    this.marca = marca;
    this.modelo = modelo;
    this.frequencia = frequencia;
}



public Produto(Double capacidadeArmazenamento, String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    this.capacidadeArmazenamento = capacidadeArmazenamento;
}



public String getMarca() {
    return marca;
}



public void setMarca(String marca) {
    this.marca = marca;
}



public String getModelo() {
    return modelo;
}



public void setModelo(String modelo) {
    this.modelo = modelo;
}



public Double getFrequencia() {
    return frequencia;
}



public void setFrequencia(Double frequencia) {
    this.frequencia = frequencia;
}



public Double getCapacidadeArmazenamento() {
    return capacidadeArmazenamento;
}



public void setCapacidadeArmazenamento(Double capacidadeArmazenamento) {
    this.capacidadeArmazenamento = capacidadeArmazenamento;
}



public String marcaModelo() {
    return "Produto  [marca=" + marca + ", modelo=" + modelo + "]";
}



public String MarcModeloFrequencia() {
    return "Produto [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia + "]";
}


public String MarcaModeloCapaci() {
    return "Produto [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia
            + ", capacidadeArmazenamento=" + capacidadeArmazenamento + "]";
}










}
