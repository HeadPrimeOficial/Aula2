package Pessoa;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;
    private Setor setor;
    private Sexo sexo;
    private int idade;
private Estado estado;
 

   
    public Funcionario(int id, String nome, double salario, Setor setor, Sexo sexo, int idade, Estado estado) {
    this.id = id;
    this.nome = nome;
    this.salario = salario;
    this.setor = setor;
    this.sexo = sexo;
    this.idade = idade;
    this.estado = estado;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + ", setor=" + setor + ", sexo="
                + sexo + ", idade=" + idade + ", estado=" + estado + "]";
    }



    
}