package Exercitando;

public class CartaoCredito implements Pagamento {

    @Override
    public String pagar() {
        return ("Pagamento realizado com cartão de crédito");


    }
}