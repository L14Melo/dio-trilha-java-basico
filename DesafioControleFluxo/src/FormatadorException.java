public class FormatadorException {
    public static void main(String[] args) {
        }
        
        static int contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{

            if ( parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        return contar(parametroUm, parametroDois);
}      

}
