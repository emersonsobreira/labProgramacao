package questão06;

public class Circulo {
    private double raio;
    double area;


public double calcularArea(){
    double area = Math.PI * raio * raio;
    return area;
}

public Circulo(double raio) {
    this.raio = raio;
}


}