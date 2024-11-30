package Lista02;

public class Exercicio010 {
	
	 public double calcularMedia(double numero1, double numero2, double numero3) {
	        return (numero1 + numero2 + numero3) / 3;
	    }

	    public static void main(String[] args) {
	        Calculadora calculadora = new Calculadora();
	        double resultado = calculadora.calcularMedia(7.5, 8.0, 9.5);
	        System.out.println("A média é: " + resultado);
	    }

}
