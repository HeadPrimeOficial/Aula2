
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);    
    
int contador=0;
do{



System.out.println("Digite o nome do titulo");  
String nomeDoLivro=sc.next();  

System.out.println("Digite o nome o Autor");  
String autor=sc.next();  

System.out.println("Digite o numero de Paginas");  
int paginas=sc.nextInt(); 

System.out.println("Digite o preço do livro");  
Double preco=sc.nextDouble(); 


Livro livro1= new Livro(nomeDoLivro,autor,paginas,preco);


System.out.println("\n\n Nome do livro"+ livro1.getTitulo());
System.out.println("O nome do Autor é "+ livro1.getAutor());
System.out.println("Nome do livro é "+ livro1.getNumeroDePaginas());
System.out.println("O nome do livro é  \n"+ livro1.getPreco());

 contador++;

}while(contador <2 );

    }
}
