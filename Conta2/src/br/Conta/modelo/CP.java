package br.Conta.modelo;

import excecao.Excecao;

public class CP extends Conta{
    private double taxa = 5.50;
    public CP(int agencia, int numero) {
        super(agencia, numero);
    }
    public void Saca(double valor) throws Excecao {
        if(this.saldo <valor){
            throw new Excecao("Valor invalido. . Primeiro faça um deposito para obter saque:");
        }
        else if (taxa+valor>this.saldo){
            System.out.println("É necessário um valor de taxa");
        }
            else
        System.out.println( this.saldo -=valor+taxa);

    }
}
