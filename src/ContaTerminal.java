import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome: ");
        String NomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o número da sua conta: ");
        int NumeroConta = sc.nextInt();

        /*Quando você lê alguma variável do tipo int usando o "sc.nextInt()",
        o programa acaba deixando o resto da linha no analisador/buffer (mesmo que esteja em branco),
        então quando você chama "sc.nextLine()", você está lendo o resto desta primeira linha
        e como consequência, ele simplesmente pula para onde a entrada deve ir,
        ou seja, "sc.nextLine()" não irá ler a variável do tipo String "Agencia".*/

        // Para corrigir isso, deve-se chamar "sc.nextLine()" antes de imprimir o próximo prompt
        // para descartar o resto da linha.

        // Fonte: Stackoverflow (https://stackoverflow.com/questions/5966599/java-scanner-string-input)

        sc.nextLine();

        System.out.print("Por favor, digite a agência: ");
        String Agencia = sc.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double Saldo = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00"); // Adiciona duas casas decimais depois da vírgula

        System.out.println("Olá, " + NomeCliente + ", obrigado por criar uma conta em nosso banco. " +
                "A sua agência é " + Agencia +
                ", a sua conta é " + NumeroConta +
                " e o seu saldo é de R$ " + df.format(Saldo) +
                " já está disponível para saque.");
    }

}
