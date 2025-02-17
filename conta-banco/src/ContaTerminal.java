import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        final Scanner scan = new Scanner(System.in);
        final Scanner scanName = new Scanner(System.in);
        
        try { 
            // Entrada do número da agência
            System.out.print("Por favor, digite o número da agência: \n");
            final String agCliente = scan.nextLine();

            // Entrada do número da conta
            System.out.print("Por favor, digite o número da conta-corrente: \n");
            final int ccCliente = scan.nextInt();

            // Entrada do nome do cliente
            System.out.print("Por favor, digite o seu nome: \n");
            final String nmeCliente = scanName.nextLine().toUpperCase();

            // Entrada do saldo do cliente
            System.out.print("Por favor, digite o depósito inicial: \n");
            final double ccSaldo = scan.nextDouble();

            System.out.println("\n----------------------------------------- INFORMACOES GERENCIAIS -----------------------------------------");
            /* 
            //System.out.println("Olá " + nmeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agCliente + ", conta " + ccCliente + " e seu saldo " + ccSaldo + " já está disponível para saque!");
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %,.2f já está disponível para saque!", 
            nmeCliente, agCliente, ccCliente, ccSaldo);
            */

            System.out.printf("\nOlá, %s! Obrigado por criar uma conta em nosso banco!", nmeCliente);
            System.out.printf("\nAgência: %s", agCliente);
            System.out.printf("\nConta Corrente: %s", ccCliente);
            System.out.printf("\nSaldo disponível: %,.2f", ccSaldo);

            System.out.println("\n\n----------------------------------------- CONTA CRIADA COM SUCESSO -----------------------------------------");
            System.out.println("\n---------------------------------------------- FIM DA EXECUÇÃO ---------------------------------------------");

        } catch (InputMismatchException e) {
            System.out.printf("Entrada inválida!\n");
            System.out.printf("--- Aplicação encerrada! ---");
        }
        scan.close();
        scanName.close();
    }
}
