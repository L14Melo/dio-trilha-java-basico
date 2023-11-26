import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Random rand = new Random();

        int numero = 10000;
        int int_random = rand.nextInt(numero);

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome:");
        String nome = scanner.next();

        double saldo = 237.48;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + " conta " + int_random + " e seu saldo " + saldo + 
        " já está disponível para saque.");


    }
}
