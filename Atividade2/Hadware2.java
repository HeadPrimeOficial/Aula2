package Atividade2;

public abstract class  Hadware2 {
protected String marca;
protected String modelo;

public Hadware2(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
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

@Override
public String toString() {
    return "Hadware2 [marca=" + marca + ", modelo=" + modelo + "]";
}






}
