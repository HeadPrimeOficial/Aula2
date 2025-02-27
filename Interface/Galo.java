package Interface;

public class Galo implements Animal {

    @Override
    public String emitirSom() {
       return "Cururu";
    }

    @Override
    public String comer() {
        return "Comnedo milho";
 }

}
