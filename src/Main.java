import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero da conta");
        int numeroConta = leitor.nextInt();

        System.out.println("Digite o codigo da agencia");
        String agenciaConta = leitor.next();

        System.out.println("Digite seu nome");
        String nomeCliente = leitor.next();

        System.out.println("Informe seu saldo");
        double saldo = leitor.nextDouble();

System.out.println("Olá "+nomeCliente+" ,obrigado por criar uma conta em nosso banco, sua agência é "+agenciaConta+" ,conta "+numeroConta+" e seu " +
        "saldo "+saldo+" já está disponivel para saque.");
    }
}