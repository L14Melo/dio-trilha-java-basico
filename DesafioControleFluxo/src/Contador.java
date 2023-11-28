import java.util.Scanner;
public class Contador {
    
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

    try {
            contar (parametroUm , parametroDois);

}

    catch (ParametrosInvalidosException e) {
        if (parametroUm>parametroDois) {
            
        }
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");}
        
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosException();
            
            int contagem = parametroDois - parametroUm;
            int sum = 0;

            while (sum < contagem) {
                System.out.println("Imprimindo Número " + sum ++);
            }
                
           
            }
         


	}


