public class Pet {
    private String Nome;
    private int Idade;
    private String Raca;
    private String Porte;
    private String Alimentacao;
    
    
    public Pet(String nome, int idade, String raca, String porte, String alimentacao) {
        Nome = nome;
        Idade = idade;
        Raca = raca;
        Porte = porte;
        Alimentacao = alimentacao;
    }

    

    public String getNome() {
        return Nome;
    }


    public void setNome(String nome) {
        Nome = nome;
    }


    public int getIdade() {
        return Idade;
    }


    public void setIdade(int idade) {
        Idade = idade;
    }


    public String getRaca() {
        return Raca;
    }


    public void setRaca(String raca) {
        Raca = raca;
    }


    public String getPorte() {
        return Porte;
    }


    public void setPorte(String porte) {
        Porte = porte;
    }


    public String getAlimentacao() {
        return Alimentacao;
    }


    public void setAlimentacao(String alimentacao) {
        Alimentacao = alimentacao;
    }



    


}


