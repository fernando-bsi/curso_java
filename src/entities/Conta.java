package entities;

public class Conta {

    public double numeroConta;
    public String nome;
    public double deposito;
    public double saque;
   // public double saldo;

    public double Deposito(double saldo, double deposito){
        saldo = saldo + deposito;
        return saldo;
    }

    public double saque(double saldo, double saque){
        saldo = saque - 5;
        return saldo;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }



}
