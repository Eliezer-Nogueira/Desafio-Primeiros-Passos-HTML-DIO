import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String mensagemSaida ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
        String Conta = scan.nextLine();

        System.out.println("Digite sua agência: ");
        int agencia = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite seu nome completo: ");
        String nomeCliente = scan.nextLine();

        System.out.println("Valor para Saque:  ");
        Double saldo = scan.nextDouble();
       
        mensagemSaida = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, Conta, saldo);
        scan.close();
        System.out.println(mensagemSaida);
    }
}
