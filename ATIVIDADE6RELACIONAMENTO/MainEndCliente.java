package ATIVIDADE6RELACIONAMENTO;

public class MainEndCliente {

public static void main(String[] args) {

   //VERSAO 1

//Endereco endereco1 = new Endereco("travessa", "25", "salvador");
//Cliente6 cliente = new Cliente6("Wesley", 25, endereco1);

//System.out.println(cliente.toString());

//VERSAO2
Cliente6 cliente = new Cliente6("Wesley", 25, 
 new Endereco("travessa", "25", "salvador"));


 System.out.println(cliente.toString());




}


}
