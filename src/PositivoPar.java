public class PositivoPar {
    public static boolean Positivo_Par(int num) {
        boolean resultado;
        String ultimoNumero = Integer.toBinaryString(num);

        // todo numero par e 0 no final
        if(ultimoNumero .charAt(ultimoNumero .length()-1) == '0'){
            
            // estou jogando o 1 para o final, ja que um numero inteiro tem 32 "casas bit", e o numero inserido quando for feito o AND ja com o valor 1 deslocado para casa 31, irei ter o 0 se for positivo
            // ja que o AND so adiciona 1 se for 1 na mesma casa bit em ambos numeros, assim so um numero muito grande positivamente que ocupasse todas as casas bit ou um numero negativo que o resuldado daria 1
            if ((num & (1 << 31)) == 0) {
                resultado = true;
            }else{
                resultado = false;
            }
            
        } else {
            resultado = false;
        }

        return resultado;
    }
    public static void main (String[] args){
        int num = 100;

        boolean resultado = Positivo_Par(num);

        if(resultado == true){
            System.out.println("O numero e positivo e par!" );
        } else {
            System.out.println("O numero não tem o resultado desejado!" );
        }
        
    }
}
