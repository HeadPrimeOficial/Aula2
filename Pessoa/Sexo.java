package Pessoa;

public enum Sexo {
    MASCULINO ("Masculino"),
    TRANS ("Trans"),
    FEMININO ("Feminino");


    private String texto;

    private Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }



    
}
