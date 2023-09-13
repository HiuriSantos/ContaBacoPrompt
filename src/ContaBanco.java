import java.util.Scanner;

public class ContaBanco{
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem Vindo!");
        System.out.println("Vamos Criar Sua Conta Bancaria!");
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        contaTerminal.setNumero(numero);
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();
        scanner.nextLine();
        contaTerminal.setAgencia(agencia);
        System.out.println("Por favor, digite o seu nome Completo!");
        String nome = scanner.nextLine();
        contaTerminal.setNome(nome);
        System.out.println("Por favor, adicione um saldo inicial para abertura da conta");
        double saldo = scanner.nextDouble();
        contaTerminal.setSaldo(saldo);
        System.out.println("Olá " + contaTerminal.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                contaTerminal.getAgencia() + " conta " + contaTerminal.getNumero() + " e seu saldo " + contaTerminal.getSaldo() + " já está disponível para saque!");
    }
}