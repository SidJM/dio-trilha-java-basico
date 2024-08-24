import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {  
       
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;  
        String numerodaconta;        
        String nomeCliente;
        String sobrenomeCliente;
        double saldo;

        System.out.println("-------CONTA BANCÁRIA-----------");
        System.out.println();
        System.out.println("Agora digite o numero da Agência: (XXXX)");
        agencia = sc.next();

        System.out.println("por favor, digite o numero da Conta: (XXX-X)");
        numerodaconta = sc.next();

        System.out.println("me informe seu nome:");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("me informe seu Sobrenome:");
        sobrenomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Agora me infome seu saldo atual: ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá %S %S, obrigado por criar uma conta em "
                        + "nosso Banco, sua Agência é %s, "
                        + " numero da conta %s  e seu saldo %.2f, já está disponível"
                        + " para saque.", nomeCliente, sobrenomeCliente, agencia, numerodaconta, saldo);

    sc.close();       
      
    }
}
