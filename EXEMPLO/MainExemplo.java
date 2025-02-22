package EXEMPLO;

public class MainExemplo {
    public static void main(String[] args) {

       

        Cliente cliente = new Cliente("wesley", 25, "07/11/1198", "2.000");
        Funcionario funcinario = new Funcionario("Luis", 25, "789512", "gerente", 2.000);

      
        System.out.println(cliente.toString());
        System.out.println(funcinario.toString());
        

    }

}
