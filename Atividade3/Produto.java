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












}
