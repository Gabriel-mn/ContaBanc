package br.Conta.modelo;

import excecao.Excecao;

public class Conta {

    private int agencia;
    private Cliente titular;
    private String tipoConta;
   protected   double saldo;
    private int numero;
    private int totalConta;

    public int getTotalConta() {
        return totalConta;
        //CASO QUEIRA SABER QUANTAS CONTAS FORAM CRIADAS
    }

    public  Conta(int agencia, int numero){
        this.agencia= agencia;
        this.numero = numero;
        totalConta++;
    }
    public void Saca(double valor) {

    }

    public void deposita(double valor)  {
        if (valor<=0) {
            throw new Excecao("Valor invalido, reinicie a operação");

        }  else
            this.saldo += valor ;
            System.out.println("Saldo Atual:" +saldo);
        }

    public int getAgencia() {
        return agencia;
    }


    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }
    public void transfere(double valor,Conta Contadestino){
        if(valor<0){
            throw new Excecao("Valor invalido de transferencia, valor menor que zero.\nReinicie a operaçao");
        }

        else if(valor>this.saldo){
            throw new Excecao("Valor invalido de transferencia, valor maior que o saldo.\nReinicie a operaçao");

        }
        else
            Contadestino.saldo+= valor;
            this.saldo-=valor;

    }
}
