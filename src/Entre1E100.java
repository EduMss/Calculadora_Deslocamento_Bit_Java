public class Entre1E100 {
    public static String Entre(int numInicial, int numFinal, int num){
        String resultado;

        //Se o valor "num" - o valor "numInicial" der um numero negativo, quando eu mover ele 31 casas bit, o resultado dele sera 1,
        //pois somente numeros negativos ou numeros muitos grandes positivamente que 
        //possuem 1 na casa 32 do bit, assim quando eu andar 31 casas para direita ainda tera 1 bit, resultando o valor 1
        if ((num - numInicial) >> 31 == 0 && (numFinal - num) >> 31 == 0) {
            resultado = " esta entre ";
          } else {
            resultado = " não esta entre ";
          }

        return resultado;
    }
    public static void main(String[] args) {
        int num = 100;

        String resultado = Entre(1, 100, num);

        System.out.println("o numero " + num + resultado + " 1 e 100" );
    }


}
