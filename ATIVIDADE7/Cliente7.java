package ATIVIDADE7;

public class Cliente7 {

private String nome;
private int idade;
private Pet7 pet;



public Cliente7(String nome, int idade, Pet7 pet) {
    this.nome = nome;
    this.idade = idade;
    this.pet = pet;
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



public Pet7 getPet() {
    return pet;
}



public void setPet(Pet7 pet) {
    this.pet = pet;
}



@Override
public String toString() {
    return "Cliente7 [nome=" + nome + ", idade=" + idade + ", pet=" + pet + "]";
}






}
