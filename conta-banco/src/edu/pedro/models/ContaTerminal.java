package edu.pedro.models;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal() {
    }

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) throws Exception {
        this.setNumero(numero);
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.setSaldo(saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    /**
     * 
     * @param saldo
     * @throws Exception
     */
    public void setSaldo(double saldo) throws Exception{
        if(saldo <= 0) {
            throw new Exception("Saldo tem de ser maior que zero");
        }
        this.saldo += saldo;
    }

}
