import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}