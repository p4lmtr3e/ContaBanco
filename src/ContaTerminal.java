import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args){
        
        Scanner to_scan = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta!");
        int numConta = to_scan.nextInt();
        to_scan.nextLine();
        
        System.out.println("Por favor, digite a agência!");
        String agencia = to_scan.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = to_scan.nextLine();

        System.out.println("Por favor, digite o saldo!");
        float saldo = to_scan.nextFloat();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, ",nomeCliente);
        System.out.printf("sua agência é %s, ",agencia);
        System.out.printf("conta %d e seu saldo %.2f já está disponível para saque.",numConta,saldo);

    }
}
