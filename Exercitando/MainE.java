package Exercitando;

import java.util.*;

public class MainE {


    public static void main(String[] args) {

        CartaoCredito cartaoCredito1 = new CartaoCredito();
        Pix pix1 = new Pix();
        
        Scanner sc = new Scanner(System.in);
System.out.println("MERCADINHO DO TIGIRNHO\n\n");




System.out.println("Qual a forma de pagamento digite: \n 1-CartaoCredito \n 2-Pix");
int op = sc.nextInt();



if (op == 1){

 System.out.println(cartaoCredito1.pagar());

}else if (op ==2 ){

    System.out.println(pix1.pagar());
}else {

System.out.println("Erro ao digitar, tente novamente!");
}





    }

}
