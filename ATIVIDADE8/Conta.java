package ATIVIDADE8;

public class Conta {
private String banco;
private String agencia;
private int numeroConta;
private String tipoConta;
private Double SaldoConta;
private Double limite;


public Conta() {
}


public Conta(String banco, String agencia, int numeroConta, String tipoConta, Double saldoConta, Double limite) {
    this.banco = banco;
    this.agencia = agencia;
    this.numeroConta = numeroConta;
    this.tipoConta = tipoConta;
    SaldoConta = saldoConta;
    this.limite = limite;
}


public String getBanco() {
    return banco;
}


public void setBanco(String banco) {
    this.banco = banco;
}


public String getAgencia() {
    return agencia;
}


public void setAgencia(String agencia) {
    this.agencia = agencia;
}


public int getNumeroConta() {
    return numeroConta;
}


public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
}


public String getTipoConta() {
    return tipoConta;
}


public void setTipoConta(String tipoConta) {
    this.tipoConta = tipoConta;
}


public Double getSaldoConta() {
    return SaldoConta;
}


public void setSaldoConta(Double saldoConta) {
    SaldoConta = saldoConta;
}


public Double getLimite() {
    return limite;
}


public void setLimite(Double limite) {
    this.limite = limite;
}


@Override
public String toString() {
    return "Conta [banco=" + banco + ", agencia=" + agencia + ", numeroConta=" + numeroConta + ", tipoConta="
            + tipoConta + ", SaldoConta=" + SaldoConta + ", limite=" + limite + "]";
}







}
