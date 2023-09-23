package questão03;

public class ContaBancaria {
	private double saldo;
	

public ContaBancaria(double saldoP) {
	if(saldoP >=0) {
		this.saldo = saldoP;
	}else {
		this.saldo = 0;
	}
	
}
public void depositar(double valor) {
	if(valor > 0) {
		saldo = saldo + valor;
		System.out.println("o valor de " + valor + "foi realizado com sucesso");
	}else {
		System.out.println("o deposito falhou");
	}
}

 public void sacar(double valor) {
	 if(valor > 0) {
		 if (saldo >= valor) {
			 saldo -= valor;
			 System.out.println("Saque de "+ valor +"realizado com sucesso.");
		 }else {
			 System.out.println("saldo insuficiente para o saque");
		 }
	 }else {
		 System.out.println("Valor de saque inválido.");
	 }
 }
 public double getSaldo() {
	 return saldo;
 }
}
