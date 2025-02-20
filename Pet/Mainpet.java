import java.util.Scanner;

public class Mainpet {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

int y=0;
int Y=0;

System.out.println("\n\n BEM VINDO AO PETPRIME\n\n");


System.out.println("\nDigite o nome do Pet!!\n");
String nome = sc.next();

System.out.println("\nDigite a idade de seu Pet");
int idade = sc.nextInt();

System.out.println("\nDigite a raca do seu Pet");
String raca = sc.next();

System.out.println("\n Digite o porte do seu Pet, classificados em P M G");
String porte = sc.next();


System.out.println("\nQual a alimentacao do seu pet");
String alimentacao = sc.next();

Pet pet1 = new Pet (nome,idade,raca,porte,alimentacao);

System.out.println("O Pet de nome: " +pet1.getNome());
System.out.println("A idade do Pet é: " +pet1.getIdade());
System.out.println("A Raça do pet: " +pet1.getRaca());
System.out.println("O porte do pet é: " +pet1.getPorte());
System.out.println("A alimentacao é:" +pet1.getAlimentacao());

System.out.println("HORA DE FAZER UM NOVO CADASTRO DIGITE Y PARA CADASTRAR SEU NOVO PET E N PARA NAO");
String op= sc.next();

}
}
