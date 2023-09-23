package questao07;

public class Principal {
    public static void main(String[] args){
        double saldoPositivo = 3500;
        double saldoNegativo = -100;

        double taxaPositiva = Banco.calcularTaxaJuros(saldoPositivo);
        double taxaNegativa = Banco.calcularTaxaJuros(saldoNegativo);


        System.out.println("Taxa de juros: " + taxaPositiva);
        System.out.println("Taxa de juros: " + taxaNegativa);
    }
    
}
