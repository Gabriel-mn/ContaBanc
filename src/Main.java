import br.Conta.modelo.CC;
import br.Conta.modelo.CP;
import br.Conta.modelo.Cliente;
import br.Conta.modelo.Conta;
import excecao.Excecao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Excecao {
        Scanner leia = new Scanner(System.in);
        CP contaGabriel = new CP(154, 25);
        Conta contaHeloisa = new CC(155, 244);
        Cliente cliente = new Cliente();
        cliente.setDados("""
                Jorge
                30/04/2002
                4002-8922
                """);
        contaGabriel.setTitular(cliente);
        //contaGabriel.setSaldo(150);
        contaGabriel.setTipoConta("Conta Corrente");

//
//        System.out.println(contaGabriel.getTitular().getDados());
//        System.out.print("Seu tipo de contaGabriel é: "  +contaGabriel.getTipoConta() + "\nNumero da contaGabriel: " +contaGabriel.getNumero()
//                + "\nAgencia: " +contaGabriel.getAgencia());
//        System.out.println(contaGabriel.getNumero());
//        System.out.println(contaGabriel.getAgencia());
//        System.out.println("valor a ser transferido");
//        int valor1 = leia.nextInt();
//       contaGabriel.transfere(valor1, contaHeloisa);
//       // System.out.println("Conta 2:" +contaHeloisa.getSaldo());
////        contaGabriel.deposita(5);
////        contaGabriel.getSaldo();
////        try{
////            contaGabriel.Saca(50);
////        }catch(Excecao excecao){
////            System.out.println(excecao.getMessage());
////        }
////
//
//    }
        String varia;
        int numero;
        System.out.println("bom Dia");
        System.out.println("Selecione uma das opçoes");

            do {
                System.out.println("""
                        1-Sacar
                        2- Depositar
                        3- Transferir
                        4- Encerrar
                        5- Mostra Dados""");
                varia = leia.nextLine();
                try {
                    if (varia.equals("1")) {
                        System.out.println("Me dê o valor de saque.\nValor adicional de taxa: 6.50 para " +
                                "contas correntes. ");
                        numero = leia.nextInt();
                        contaGabriel.Saca(numero);
                    }
                }catch(Excecao ex){
                    System.out.println(ex.getMessage());
                }

                try {
                    if (varia.equals("2")) {
                        System.out.println("me dê o valor de deposito");
                        numero = leia.nextInt();
                        contaGabriel.deposita(numero);
                    }
                }catch(Excecao ex){
                    System.out.println(ex.getMessage());
                }

                try {
                    if (varia.equals("3")) {
                        System.out.println("me dê o valor de transferência");
                        numero = leia.nextInt();
                        contaGabriel.transfere(numero, contaHeloisa, contaGabriel);
                        System.out.println(contaGabriel.getSaldo());
                    }
                }catch(Excecao ex) {
                    System.out.println(ex.getMessage());
                }
                if(varia.equals("5")){
                    System.out.println(contaGabriel.getTitular().getDados()+"Saldo:" +contaGabriel.getSaldo());
                }


            }while(varia.equals("4") ==false);
        }
        }




