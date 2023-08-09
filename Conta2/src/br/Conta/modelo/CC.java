package br.Conta.modelo;

import excecao.Excecao;

public class CC extends Conta{
    private double taxa = 6.00;
    public CC(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void Saca(double valor) throws Excecao {
        if(this.saldo <valor){
            throw new Excecao("Valor invalido. . Primeiro faça um deposito para obter saque:");
        }
        else if (taxa+valor>this.saldo){
            System.out.println("É necessário um valor de taxa");
        }
        else
            System.out.println("Valor adicional de 6.00 para conta poupança");
            System.out.println( this.saldo -=valor+taxa);

    }

    }


