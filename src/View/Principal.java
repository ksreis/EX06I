package View;
import Controller.Somar;

public class Principal {

public static void main(String[] args) {
    int n = 8;
    double resul = Somar.sRec(n);
    System.out.printf("A soma até %d: %.5f", n, resul);
	}
}