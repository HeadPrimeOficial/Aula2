package Atividade2;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
      

    
  Hd hd = new Hd("Multilaser", "z487E", 4.7897, "Nilon");
  Memoria2 memoria =new Memoria2("kingston", "lh78915", 8.000, 94502);
Processador2 processador = new Processador2("Prime", "fz3479", 9.000, 4813124);
Placa2 placa = new Placa2("Mutilaser", "lsnh245", "lga155");
Mm2 mm2= new Mm2("Hyperx", "BGH536", 89745.00);


Opcao op = Opcao.placa;


System.out.println(hd.toString());
System.out.println(memoria.toString());
System.out.println(processador.toString());
System.out.println(placa.toString());
System.out.println(mm2.toString());



    }

}
