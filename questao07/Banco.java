package questao07;

public class Banco {
    public static double calcularTaxaJuros(double saldo) {
        double taxaPositiva = 0.05;
        double taxaNegativa = 0.10;

        if (saldo >= 0) {
            double a = saldo * taxaPositiva;
            return a;

        }else{
            double b = saldo * taxaNegativa;
            return b;
        }
    }    
}
