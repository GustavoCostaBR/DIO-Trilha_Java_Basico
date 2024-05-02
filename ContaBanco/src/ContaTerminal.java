import java.util.Scanner;

public class ContaTerminal {

    public static void main(String [] args) {
        int numero;
        String agencia;

        String nomeCliente;

        double saldo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, informe o número da conta!");
        numero = Integer.parseInt(teclado.nextLine());
        System.out.println("Por favor, informe o número da agência!");
        agencia = teclado.nextLine();
        System.out.println("Por favor, informe o nome do cliente!");
        nomeCliente = teclado.nextLine();
        System.out.println("Por favor, informe o saldo!");
        saldo = Double.parseDouble(teclado.nextLine());

        System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\".");

    }
}
