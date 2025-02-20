package Pessoa;

public enum Estado {
BAHIA("Bahia", "BA"),
SAO_PAULO("Sao Paulo","SP"),
RIO_DE_JANEIRO("Rio de Jnaiero","RJ");


    private String cidade;
    private String uf;
   
    private Estado(String cidade, String uf) {
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    

}
