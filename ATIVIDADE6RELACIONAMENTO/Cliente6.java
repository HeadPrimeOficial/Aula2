package ATIVIDADE6RELACIONAMENTO;

public class Cliente6 {
private String nome;
private int idade;
private Endereco endereco;




public Cliente6() {
}



public Cliente6(String nome, int idade, Endereco endereco) {
    this.nome = nome;
    this.idade = idade;
    this.endereco = endereco;
}



public String getNome() {
    return nome;
}



public void setNome(String nome) {
    this.nome = nome;
}



public int getIdade() {
    return idade;
}



public void setIdade(int idade) {
    this.idade = idade;
}



public Endereco getEndereco() {
    return endereco;
}



public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
}



@Override
public String toString() {
    return "Cliente6 [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
}



}
