package Pessoa;

public class MainPessoa {

    public static void main(String[] args) {
  
        Funcionario func1 = new Funcionario(1, "João Silva", 3500.00, Setor.Financeiro, Sexo.MASCULINO, 30,Estado.SAO_PAULO);

        
        System.out.println(func1);

        func1.setSetor(Setor.Vendas);
        func1.setSalario(4000.00);


        System.out.println("Após alteração:");
        System.out.println(func1);
    }

}
