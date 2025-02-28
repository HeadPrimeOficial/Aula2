package Interface;

public class Pato implements Animal{

    @Override
    public String emitirSom() {
      return "graugrau";
    }

    @Override
    public String comer() {
        return "Peixe";
    }

}
