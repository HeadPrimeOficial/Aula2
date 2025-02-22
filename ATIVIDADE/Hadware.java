package ATIVIDADE;

public abstract class Hadware {
    protected  String marca;
    protected String modelo;
    
    public Hadware() {
    }

    public Hadware(String marca, String modelo) {
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
        return "Hadware [marca=" + marca + ", modelo=" + modelo + "]";
    }



}
