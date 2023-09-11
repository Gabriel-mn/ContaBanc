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
        contaGabriel.setTipoConta("Conta Poupança");

        int varia;
        int numero;
        System.out.println("bom Dia");
        System.out.println("Selecione uma das opçoes");

            do {
                System.out.println("""
                        1-Sacar.
                        2- Depositar.
                        3- Transferir.
                        4- Mostrar Dados.
                        5- Encerrar.""");
                varia = leia.nextLine();
                try {
                    if (varia=1)) {
                        System.out.println("Me dê o valor de saque.\nValor adicional de taxa: 6.50 para " +
                                "contas correntes. ");
                        numero = leia.nextInt();
                        contaGabriel.Saca(numero);
                    }
                }catch(Excecao ex){
                    System.out.println(ex.getMessage());
                }

                try {
                    if (varia=2)) {
                        System.out.println("me dê o valor de deposito");
                        numero = leia.nextInt();
                        contaGabriel.deposita(numero);
                    }
                }catch(Excecao ex){
                    System.out.println(ex.getMessage());
                }

                try {
                    if (varia=3) {
                        System.out.println("me dê o valor de transferência");
                        numero = leia.nextInt();
                        contaGabriel.transfere(numero, contaHeloisa);
                        System.out.println(contaGabriel.getSaldo());
                    }
                }catch(Excecao ex) {
                    System.out.println(ex.getMessage());
                }
                if(varia=4){
                    System.out.println(contaGabriel.getTitular().getDados()+"Saldo:" +contaGabriel.getSaldo()+" " +
                                    "\nConta: "+
                            contaGabriel.getTipoConta()+ "\nNúmero da conta: " +contaGabriel.getNumero()+ "\nAgencia: " +
                            contaGabriel.getAgencia());
                }


            }while(varia!=5);
        }
        }




