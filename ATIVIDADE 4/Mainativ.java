
import java.util.Scanner;

public class Mainativ {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   
 System.out.println("DIGITE A PLACA DO VEICULO");
 String placa = sc.next();

 System.out.println("DIGITE A COR DO VEICULO");
 String cor = sc.next();

 System.out.println("DIGITE A QUANTIDADE DE PASSAGEIROS DO VEICULO");
 int passageiros = sc.nextInt();

 System.out.println("DIGITE A CAPACIDADE DO TANQUE DO VEICULO");
 int taque = sc.nextInt();

 System.out.println("DIGITE A VELOCIDADE DO VEICULO");
 int velocidade = sc.nextInt();

 System.out.println("DIGITE O CONSUMO DO VEICULO");
 int consumo = sc.nextInt();

Veiculo veiculo1 = new Veiculo (placa,cor,passageiros,taque,velocidade,consumo);

System.out.println("INFORMACOES DO CARRO \n");
System.out.println(veiculo1.getPlaca());
System.out.println(veiculo1.getCor());
System.out.println(veiculo1.getNumeroPassageiros());
System.out.println(veiculo1.getCapacidadeTanque());
System.out.println(veiculo1.getVelocidade());
System.out.println(veiculo1.getConsumo());

System.out.println("\nDIGITE O TITULO DO LIVRO");
String titulo = sc.next();


System.out.println("\nDIGITE O TITULO DO LIVRO");
String Autor = sc.next();



}
}
