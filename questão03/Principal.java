package questão03;

public class Principal {
    public static void main(String[] args){
    ContaBancaria conta = new ContaBancaria(0);

    

    System.out.println("Saldo inicial" +conta.getSaldo());
        conta.depositar(250);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        conta.sacar(30);
        System.out.println("Saldo após saque: " + conta.getSaldo());

        conta.sacar(5);
        System.out.println("Saldo após tentativa de saque: " + conta.getSaldo());

        conta.depositar(-30); 
        System.out.println("Saldo após tentativa de depósito inválido: " + conta.getSaldo());
        

    }
}

