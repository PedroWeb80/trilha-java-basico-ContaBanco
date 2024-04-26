import java.util.Scanner;

import edu.pedro.models.ContaTerminal;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor digite o número da conta ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite a sua agência ");
            String agencia = sc.nextLine();

            System.out.println("Digite seu nome completo");
            String nome = sc.nextLine();

            System.out.println("Digite seu saldo inicial");
            double saldo = sc.nextDouble();
            
            ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);
            
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," + 
            "sua agência é %s,\n conta %d e seu saldo R$ %.2f já está disponível para saque",
            conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());

            sc.close();
        } catch (Exception ex) {
            System.out.println("Erro " + ex);
        }
    }
}
